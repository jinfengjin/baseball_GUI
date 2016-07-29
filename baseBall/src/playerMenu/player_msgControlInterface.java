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
	
	public void comparePlayer();// 하위항목으로 간다
	
	public void deletePlayer();
	
	public int[] compareSP(int id, int selectMenu, int selectsubMenu );
	//capareTeam에서 입력받은 메뉴값들을 통해 팀에서 그 값들의 ID 찾아서 int[]로 리턴해주는 함수이다.
	public void insertPlayer();
	
}
