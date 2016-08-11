package main;


import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

import engin.team;
import engin.team_dataManagement;
import engin.team_msgControl;

public class mainFrame extends JFrame {

	private team_dataManagement team_dataMng;
	private team_msgControl team_msgCnt;
	
	private mainMenu mMenu;
	private popupMenu pMenu;
	private JTextArea pMenuArea;
	private myDialog mydialog;

	private JTable myTable;
	private DefaultTableModel dTableModel;
	
	private DefaultTableModel subTableModel;
	private subTeamTable_dia subTeam ;
	
	private String columnNames[] = {"ID","����","���","��","��","�·�","����","Ȩ��","����","����","����","Ÿ��","�����","��Ÿ��"};
	//System.out.printf("ID\t ����\t ���\t ��\t ��\t ��\t �·�\t ����\t Ȩ��\t ����\t ����%%\t ����%%\t Ÿ��\t �����\t ��Ÿ��\n");
	private Object rowData[][]= {};
	
	private int inx;
	team_item_dia addDia = new team_item_dia(this);
	
	
	public mainFrame(){

		team_dataMng = new team_dataManagement();
		team_msgCnt = new team_msgControl(this, team_dataMng);
		
		
		this.setTitle("�޴� �����");	
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cP = this.getContentPane();
		cP.setLayout(new BorderLayout());
		
		mMenu= new mainMenu(this);
		pMenu = new popupMenu(this);
		mydialog = new myDialog(this, "�����");

		dTableModel = new DefaultTableModel(rowData, columnNames);
		myTable=new JTable(dTableModel);
		myTable.addMouseListener(new PopupListener());
		
		
		
		this.add(new JScrollPane(myTable), BorderLayout.CENTER);
		
		this.setJMenuBar(mMenu);
		this.setSize(1200,960);
		this.setVisible(true);
	}
	
	public void messageLoop(CONTROL_MESSAGE msg, Object obj){
		switch (msg) {	
			case TEAM_TXT_OPEN_OK:
			
			ArrayList<team> teamsList = (ArrayList<team>)obj;
			int size = dTableModel.getRowCount(); 
			for(int i=0 ;i<size; i++){
				dTableModel.removeRow(0);
			}
			for(team t : teamsList){
				dTableModel.addRow(t.toArray());
			}
			break;
		
			case TEAM_SUB_OK:
	
				subTableModel =  new DefaultTableModel(rowData, columnNames);

				ArrayList<team> teamsList_2 = (ArrayList<team>)obj;
				
				for(team t : teamsList_2){
					subTableModel.addRow(t.toArray());
				}
				
				subTeam = new subTeamTable_dia(subTableModel);
				subTeam.show();
				
			break;
			
			default:
				pMenuArea.append("�߸��� �̺�Ʈ�� ���Խ��ϴ�. \n");
			break;
			
		}
	}
	
	
	public void messageLoop(MENU_MESSAGE msg, Object obj){
		switch (msg) {
		
		case PLAYER_DIALOG:
			
			mydialog.show();
			break;

		case PLAYER_DIALOG_OK:
			String str = obj.toString();
			pMenuArea.append(str);
			break;

		case TEAM_TXT_OPEN:
			try {
				team_msgCnt.fileOpenTeams( (obj.toString()) );
			} catch (Exception e) {
				e.printStackTrace();
			}

			team_msgCnt.printAllTeam();
			break;
			
		case TEAM_LIST_PRINT :
			team_msgCnt.printAllTeam();
			
			break;
		
		case TEAM_SELECT_DELETE:
			
			inx = myTable.getSelectedRow();
			team_msgCnt.deleteTeam(inx);
			
			break;
			
		case TEAM_ALL_DELETE:
			team_msgCnt.deleteAllTeam();
			team_msgCnt.printAllTeam();
			break;
			
		case TEAM_ADD:
			addDia.show();
			
			
			break;
			
		case TEAM_MAKE_OK:
			team t = new team((team)obj);
			team_msgCnt.insertTeam(t);
			team_msgCnt.printAllTeam();
			break;
			
			
			
		case TEAM_COMPARE_GAME:
			inx = myTable.getSelectedRow();
			int id = team_msgCnt.getId(inx);

			team_msgCnt.compareST(id, 1, 1);
			
			break;
			
		case TEAM_COMPARE_WIN:
			
			break;
			
		case TEAM_COMPARE_LOSE:
			
			break;
			
			
		default:
			pMenuArea.append("�߸��� �̺�Ʈ�� ���Խ��ϴ�. \n");
			break;
		}
		
	}
	
	private class PopupListener extends MouseAdapter{
		
		public void mousePressed(MouseEvent event){
			if(event.isPopupTrigger()){
				pMenu.show(event.getComponent(), event.getX(), event.getY());
			}
		}
		
		public void mouseReleased(MouseEvent event){
			if(event.isPopupTrigger()){
				pMenu.show(event.getComponent(), event.getX(), event.getY());
			}
		}
		
	}
	
	
	
}
