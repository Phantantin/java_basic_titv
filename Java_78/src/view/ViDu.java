package view;

import javax.swing.JFrame;

public class ViDu {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		
		// gán kích cở
		jf.setSize(600,400);
		
		// gán tên
		jf.setTitle("Ví dụ về JFram");

		// gán vị trí
		jf.setLocation(300, 300);

		// thoát chương trình khi đóng cửa sổ
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// cho hiển thị
		jf.setVisible(true);
	}

}
