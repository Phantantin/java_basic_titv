package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.LastButtonView;

public class LastButtonController implements ActionListener {

	private LastButtonView lastButtonView;
	
	
	public LastButtonController(LastButtonView lastButtonView) {
		this.lastButtonView = lastButtonView;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		String suKien = e.getActionCommand();
		if(suKien.equals("1")) {
			this.lastButtonView.changeTo_1();
		}else if(suKien.equals("2")) {
			this.lastButtonView.changeTo_2();
		}else if(suKien.equals("3")) {
			this.lastButtonView.changeTo_3();
		}else if(suKien.equals("4")) {
			this.lastButtonView.changeTo_4();
		}
		
	}

}
