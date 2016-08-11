package main;


import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.TileObserver;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class myDialog extends JDialog implements ActionListener	 {
	
	private mainFrame mFrame;
	JTextField nameTxt = new JTextField();
	JTextField univTxt = new JTextField();
	JTextField majorTxt = new JTextField();
	JLabel nameLabel = new JLabel("이름 : ");
	JLabel univLabel = new JLabel("대학 : ");
	JLabel majorLabel = new JLabel("전공 : ");
	Panel dlgPanel = new Panel();
	JButton okBtn = new JButton("확인");
	JButton cancelBtn = new JButton("취소");
	
	public myDialog(mainFrame frame, String titleStr){
		super(frame,titleStr,true);
		mFrame = frame;
		
		dlgPanel.setLayout(new GridLayout(4,2));
		
		okBtn.addActionListener(this);
		cancelBtn.addActionListener(this);
		
		dlgPanel.add(nameLabel);
		dlgPanel.add(nameTxt);
		dlgPanel.add(univLabel);
		dlgPanel.add(univTxt);
		dlgPanel.add(majorLabel);
		dlgPanel.add(majorTxt);
		dlgPanel.add(okBtn);
		dlgPanel.add(cancelBtn);
	
		this.add(dlgPanel);
		this.setSize(180,200);
	
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		Object obj = event.getSource();
		
		if(obj == okBtn){
			String str = "" +nameTxt.getText()+
						 "" +univTxt.getText()+
						 "" +majorTxt.getText();
			
			mFrame.messageLoop(MENU_MESSAGE.PLAYER_DIALOG_OK, str);
			
			this.dispose();
		}
		if(obj == cancelBtn){
			this.dispose();
		}
	}

}
