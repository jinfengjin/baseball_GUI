package playerMenu;

import java.io.FileNotFoundException;

import player.player;

public interface player_msgControlInterface {


	public void fileOpenPlayer() throws FileNotFoundException, Exception;
	public void printAllPlayer();
	public void printBatters();
	public void printBatter(player p);
	public void printPitchers();
	public void printPitcher(player p);
	public void printPlayer();
	
	public void printPlayer(int id);
	
	public void comparePlayer();// �����׸����� ����
	
	public void deletePlayer();
	
	public int[] compareSP(int id, int selectMenu, int selectsubMenu );
	//capareTeam���� �Է¹��� �޴������� ���� ������ �� ������ ID ã�Ƽ� int[]�� �������ִ� �Լ��̴�.
	public void insertPlayer();
	
}
