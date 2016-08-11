package main;


import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;

public class mainMenu extends JMenuBar implements ActionListener, ItemListener {

	mainFrame mFrame;
	
	private JMenuBar menuBar;
	private JMenu fmenu, smenu, fSubmenu, tmenu;
	private JMenuItem fmitem1, fmitem2;
	private JRadioButtonMenuItem fmRadioItem1, fmRadioItem2, fmRadioItem3;
	private JCheckBoxMenuItem fmCheckBox1, fmCheckBox2, fmCheckBox3;
	private JMenuItem fSubitem1, fSubitem2;
	private JMenuItem sMenuItem1, sMenuItem2, sMenuItem3, sMenuItem4, sMenuItem5;
	private JMenuItem tMenuItem1, tMenuItem2,  tMenuItem4, tMenuItem5;
	private JMenuItem fmitem_1 , fmitem_2, fmitem_3;
	
	
	private String[] st = {"A","B","C"};
	
	public mainMenu(mainFrame mFrame){
		this.mFrame = mFrame;
		setMenu();
	}
	
	private void setMenu() {
		// TODO Auto-generated method stub

		menuBar = new JMenuBar();
		this.add(menuBar,BorderLayout.NORTH);
		
		fmenu = new JMenu("메뉴1");
		fmenu.setMnemonic(KeyEvent.VK_F);
		menuBar.add(fmenu);


		fmitem_1 = new JMenuItem("야구 팀 txt Open(리스트에 추가하기)");
		fmitem_1.addActionListener(this);
		fmenu.add(fmitem_1);
		
		fmitem_2 = new JMenuItem("야구 팀 테이블로 불러오기(리스트에서 가져오기)");
		fmitem_2.addActionListener(this);
		fmenu.add(fmitem_2);
		
		fmitem_3 = new JMenuItem("야구 팀 추가하기");
		fmitem_3.addActionListener(this);
		fmenu.add(fmitem_3);
		
		
		
		
	}

	@Override
	public void itemStateChanged(ItemEvent event) {
		// TODO Auto-generated method stub
		Object obj = event.getSource();
		
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub

		Object obj = event.getSource();
		
		if(obj == fmitem_1){
			JFileChooser fileChooser = new JFileChooser();
			int returnVal = fileChooser.showOpenDialog(mFrame);
			
			if(returnVal == JFileChooser.APPROVE_OPTION){
				mFrame.messageLoop(MENU_MESSAGE.TEAM_TXT_OPEN, fileChooser.getSelectedFile());
			}else{
				System.out.println("실패");
			}
		}
		
		if(obj == fmitem_2){
			mFrame.messageLoop(MENU_MESSAGE.TEAM_LIST_PRINT, event);
		}
		if(obj == fmitem_3){
			mFrame.messageLoop(MENU_MESSAGE.TEAM_ADD, event);
		}
		
		
		
	}

}
