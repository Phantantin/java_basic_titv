package view;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ViDu_GrildLayout extends JFrame {
	
	public ViDu_GrildLayout() {
		this.setTitle("ViDu_FlowLayout");
		this.setSize(600,400);
		// set nằm giữa
		this.setLocationRelativeTo(null);
		// setLayout
		GridLayout GridLayout = new GridLayout();
		GridLayout GridLayout_1 = new GridLayout(4,4);
		GridLayout GridLayout_2 = new GridLayout(4,4, 25,25);
		
		this.setLayout(GridLayout_2);
		
		for(int i=1; i<=16; i++) {
			JButton jButton = new JButton(i+"");
			this.add(jButton);
			
		}
		
//		JButton button1 = new JButton("Button1");
//		JButton button2 = new JButton("Button2");
//		JButton button3 = new JButton("Button3");
//		
//		//
//		this.add(button1);
//		this.add(button2);
//		this.add(button3);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		new ViDu_GrildLayout();
	}

}
