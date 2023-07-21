package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.MyColorController;
import model.MyColorModel;

public class MyColorView extends JFrame {
	private MyColorModel myColorModel;
	private JLabel jLabel;
	
	public MyColorView() {
		this.myColorModel = new MyColorModel();
		this.init();
	}

	private void init() {
		this.setTitle("My Color");
		this.setSize(800,600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Font font_text = new Font("Arial", Font.BOLD, 50);
		jLabel = new JLabel("TEXT");
		jLabel.setFont(font_text);
	
		JPanel jPanel = new JPanel();
		jPanel.setLayout(new GridLayout(2,3));
		
		
		Font font_bt = new Font("Arial", Font.BOLD, 20);
		ActionListener ac = new MyColorController(this);
		
		JButton button_text_red = new JButton("Red text");
		button_text_red.setForeground(Color.red);
		button_text_red.setFont(font_bt);
		button_text_red.addActionListener(ac);
		
		JButton button_text_yellow = new JButton("Yellow text");
		button_text_yellow.setForeground(Color.YELLOW);
		button_text_yellow.setFont(font_bt);
		button_text_yellow.addActionListener(ac);
		
		JButton button_text_green = new JButton("Green text");
		button_text_green.setForeground(Color.green);
		button_text_green.setFont(font_bt);
		button_text_green.addActionListener(ac);
		
		JButton button_back_red = new JButton("Red back");
		button_back_red.setBackground(Color.red);
		button_back_red.setFont(font_bt);
		button_back_red.addActionListener(ac);
		
		JButton button_back_yellow = new JButton("Yellow back");
		button_back_yellow.setBackground(Color.YELLOW);
		button_back_yellow.setFont(font_bt);
		button_back_yellow.addActionListener(ac);
		
		JButton button_back_green = new JButton("Green back");
		button_back_green.setBackground(Color.green);
		button_back_green.setFont(font_bt);
		button_back_green.addActionListener(ac);
		
		jPanel.add(button_text_red);
		jPanel.add(button_text_yellow);
		jPanel.add(button_text_green);
		jPanel.add(button_back_red);
		jPanel.add(button_back_yellow);
		jPanel.add(button_back_green);
		
		this.setLayout(new BorderLayout());
		this.add(jLabel, BorderLayout.NORTH);
		this.add(jPanel, BorderLayout.CENTER);
		
		
		this.setVisible(true);
		
	}

	public void changColor(Color color) {
		this.jLabel.setForeground(color);
		
	}
	
	public void changBackgroundColor(Color color) {
		this.jLabel.setBackground(color);
		this.jLabel.setOpaque(true);
	}

}
