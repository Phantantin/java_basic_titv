package view;

import javax.swing.JFrame;

public class MyWindow extends JFrame {
	public MyWindow() {
		
	}
	
	public void show1() {
		this.setVisible(true);
	}
	
	public void show(String title) {
		this.setTitle(title);
		this.setVisible(true);
	}

	
	public static void main(String[] args) {
		MyWindow myWindow = new MyWindow();
		myWindow.show1();
	}
}
