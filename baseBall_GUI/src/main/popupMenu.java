package main;


import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class popupMenu extends JPopupMenu implements ActionListener{
	mainFrame mFrame;
	
	private JMenuItem mItem1, mItem2;
	private JMenu compareMenu ;
	private JMenuItem compareItem1, compareItem2,compareItem3,compareItem4,compareItem5,compareItem6,compareItem7,compareItem8;
	
	public popupMenu(mainFrame frame){
		mFrame = frame;
		mItem1 = new JMenuItem("����");
		mItem1.addActionListener(this);
		this.add(mItem1);
		
		mItem2 = new JMenuItem("��ü �����");
		mItem2.addActionListener(this);
		this.add(mItem2);
		
		compareMenu = new JMenu("�� ���ϱ�");
		this.add(compareMenu);
		
		compareItem1 = new JMenuItem("��� �� ��");
		compareItem1.addActionListener(this);
		compareMenu.add(compareItem1);
		compareItem2 = new JMenuItem("�¼� ��");
		compareItem2.addActionListener(this);
		compareMenu.add(compareItem2);
		compareItem3 = new JMenuItem("�й� �� ��");
		compareItem3.addActionListener(this);
		compareMenu.add(compareItem3);
		compareItem4 = new JMenuItem("�·� ��");
		compareItem4.addActionListener(this);
		compareMenu.add(compareItem4);
		compareItem5 = new JMenuItem("���� ��");
		compareItem5.addActionListener(this);
		compareMenu.add(compareItem5);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();
		
		if(obj == mItem1){
			mFrame.messageLoop(MENU_MESSAGE.TEAM_SELECT_DELETE, obj);
		}
		if(obj == mItem2){
			mFrame.messageLoop(MENU_MESSAGE.TEAM_ALL_DELETE, obj);
		}
		if(obj == compareItem1){
			mFrame.messageLoop(MENU_MESSAGE.TEAM_COMPARE_GAME, obj);
		}
		if(obj == compareItem2){
			mFrame.messageLoop(MENU_MESSAGE.TEAM_COMPARE_WIN, obj);
		}
		if(obj == compareItem3){
			mFrame.messageLoop(MENU_MESSAGE.TEAM_COMPARE_LOSE, obj);
		}
		
	}
}
