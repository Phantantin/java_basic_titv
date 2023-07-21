package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class MyCalculator extends JFrame{
	public MyCalculator() {
		this.setTitle("My Calculator");
		
		this.setSize(300, 300);
		
		this.setLocationRelativeTo(null);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextField jTextField = new JTextField();
		JPanel jPanel_head = new JPanel();
		jPanel_head.setLayout(new BorderLayout());
		jPanel_head.add(jTextField, BorderLayout.CENTER);
		
		
		JButton jButton0 = new JButton("0");
		JButton jButton1 = new JButton("1");
		JButton jButton2 = new JButton("2");
		JButton jButton3 = new JButton("3");
		JButton jButton4 = new JButton("4");
		JButton jButton5 = new JButton("5");
		JButton jButton6 = new JButton("6");
		JButton jButton7 = new JButton("7");
		JButton jButton8 = new JButton("8");
		JButton jButton9 = new JButton("9");
		JButton jButton_cong = new JButton("+");
		JButton jButton_tru = new JButton("-");
		JButton jButton_nhan = new JButton("*");
		JButton jButton_chia = new JButton("/");
		JButton jButton_bang = new JButton("=");
		
		JPanel jPanel_button = new JPanel();
		jPanel_button.setLayout(new GridLayout(5,3,5,5));
		

		jPanel_button.add(jButton0);
		jPanel_button.add(jButton1);
		jPanel_button.add(jButton2);
		jPanel_button.add(jButton3);
		jPanel_button.add(jButton4);
		jPanel_button.add(jButton5);
		jPanel_button.add(jButton6);
		jPanel_button.add(jButton7);
		jPanel_button.add(jButton8);
		jPanel_button.add(jButton9);
		jPanel_button.add(jButton_cong);
		jPanel_button.add(jButton_tru);
		jPanel_button.add(jButton_nhan);
		jPanel_button.add(jButton_chia);
		jPanel_button.add(jButton_bang);
		
		this.setLayout(new BorderLayout());
		this.add(jPanel_head, BorderLayout.NORTH);
		this.add(jPanel_button, BorderLayout.CENTER);
		
		
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new MyCalculator();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		 
	}
}
