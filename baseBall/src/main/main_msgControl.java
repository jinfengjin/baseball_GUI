package main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import playerMenu.playerMenu;
import playerMenu.player_dataManagement;
import playerMenu.player_msgControl;
import teamMenu.teamMenu;
import teamMenu.team_dataManagement;
import teamMenu.team_msgControl;

public class main_msgControl implements main_msgControlInterface {

	@Override
	public void teamMenu(team_msgControl team_msgCnt) throws Exception {
		// TODO Auto-generated method stub
		
		teamMenu menu = new teamMenu(team_msgCnt);
		while (menu.menuLoop());		
	
	}

	@Override
	public void playerMenu(player_msgControl player_msgCnt) throws Exception {
		// TODO Auto-generated method stub
		playerMenu menu = new playerMenu(player_msgCnt);
		while (menu.menuLoop());	
		
	}

	@Override
	public team_dataManagement teamFileOpen() throws Exception {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("team_object.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		team_dataManagement temp = (team_dataManagement)ois.readObject();
		
		team_dataManagement rso1 = new team_dataManagement(temp);

		ois.close();
		return rso1;
	}

	@Override
	public void teamFileSave(team_dataManagement team_dataMng) throws Exception {
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("team_object.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(team_dataMng);
		oos.close();
	}


	@Override
	public player_dataManagement playerFileOpen() throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("player_object.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		player_dataManagement temp = (player_dataManagement)ois.readObject();
		
		player_dataManagement rso1 = new player_dataManagement(temp);

		ois.close();
		return rso1;
	}

	@Override
	public void playerFileSave(player_dataManagement player_dataMng) throws Exception{
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("player_object.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(player_dataMng);
		oos.close();
	}

}
