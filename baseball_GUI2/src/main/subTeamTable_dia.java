package main;

import javax.swing.JDialog;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class subTeamTable_dia extends JDialog{

	private JTable subTable;
	DefaultTableModel subTableModel ;
	
	public subTeamTable_dia(DefaultTableModel DM) {
		// TODO Auto-generated constructor stub
		subTableModel = DM;
		

		subTable=new JTable(subTableModel);

		this.add(subTable);
		this.setSize(1200,500);
	}
	
	
}
