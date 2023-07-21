package view;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.CounterListener;
import model.CounterModel;

public class CounterView extends JFrame {
	private CounterModel counterModel;
	private JButton JButton_up;
	private JButton JButton_dow;
	private JButton JButton_reset;
	private JLabel jLabel_value;
	
	public CounterView() {
		this.counterModel = new CounterModel();
		this.init();
		this.setVisible(true);
	}

	private void init() {
		this.setTitle("Counter");
		this.setSize(300,300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ActionListener ac = new CounterListener(this);
		
		JButton_up = new JButton("UP");
		JButton_up.addActionListener(ac);
		
		JButton_dow = new JButton("DOWN");
		JButton_dow.addActionListener(ac);
		
		JButton_reset = new JButton("RESET");
		JButton_reset.addActionListener(ac);
		
		jLabel_value = new JLabel(this.counterModel.getValue()+"", JLabel.CENTER);
		
		JPanel jPanel = new JPanel();
		jPanel.setLayout(new BorderLayout());
		jPanel.add(JButton_up, BorderLayout.WEST);
		jPanel.add(JButton_dow, BorderLayout.EAST);
		jPanel.add(JButton_reset, BorderLayout.SOUTH);
		jPanel.add(jLabel_value, BorderLayout.CENTER);
		
		this.setLayout(new BorderLayout());
		this.add(jPanel, BorderLayout.CENTER);
		
	}
	
	public void increment() {
		this.counterModel.increment();
		this.jLabel_value.setText(this.counterModel.getValue()+"");
	}
	
	public void decrement() {
		this.counterModel.decrement();
		this.jLabel_value.setText(this.counterModel.getValue()+"");
	}
	
	public void reset() {
		this.counterModel.reset();
		this.jLabel_value.setText(this.counterModel.getValue()+"");
	}

}
