package main;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.Book;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

import team.team;

public class team_item_dia extends JDialog implements ActionListener {

	private mainFrame mFrame;

	JTextField teamNameTxt = new JTextField();
	JLabel teamNameLabel = new JLabel("팀이름 : ");
	
	JTextField gameNumberTxt = new JTextField();
	JLabel gameNumberLabel = new JLabel("게임 수 : ");
	
	JTextField winningNumberTxt = new JTextField();
	JLabel winningNumberLabel = new JLabel("승수 : ");
	
	JTextField tieNumberTxt = new JTextField();
	JLabel tieNumberLabel = new JLabel("무승부 : ");
	
	JTextField losingNumberTxt = new JTextField();
	JLabel losingNumberLabel = new JLabel("진수 : ");
	
	private Panel mainPanel = new Panel();
	private Panel dlgPanel = new Panel();
	private JButton okBtn = new JButton("확인");
	private JButton cancelBtn = new JButton("취소");
	
	public team_item_dia(mainFrame mFrame){
		
		super(mFrame , "팀의 정보",true);
		this.mFrame = mFrame;
		
		mainPanel.setLayout(new BorderLayout());

		okBtn.addActionListener(this);
		cancelBtn.addActionListener(this);
		
		dlgPanel.setLayout(new GridLayout(6,2));
		dlgPanel.add(teamNameLabel);
		dlgPanel.add(teamNameTxt);
		dlgPanel.add(gameNumberLabel);
		dlgPanel.add(gameNumberTxt);
		dlgPanel.add(winningNumberLabel);
		dlgPanel.add(winningNumberTxt);
		dlgPanel.add(tieNumberLabel);
		dlgPanel.add(tieNumberTxt);
		dlgPanel.add(losingNumberLabel);
		dlgPanel.add(losingNumberTxt);

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
			team t = new team(
					teamNameTxt.getText(),
					Integer.parseInt( gameNumberTxt.getText()),
					Integer.parseInt(winningNumberTxt.getText()),
					Integer.parseInt(tieNumberTxt.getText()),
					Integer.parseInt(losingNumberTxt.getText()),
					Float.parseFloat("0"),
					Integer.parseInt("0"),
					Integer.parseInt("0"),
					Integer.parseInt("0"),
					Float.parseFloat("0"),
					Float.parseFloat("0"),
					Float.parseFloat("0"),
					Float.parseFloat("0"),
					Float.parseFloat("0")
					);
			
			mFrame.messageLoop(MENU_MESSAGE.TEAM_MAKE_OK, t);
			
			this.dispose();
		}
		if(obj == cancelBtn){
			this.dispose();
		}
	}

}
