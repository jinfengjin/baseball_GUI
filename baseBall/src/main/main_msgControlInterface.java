package main;

import playerMenu.player_dataManagement;
import playerMenu.player_msgControl;
import teamMenu.team_dataManagement;
import teamMenu.team_msgControl;

public interface main_msgControlInterface {
	
	public team_dataManagement teamFileOpen() throws Exception;
	public player_dataManagement playerFileOpen() throws Exception;
	public void teamMenu(team_msgControl team_msgCnt) throws Exception;
	public void teamFileSave(team_dataManagement team_dataMng) throws Exception;
	public void playerMenu(player_msgControl player_msgCnt) throws Exception;
	void playerFileSave(player_dataManagement player_dataMng) throws Exception;
}
