package teamMenu;

import java.io.FileNotFoundException;

import team.team;

public interface team_msgControlInterface {

	public void insertTeam();
	public void printAllTeam();
	public void printSubTeam(team[] teams);
	public void printTeam(int id);
	
	public void compareTeam();// �����׸����� ����
	public void modifyTeam();// �����׸����� ����
	
	public void deleteTeam();
	
	public int[] compareST(int id, int selectMenu, int selectsubMenu );
	//capareTeam���� �Է¹��� �޴������� ���� ������ �� ������ ID ã�Ƽ� int[]�� �������ִ� �Լ��̴�.
	
	public void fileOpenTeams() throws FileNotFoundException, Exception;
}
