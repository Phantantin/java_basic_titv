package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.QLSVModel;
import model.ThiSinh;
import model.Tinh;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import controller.QLSVController;

import javax.swing.JRadioButton;

public class QLSVView extends JFrame {

	private JPanel contentPane;
	public QLSVModel model;
	public JTextField textField_maSV_tim;
	public JTable table;
	public JTextField textField_ThongTin_MaThiSinh;
	public JTextField textField_hoVaTen;
	public JTextField textField_ngaySinh;
	public JTextField textField_diem1;
	public JTextField textField_diem2;
	public JTextField textField_diem3;
	public JRadioButton radio_Nam;
	public ButtonGroup btn_gioiTinh;
	public JComboBox comboBox_ThonTin_queQuan;
	public JRadioButton radio_Nu;
	public JButton btn_huyTim;
	public JButton btn_tim;
	public JComboBox comboBox_queQuan_tim;
	private JMenu mmAbout;
	private JMenuItem mmAboutMe;
	private JMenuItem mmOpen;
	private JMenuItem mmSave;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QLSVView frame = new QLSVView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	public QLSVView() {
		this.model = new QLSVModel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 963, 667);
		
		ActionListener action = new QLSVController(this);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		mnNewMenu.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuBar.add(mnNewMenu);
		
		mmOpen = new JMenuItem("Open");
		mmOpen.addActionListener(action);
		mmOpen.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mnNewMenu.add(mmOpen);
		
		mmSave = new JMenuItem("Save");
		mmSave.addActionListener(action);
		mmSave.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mnNewMenu.add(mmSave);
		
		JSeparator separator = new JSeparator();
		mnNewMenu.add(separator);
		
		JMenuItem mmExit = new JMenuItem("Exit");
		mmExit.addActionListener(action);
		mmExit.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mnNewMenu.add(mmExit);
		
		mmAbout = new JMenu("About");
		mmAbout.addActionListener(action);
		mmAbout.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuBar.add(mmAbout);
		
		mmAboutMe = new JMenuItem("About Me");
		mmAboutMe.addActionListener(action);
		mmAboutMe.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mmAbout.add(mmAboutMe);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel jlab_queQuan = new JLabel("Que Quan");
		jlab_queQuan.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jlab_queQuan.setBounds(10, 11, 101, 40);
		contentPane.add(jlab_queQuan);
		
		JLabel jlab_maSinhVien = new JLabel("Ma SV");
		jlab_maSinhVien.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jlab_maSinhVien.setBounds(361, 11, 101, 40);
		contentPane.add(jlab_maSinhVien);
		
		textField_maSV_tim = new JTextField();
		textField_maSV_tim.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_maSV_tim.setColumns(10);
		textField_maSV_tim.setBounds(435, 13, 178, 37);
		contentPane.add(textField_maSV_tim);
		
		btn_tim = new JButton("TIM");
		btn_tim.addActionListener(action);
		btn_tim.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_tim.setBounds(668, 11, 114, 40);
		contentPane.add(btn_tim);
		
		comboBox_queQuan_tim = new JComboBox();
		
		ArrayList<Tinh> listTinh = Tinh.getDSTinh();
		comboBox_queQuan_tim.addItem(" ");
		for (Tinh tinh : listTinh) {
			comboBox_queQuan_tim.addItem(tinh.getTenTinh());
		}
		
