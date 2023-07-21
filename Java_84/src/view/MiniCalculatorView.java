package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlle.MiniCalculatorController;
import model.MiniCalculatorModel;

public class MiniCalculatorView extends JFrame{

	private MiniCalculatorModel miniCalculatorModel;
	private JTextField jTextField_firstValue;
	private JTextField jTextField_sencondValue;
	private JTextField jTextField_setwer;

	public MiniCalculatorView() throws HeadlessException {
		this.miniCalculatorModel = new MiniCalculatorModel();
		this.init();
	}

	private void init() {
		this.setTitle("MiNI Calculator");
		this.setSize(400,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		Font font = new Font("Arial", Font.BOLD, 40);
		JLabel jLabel_firstValue = new JLabel("1st Value");
		jLabel_firstValue.setFont(font);
		
		JLabel jLabel_sencond = new JLabel("2st Value");
		jLabel_sencond.setFont(font);
		
		JLabel jLabel_setwer = new JLabel("Answer");
		jLabel_setwer.setFont(font);
		
		jTextField_firstValue = new JTextField(50);
		jTextField_firstValue.setFont(font);
		jTextField_sencondValue = new JTextField(50);
		jTextField_sencondValue.setFont(font);
		jTextField_setwer= new JTextField(50);
		jTextField_setwer.setFont(font);
		
		JPanel jPanel_IO = new JPanel();
		jPanel_IO.setLayout(new GridLayout(3,2, 10,10));
		jPanel_IO.add(jLabel_firstValue);
		jPanel_IO.add(jTextField_firstValue);
		jPanel_IO.add(jLabel_sencond);
		jPanel_IO.add(jTextField_sencondValue);
		jPanel_IO.add(jLabel_setwer);
		jPanel_IO.add(jTextField_setwer);
		
		ActionListener ac = new MiniCalculatorController(this);
		
		JButton jButton_cong = new JButton("+");
		jButton_cong.addActionListener(ac);
		jButton_cong.setFont(font);
		JButton jButton_tru = new JButton("-");
		jButton_tru.addActionListener(ac);
		jButton_tru.setFont(font);
		JButton jButton_nhan = new JButton("*");
		jButton_nhan.addActionListener(ac);
		jButton_nhan.setFont(font);
		JButton jButton_chia = new JButton("/");
		jButton_chia.addActionListener(ac);
		jButton_chia.setFont(font);
		JButton jButton_mu = new JButton("^");
		jButton_mu.addActionListener(ac);
		jButton_mu.setFont(font);
		JButton jButton_chia_du = new JButton("%");
		jButton_chia_du.addActionListener(ac);
		jButton_chia_du.setFont(font);
		
		
		JPanel jPanel_buttons = new JPanel();
		jPanel_buttons.setLayout(new GridLayout(2,3));
		jPanel_buttons.add(jButton_cong);
		jPanel_buttons.add(jButton_tru);
		jPanel_buttons.add(jButton_nhan);
		jPanel_buttons.add(jButton_chia);
		jPanel_buttons.add(jButton_mu);
		jPanel_buttons.add(jButton_chia_du);
		
		this.setLayout(new BorderLayout());
		this.add(jPanel_IO, BorderLayout.CENTER);
		this.add(jPanel_buttons, BorderLayout.SOUTH);
		
		this.setVisible(true);
	}

	public void plus() {
		double fistValue = Double.valueOf(jTextField_firstValue.getText());
		double secondValue = Double.valueOf(jTextField_sencondValue.getText());
		this.miniCalculatorModel.setFirstValue(fistValue);
		this.miniCalculatorModel.setSecondValue(secondValue);
		this.miniCalculatorModel.plus();
		this.jTextField_setwer.setText(this.miniCalculatorModel.getAnswer()+"");
	}
	
	public void minus() {
		double fistValue = Double.valueOf(jTextField_firstValue.getText());
		double secondValue = Double.valueOf(jTextField_sencondValue.getText());
		this.miniCalculatorModel.setFirstValue(fistValue);
		this.miniCalculatorModel.setSecondValue(secondValue);
		this.miniCalculatorModel.minus();
		this.jTextField_setwer.setText(this.miniCalculatorModel.getAnswer()+"");
	}
	
	public void multiply() {
		double fistValue = Double.valueOf(jTextField_firstValue.getText());
		double secondValue = Double.valueOf(jTextField_sencondValue.getText());
		this.miniCalculatorModel.setFirstValue(fistValue);
		this.miniCalculatorModel.setSecondValue(secondValue);
		this.miniCalculatorModel.multiply();
		this.jTextField_setwer.setText(this.miniCalculatorModel.getAnswer()+"");
	}
	
	public void divide() {
		double fistValue = Double.valueOf(jTextField_firstValue.getText());
		double secondValue = Double.valueOf(jTextField_sencondValue.getText());
		this.miniCalculatorModel.setFirstValue(fistValue);
		this.miniCalculatorModel.setSecondValue(secondValue);
		this.miniCalculatorModel.divide();
		this.jTextField_setwer.setText(this.miniCalculatorModel.getAnswer()+"");
	}
	
	public void power() {
		double fistValue = Double.valueOf(jTextField_firstValue.getText());
		double secondValue = Double.valueOf(jTextField_sencondValue.getText());
		this.miniCalculatorModel.setFirstValue(fistValue);
		this.miniCalculatorModel.setSecondValue(secondValue);
		this.miniCalculatorModel.power();
		this.jTextField_setwer.setText(this.miniCalculatorModel.getAnswer()+"");
	}
	
	public void mod() {
		double fistValue = Double.valueOf(jTextField_firstValue.getText());
		double secondValue = Double.valueOf(jTextField_sencondValue.getText());
		this.miniCalculatorModel.setFirstValue(fistValue);
		this.miniCalculatorModel.setSecondValue(secondValue);
		this.miniCalculatorModel.mod();
		this.jTextField_setwer.setText(this.miniCalculatorModel.getAnswer()+"");
	}
	
	
}
