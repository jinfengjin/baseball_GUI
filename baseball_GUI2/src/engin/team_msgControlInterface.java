package engin;


import java.io.FileNotFoundException;
import java.util.ArrayList;

public interface team_msgControlInterface {

	public void insertTeam();
	public void printAllTeam();
	public void printSubTeam(team[] teams);
	public void printTeam(int id);
	
	public void compareTeam();// �����׸����� ����
	public void modifyTeam();// �����׸����� ����
	
	public void deleteTeam();
	
	public ArrayList<team> compareST(int id, int selectMenu, int selectsubMenu );
	//capareTeam���� �Է¹��� �޴������� ���� ������ �� ������ ID ã�Ƽ� int[]�� �������ִ� �Լ��̴�.
	
	public void fileOpenTeams(String fileName) throws FileNotFoundException, Exception;
	void deleteTeam(int inx);
	void insertTeam(team t);
}
