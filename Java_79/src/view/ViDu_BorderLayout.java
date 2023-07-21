package view;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ViDu_BorderLayout extends JFrame {
	
	public ViDu_BorderLayout() {
		this.setTitle("ViDu_FlowLayout");
		this.setSize(600,400);
		// set nằm giữa
		this.setLocationRelativeTo(null);
		// setLayout
		BorderLayout borderLayout = new BorderLayout();
		BorderLayout borderLayout_1 = new BorderLayout(50,50);
		
		this.setLayout(borderLayout);
		
		JButton button1 = new JButton("Button1");
		JButton button2 = new JButton("Button2");
		JButton button3 = new JButton("Button3");
		JButton button4 = new JButton("Button4");
		JButton button5 = new JButton("Button5");
		
		//
		this.add(button1, BorderLayout.NORTH);
		this.add(button2, BorderLayout.SOUTH);
		this.add(button3, BorderLayout.WEST);
		this.add(button4, BorderLayout.EAST);
		this.add(button5, BorderLayout.CENTER);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		new ViDu_BorderLayout();
	}

}
