package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controller.TimKiemListerner;
import model.TimKiemModel;

public class TimKiemView extends JFrame {
	private TimKiemModel timKiemModel;
	private JLabel jLabel_vanban;
	private JTextArea jTextArea;
	private JLabel jLabel_tuKhoa;
	private JTextField jTextField_tuKhoa;
	private JLabel jLabel_ketqua;

	public TimKiemView() throws HeadlessException {
		this.timKiemModel = new TimKiemModel();
		this.init();
	}

	private void init() {
		this.setTitle("Tìm kiếm");
		this.setSize(800,600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Font font = new Font("Arial", Font.BOLD, 40);
		jLabel_vanban = new JLabel("Van ban");
		jLabel_vanban.setFont(font);
		jTextArea = new JTextArea(100,100);
		jTextArea.setFont(font);
		
		JScrollPane jScrollPane = new JScrollPane();
		jScrollPane.setViewportView(jTextArea);
		
		

		TimKiemListerner timKiemListerner = new TimKiemListerner(this);
		
		jLabel_tuKhoa = new JLabel("Tu khoa");
		jLabel_tuKhoa.setFont(font);
		
		jTextField_tuKhoa = new JTextField();
		jTextField_tuKhoa.setFont(font);
		
		JButton jButton_thongke = new JButton("Thong ke");
		jButton_thongke.setFont(font);
		jButton_thongke.addActionListener(timKiemListerner);
		jButton_thongke.setBackground(Color.blue);
		
		jLabel_ketqua = new JLabel();
		jLabel_ketqua.setBackground(Color.yellow);
		jLabel_ketqua.setFont(font);
		jLabel_ketqua.setOpaque(true);

		
		JPanel jPanel_footer = new JPanel();
		jPanel_footer.setLayout(new GridLayout(2,2));
		jPanel_footer.add(jLabel_tuKhoa);
		jPanel_footer.add(jTextField_tuKhoa);
		jPanel_footer.add(jButton_thongke);
		jPanel_footer.add(jLabel_ketqua);
		
		this.setLayout(new BorderLayout());
		this.add(jLabel_vanban, BorderLayout.NORTH);
		this.add(jScrollPane, BorderLayout.CENTER);
		this.add(jPanel_footer, BorderLayout.SOUTH);
		
		
		
		this.setVisible(true);
		
	}
	
	public void timKiem() {
		this.timKiemModel.setVanBan(jTextArea.getText());
		this.timKiemModel.setTuKhoa(jTextField_tuKhoa.getText());
		this.timKiemModel.timKiem();
		this.jLabel_ketqua.setText(this.timKiemModel.getKetQua());
	}
	

}
