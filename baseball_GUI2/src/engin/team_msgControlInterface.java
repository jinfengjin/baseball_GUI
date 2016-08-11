package engin;


import java.io.FileNotFoundException;
import java.util.ArrayList;

public interface team_msgControlInterface {

	public void insertTeam();
	public void printAllTeam();
	public void printSubTeam(team[] teams);
	public void printTeam(int id);
	
	public void compareTeam();// 하위항목으로 간다
	public void modifyTeam();// 하위항목으로 간다
	
	public void deleteTeam();
	
	public ArrayList<team> compareST(int id, int selectMenu, int selectsubMenu );
	//capareTeam에서 입력받은 메뉴값들을 통해 팀에서 그 값들의 ID 찾아서 int[]로 리턴해주는 함수이다.
	
	public void fileOpenTeams(String fileName) throws FileNotFoundException, Exception;
	void deleteTeam(int inx);
	void insertTeam(team t);
}
