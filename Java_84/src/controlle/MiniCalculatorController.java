package controlle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.MiniCalculatorView;

public class MiniCalculatorController implements ActionListener {
	private MiniCalculatorView miniCalculatorView;



	public MiniCalculatorController(MiniCalculatorView miniCalculatorView) {
		this.miniCalculatorView = miniCalculatorView;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		String sukien = e.getActionCommand();
		
		if(sukien.equals("+")) {
			this.miniCalculatorView.plus();
		}else if(sukien.equals("-")) {
			this.miniCalculatorView.minus();
		}else if(sukien.equals("*")) {
			this.miniCalculatorView.multiply();
		}else if(sukien.equals("/")) {
			this.miniCalculatorView.divide();
		}else if(sukien.equals("^")) {
			this.miniCalculatorView.power();
		}else if(sukien.equals("%")) {
			this.miniCalculatorView.mod();
		}
		
	}
	
	

}
