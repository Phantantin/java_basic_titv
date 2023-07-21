package view;

import java.awt.Button;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ViDu_FlowLayout extends JFrame {
	
	public ViDu_FlowLayout() {
		this.setTitle("ViDu_FlowLayout");
		this.setSize(600,400);
		// set nằm giữa
		this.setLocationRelativeTo(null);
		// setLayout
		FlowLayout flowLayout = new FlowLayout();
		FlowLayout flowLayout_1 = new FlowLayout(FlowLayout.CENTER, 50, 50);
		
		this.setLayout(flowLayout_1);
		
		JButton button1 = new JButton("Button1");
		JButton button2 = new JButton("Button2");
		JButton button3 = new JButton("Button3");
		
		//
		this.add(button1);
		this.add(button2);
		this.add(button3);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		new ViDu_FlowLayout();
	}

}
