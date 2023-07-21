package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.xml.crypto.Data;

import model.ThiSinh;
import model.Tinh;
import view.QLSVView;

public class QLSVController implements ActionListener {
	private QLSVView qlsvView;

	
	
	public QLSVController(QLSVView qlsvView) {
		this.qlsvView = qlsvView;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		String actionCm = e.getActionCommand();
		JOptionPane.showConfirmDialog(qlsvView, "Bạn vừa nhấn vào: "+actionCm);
		
		if(actionCm.equals("Thêm")) {
			this.qlsvView.xoaFrom();
			this.qlsvView.model.setLuaChon("Thêm");
		}else if(actionCm.equals("Xóa")) {
			this.qlsvView.thucHienXoa();
		}else if(actionCm.equals("Cập nhập")) {
			this.qlsvView.hienThiThongTinSVDaChon();
		}else if(actionCm.equals("Lưu")) {
			try {
				
				this.qlsvView.thucHienThemSV();


			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}else if(actionCm.equals("Hủy bỏ")) {
			this.qlsvView.thucHienXoa();
		}else if(actionCm.equals("TIM")) {
			this.qlsvView.thucHienTim();
		}else if(actionCm.equals("Huy Tim")) {
			this.qlsvView.thucHienHuyTim();
		}
		
	}
	
	

}
