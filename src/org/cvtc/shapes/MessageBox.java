package org.cvtc.shapes;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MessageBox implements Dialog {

	@Override
	public int show(String message, String title) {
		JFrame frame = new JFrame();
		JOptionPane.showMessageDialog(frame, message, title, JOptionPane.DEFAULT_OPTION);
		
		return JOptionPane.OK_OPTION;
	}
	
	public MessageBox() {
		
	}

}
