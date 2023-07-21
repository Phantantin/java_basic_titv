package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.MyColorView;

public class MyColorController implements ActionListener {

	private MyColorView myColorView;
	
	
	
	public MyColorController(MyColorView myColorView) {
		this.myColorView = myColorView;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		if(src.equals("Red text")) {
			this.myColorView.changColor(Color.red);
		}else if(src.equals("Yellow text")) {
			this.myColorView.changColor(Color.YELLOW);
		}else if(src.equals("Green text")) {
			this.myColorView.changColor(Color.green);
		}else if(src.equals("Red back")) {
			this.myColorView.changBackgroundColor(Color.red);
		}else if(src.equals("Yellow back")) {
			this.myColorView.changBackgroundColor(Color.yellow);
		}else if(src.equals("Green back")) {
			this.myColorView.changBackgroundColor(Color.green);
		}
		
		
	}

}
