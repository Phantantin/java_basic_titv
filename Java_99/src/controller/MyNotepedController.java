package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.lang.System.Logger;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

import javax.swing.JFileChooser;

import view.MyNotepedView;

public class MyNotepedController implements ActionListener {
	private MyNotepedView myNotepedView;
	
	
	
	public MyNotepedController(MyNotepedView myNotepedView) {
		this.myNotepedView = myNotepedView;
	}




	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		JFileChooser fc = new JFileChooser();
		if(command.equals("Open")) {
			int returnVal = fc.showOpenDialog(this.myNotepedView);
			if(returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
				String fileName = file.getName();
				this.myNotepedView.myNotepedModel.setFileName(file.getAbsolutePath());
				this.myNotepedView.lblNewLabel.setText(file.getAbsolutePath());
				if(fileName.endsWith(".txt")) {
					try {
						List<String> allText = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
						String result = "";
						for (String line: allText) {
							result +=line;
							result +="\n";
						}
						this.myNotepedView.myNotepedModel.setContent(result);
						this.myNotepedView.textArea.setText(this.myNotepedView.myNotepedModel.getContent());
					} catch (Exception e2) {
						e2.printStackTrace();
					}
				}
			}
			
		}else if(command.equals("Save")) {
			if(this.myNotepedView.myNotepedModel.getFileName().length()>0) {
				save(this.myNotepedView.myNotepedModel.getFileName());
				
			}else {
				int returnVal = fc.showSaveDialog(this.myNotepedView);
				if(returnVal == JFileChooser.APPROVE_OPTION) {
					File file = fc.getSelectedFile();
					save(file.getAbsolutePath());
					
					
				}
				
			}
			
		}
	}
	
	public void save(String fileName) {
		try {
			PrintWriter pw = new PrintWriter(fileName, "UTF-8");
			String data = this.myNotepedView.textArea.getText();
			pw.print(data);
			
			pw.flush();
			pw.close();
		} catch (FileNotFoundException | UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