		comboBox_queQuan_tim.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox_queQuan_tim.setBounds(121, 11, 194, 40);
		contentPane.add(comboBox_queQuan_tim);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 63, 932, 5);
		contentPane.add(separator_1);
		
		JLabel jlab_danhSachsv = new JLabel("Danh sach SV");
		jlab_danhSachsv.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jlab_danhSachsv.setBounds(10, 62, 130, 46);
		contentPane.add(jlab_danhSachsv);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 18));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Ma SV", "Ho Ten", "Que Quan", "Ng\u00E0y Sinh", "Gioi Tinh", "Diem 1", "Diem 2", "Diem 3"
			}
		));
		
		table.setRowHeight(30);
		
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 99, 929, 137);
		contentPane.add(scrollPane);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(10, 247, 932, 5);
		contentPane.add(separator_1_1);
		
		JLabel jlab_thongTinThiSinh = new JLabel("Thong Tin SV");
		jlab_thongTinThiSinh.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jlab_thongTinThiSinh.setBounds(10, 247, 122, 37);
		contentPane.add(jlab_thongTinThiSinh);
		
		JLabel jlab_ThongTin_maSinhVien = new JLabel("Ma SV");
		jlab_ThongTin_maSinhVien.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jlab_ThongTin_maSinhVien.setBounds(10, 281, 101, 40);
		contentPane.add(jlab_ThongTin_maSinhVien);
		
		textField_ThongTin_MaThiSinh = new JTextField();
		textField_ThongTin_MaThiSinh.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_ThongTin_MaThiSinh.setColumns(10);
		textField_ThongTin_MaThiSinh.setBounds(121, 281, 245, 40);
		contentPane.add(textField_ThongTin_MaThiSinh);
		
		JLabel jlab_ThongTin_hoVaTen = new JLabel("Ho Va Ten");
		jlab_ThongTin_hoVaTen.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jlab_ThongTin_hoVaTen.setBounds(10, 332, 101, 40);
		contentPane.add(jlab_ThongTin_hoVaTen);
		
		textField_hoVaTen = new JTextField();
		textField_hoVaTen.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_hoVaTen.setColumns(10);
		textField_hoVaTen.setBounds(121, 332, 245, 40);
		contentPane.add(textField_hoVaTen);
		
		JLabel jlab_ThongTin_queQuan = new JLabel("Que Quan");
		jlab_ThongTin_queQuan.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jlab_ThongTin_queQuan.setBounds(10, 383, 101, 40);
		contentPane.add(jlab_ThongTin_queQuan);
		
		JLabel jlab_ThongTin_ngaySinh = new JLabel("Ngay Sinh");
		jlab_ThongTin_ngaySinh.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jlab_ThongTin_ngaySinh.setBounds(10, 434, 101, 40);
		contentPane.add(jlab_ThongTin_ngaySinh);
		
		textField_ngaySinh = new JTextField();
		textField_ngaySinh.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_ngaySinh.setColumns(10);
		textField_ngaySinh.setBounds(121, 434, 245, 40);
		contentPane.add(textField_ngaySinh);
		
		comboBox_ThonTin_queQuan = new JComboBox();
		
		ArrayList<Tinh> list_Thongtin_Tinh = Tinh.getDSTinh();
		comboBox_ThonTin_queQuan.addItem(" ");
		for (Tinh tinh : list_Thongtin_Tinh) {
			comboBox_ThonTin_queQuan.addItem(tinh.getTenTinh());
		}
		
		comboBox_ThonTin_queQuan.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox_ThonTin_queQuan.setBounds(121, 383, 245, 40);
		contentPane.add(comboBox_ThonTin_queQuan);
		
		JLabel jlab_ThongTin_gioiTinh = new JLabel("Gioi Tinh");
		jlab_ThongTin_gioiTinh.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jlab_ThongTin_gioiTinh.setBounds(475, 281, 101, 40);
		contentPane.add(jlab_ThongTin_gioiTinh);
		
		radio_Nam = new JRadioButton("Nam");
		radio_Nam.setFont(new Font("Tahoma", Font.PLAIN, 18));
		radio_Nam.setBounds(606, 293, 111, 23);
		contentPane.add(radio_Nam);
		
		radio_Nu = new JRadioButton("Nữ");
		radio_Nu.setFont(new Font("Tahoma", Font.PLAIN, 18));
		radio_Nu.setBounds(724, 293, 111, 23);
		contentPane.add(radio_Nu);
		
		btn_gioiTinh = new ButtonGroup();
		btn_gioiTinh.add(radio_Nam);
		btn_gioiTinh.add(radio_Nu);
		
		JLabel jlab_ThongTin_diem1 = new JLabel("Diem 1");
		jlab_ThongTin_diem1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jlab_ThongTin_diem1.setBounds(475, 332, 101, 40);
		contentPane.add(jlab_ThongTin_diem1);
		
		textField_diem1 = new JTextField();
		textField_diem1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_diem1.setColumns(10);
		textField_diem1.setBounds(586, 332, 245, 40);
		contentPane.add(textField_diem1);
		
		JLabel jlab_ThongTin_diem2 = new JLabel("Diem 2");
		jlab_ThongTin_diem2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jlab_ThongTin_diem2.setBounds(475, 383, 101, 40);
		contentPane.add(jlab_ThongTin_diem2);
		
		textField_diem2 = new JTextField();
		textField_diem2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_diem2.setColumns(10);
		textField_diem2.setBounds(586, 383, 245, 40);
		contentPane.add(textField_diem2);
		
		JLabel jlab_ThongTin_diem3 = new JLabel("Diem 3");
		jlab_ThongTin_diem3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jlab_ThongTin_diem3.setBounds(475, 434, 101, 40);
		contentPane.add(jlab_ThongTin_diem3);
		
		textField_diem3 = new JTextField();
		textField_diem3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_diem3.setColumns(10);
		textField_diem3.setBounds(586, 434, 245, 40);
		contentPane.add(textField_diem3);
		
		JButton btn_them = new JButton("Thêm");
		btn_them.addActionListener(action);
		btn_them.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_them.setBounds(26, 518, 114, 40);
		contentPane.add(btn_them);
		
		JButton btn_xoa = new JButton("Xóa");
		btn_xoa.addActionListener(action);
		btn_xoa.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_xoa.setBounds(217, 518, 114, 40);
		contentPane.add(btn_xoa);
		
		JButton btn_capnhap = new JButton("Cập nhập");
		btn_capnhap.addActionListener(action);
		btn_capnhap.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_capnhap.setBounds(415, 518, 114, 40);
		contentPane.add(btn_capnhap);
		
		JButton btn_luu = new JButton("Lưu");
		btn_luu.addActionListener(action);
		btn_luu.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_luu.setBounds(603, 518, 114, 40);
		contentPane.add(btn_luu);
		
		JButton btn_huybo = new JButton("Hủy bỏ");
		btn_huybo.addActionListener(action);
		btn_huybo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_huybo.setBounds(794, 518, 114, 40);
		contentPane.add(btn_huybo);
		
		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setBounds(10, 500, 932, 5);
		contentPane.add(separator_1_1_1);
		
		btn_huyTim = new JButton("Huy Tim");
		btn_huyTim.addActionListener(action);
		btn_huyTim.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_huyTim.setBounds(809, 11, 114, 40);
		contentPane.add(btn_huyTim);
		
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public void xoaFrom() {
		textField_ThongTin_MaThiSinh.setText("");
		textField_hoVaTen.setText("");
		textField_ngaySinh.setText("");
		textField_maSV_tim.setText("");
		textField_diem1.setText("");
		textField_diem2.setText("");
		textField_diem3.setText("");
		comboBox_ThonTin_queQuan.setSelectedIndex(-1);
		btn_gioiTinh.clearSelection();
		
	}
	
	public void themSVVaoTable(ThiSinh ts) {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		model_table.addRow(new Object[] {
				ts.getMaThiSinh()+"",
				ts.getTenThiSinh(),
				ts.getTinh().getTenTinh(),
				ts.getNgaySinh().getDate()+"/"+(ts.getNgaySinh().getMonth()+1)+"/"+(ts.getNgaySinh().getYear()+1900),
				(ts.isGioiTinh()?"Nam":"Nữ"),
				ts.getDiemMon1()+"",
				ts.getDiemMon2()+"",
				ts.getDiemMon3()+""
		});
	}

	public void themHoacCapNhapSV(ThiSinh ts) {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		if(!this.model.kiemTraTonTai(ts)) {
			this.model.insert(ts);

			
			this.themSVVaoTable(ts);
		}else {
			this.model.update(ts);
			int soLuongDong = model_table.getRowCount();
			for (int i = 0; i < soLuongDong; i++) {
				String id= model_table.getValueAt(i, 0)+"";
				if(id.equals(ts.getMaThiSinh()+"")) {
					model_table.setValueAt(ts.getMaThiSinh()+"", i, 0);
					model_table.setValueAt(ts.getTenThiSinh()+"", i, 1);
					model_table.setValueAt(ts.getTinh().getTenTinh()+"", i, 2);
					model_table.setValueAt(ts.getNgaySinh().getDate()+"/"+(ts.getNgaySinh().getMonth()+1)+"/"+(ts.getNgaySinh().getYear()+1900)+"", i, 3);
					model_table.setValueAt((ts.isGioiTinh()?"Nam":"Nữ")+"", i, 4);
					model_table.setValueAt(ts.getDiemMon1()+"", i, 5);
					model_table.setValueAt(ts.getDiemMon2()+"", i, 6);
					model_table.setValueAt(ts.getDiemMon3()+"", i, 7);
				}
			}
		}
		
		
		
	}


	public ThiSinh getTinhSinhDaChon() {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		int i_row = table.getSelectedRow();
		
		
		int maThiSinh = Integer.valueOf(model_table.getValueAt(i_row, 0)+"");
		String tenThiSinh  = model_table.getValueAt(i_row, 1)+"";
		
		Tinh tinh_ten = Tinh.getTinhByTen(model_table.getValueAt(i_row, 2)+"");
		
		String s_ngaySinh = model_table.getValueAt(i_row, 3)+"";
		Date ngaySinh = new Date(s_ngaySinh);
		
		String textGioiTinh = model_table.getValueAt(i_row, 4)+"";
		
		boolean gioiTinh = textGioiTinh.endsWith("Nam");
		
		
		
		
		float diemMon1 = Float.valueOf(model_table.getValueAt(i_row, 5)+"");
		float diemMon2 = Float.valueOf(model_table.getValueAt(i_row, 6)+"");
		float diemMon3 = Float.valueOf(model_table.getValueAt(i_row, 7)+"");
		ThiSinh ts = new ThiSinh(maThiSinh, tenThiSinh, tinh_ten, ngaySinh, gioiTinh, diemMon1, diemMon2, diemMon3);
		return ts;
	}
	
	public void hienThiThongTinSVDaChon() {
		ThiSinh ts = getTinhSinhDaChon();
		
//		ThiSinh ts = new ThiSinh(maThiSinh, tenThiSinh, tinh_ten, ngaySinh, gioiTinh, diemMon1, diemMon2, diemMon3);
		this.textField_ThongTin_MaThiSinh.setText(ts.getMaThiSinh()+"");
		this.textField_hoVaTen.setText(ts.getTenThiSinh()+"");
		this.comboBox_ThonTin_queQuan.setSelectedItem(ts.getTinh().getTenTinh());
		String s_ngaySinh = ts.getNgaySinh().getDate()+"/"+(ts.getNgaySinh().getMonth()+1)+"/"+(ts.getNgaySinh().getYear()+1900);
		this.textField_ngaySinh.setText(s_ngaySinh+"");
		
		if(ts.isGioiTinh()) {
			radio_Nam.setSelected(true);
		}else {
			radio_Nu.setSelected(true);
		}
		this.textField_diem1.setText(ts.getDiemMon1()+"");
		this.textField_diem2.setText(ts.getDiemMon2()+"");
		this.textField_diem3.setText(ts.getDiemMon3()+"");

	}

	public void thucHienXoa() {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		int i_row = table.getSelectedRow();
		int luaChon = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn xóa dòng đã chọn");
		if(luaChon == JOptionPane.YES_OPTION) {
			ThiSinh ts = getTinhSinhDaChon();
			this.model.delete(ts);
			model_table.removeRow(i_row);
		}
		
	}

	public void thucHienThemSV() {
		// GET du lieu
		int maThiSinh = Integer.valueOf(this.textField_ThongTin_MaThiSinh.getText());
		String tenThiSinh  = this.textField_hoVaTen.getText();
		int tinh = this.comboBox_ThonTin_queQuan.getSelectedIndex()-1;
		Tinh tinh_1 = Tinh.getTinhById(tinh);
		Date ngaySinh = new Date(this.textField_ngaySinh.getText());
		
		boolean gioiTinh = true;
//		String chonGioiTinh = this.qlsvView.btn_gioiTinh.getSelection()+"";
		if(this.radio_Nam.isSelected()) {
			gioiTinh = true;
		}else if(this.radio_Nu.isSelected()) {
			gioiTinh = false;
		}
		
		
		float diemMon1 = Float.valueOf(this.textField_diem1.getText());
		float diemMon2 = Float.valueOf(this.textField_diem2.getText());
		float diemMon3 = Float.valueOf(this.textField_diem3.getText());


		ThiSinh ts = new ThiSinh(maThiSinh, tenThiSinh, tinh_1, ngaySinh, gioiTinh, diemMon1, diemMon2, diemMon3);
		
		this.themHoacCapNhapSV(ts);
	}

	public void thucHienTim() {
		// goi ham huy tim kiem
		this.thucHienTaiLaiDuLieu();
		
		// thuc hien tim kiem
		int queQuan = this.comboBox_queQuan_tim.getSelectedIndex()-1;
		String maSV = this.textField_maSV_tim.getText();
		
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		
		int soLuongDong = model_table.getRowCount();
		Set<Integer> idCuaSVCanXoa = new TreeSet<Integer>();
		
		if(queQuan >=0) {
			Tinh tinhDaChon = Tinh.getTinhById(queQuan);

			for (int i = 0; i < soLuongDong; i++) {
				String tenTinh= model_table.getValueAt(i, 2)+"";
				String id= model_table.getValueAt(i, 0)+"";
				if(!tenTinh.equals(tinhDaChon.getTenTinh())) {
					idCuaSVCanXoa.add(Integer.valueOf(id));
					
				}
			}
		}
		if(maSV.length()>0) {
			for (int i = 0; i < soLuongDong; i++) {
				String id= model_table.getValueAt(i, 0)+"";
//				String maSVTrongBang= model_table.getValueAt(i, 0)+"";
				if(!id.equals(maSV)) {
					idCuaSVCanXoa.add(Integer.valueOf(id));
					
				}
			}
		}
		
		for (Integer idCanXoa : idCuaSVCanXoa) {
			System.out.println(idCanXoa);
			soLuongDong = model_table.getRowCount();
			
			for (int i = 0; i < soLuongDong; i++) {
				String idTrongBang= model_table.getValueAt(i, 0)+"";
				System.out.println("id trong bang: "+idTrongBang);
				if(idTrongBang.equals(idCanXoa.toString())) {
					System.out.println("Da xoa: "+i);
					try {
						model_table.removeRow(i);
					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				}
			}
		}
		
		
	}

	

	public void thucHienTaiLaiDuLieu() {
		while(true) {
			DefaultTableModel model_table = (DefaultTableModel) table.getModel();
			int soLuongDong = model_table.getRowCount();
			if(soLuongDong ==0)
				break;
			else {
				try {
					model_table.removeRow(0);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		
		for (ThiSinh ts : this.model.getDsThiSinh()) {
			this.themSVVaoTable(ts);
		}
		
	}

	public void hienThiAbout() {
		JOptionPane.showMessageDialog(this, "Phần mềm quản lý Sinh Viên");
		
	}

	public void thoatKhoiChuongTrinh() {

		int luaChon = JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát khơi chương trình không", "Exit", JOptionPane.YES_NO_OPTION);
		if(luaChon == JOptionPane.YES_OPTION) {
			
		System.exit(0);
		}	
	}
	
	public void saveFile(String path) {
		try {
			this.model.setTenFile(path);
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			for (ThiSinh ts : this.model.getDsThiSinh()) {
				oos.writeObject(ts);
			}
			oos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void thucHienSaveFile() {
		if(this.model.getTenFile().length()>0) {
			saveFile(this.model.getTenFile());
			
		}else {
			JFileChooser fc = new JFileChooser();
			int returnVal = fc.showSaveDialog(this);
			if(returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
				saveFile(file.getAbsolutePath());
				
				
			}
			
		}
}
	
	public void openFile(File file) {
		ArrayList<ThiSinh> ds = new ArrayList<>();
		try {
			this.model.setTenFile(file.getAbsolutePath());
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			ThiSinh ts = null;
			while((ts = (ThiSinh) ois.readObject()) !=null) {
				ds.add(ts);
			}
			
			ois.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		this.model.setDsThiSinh(ds);
	}

	public void thucHienOpenFile() {
		JFileChooser fc = new JFileChooser();
		int returnVal = fc.showOpenDialog(this);
		if(returnVal == JFileChooser.APPROVE_OPTION) {
			File file = fc.getSelectedFile();
			openFile(file);
			thucHienTaiLaiDuLieu();
		}
	}
}
