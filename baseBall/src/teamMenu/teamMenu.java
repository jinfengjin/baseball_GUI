package teamMenu;

import java.util.Scanner;

public class teamMenu {

	private TEAM_MENU selMenu;
	private TEAM_MENU[] menuValues;
	
	private team_msgControl team_msgCnt;
	
	
	
	public teamMenu(team_msgControl team_msgCnt){
		this.team_msgCnt = team_msgCnt;
		
		menuValues = TEAM_MENU.values();
	}
		
	
	
	public boolean menuLoop() throws Exception{

		Menu_View();
		selMenu = menuValues[Select_Menu()];

		Message_proc(selMenu);	
		if(selMenu == TEAM_MENU.MENU_QUIT){
			return false;
		}
		
		return true;
	}
	

	private  int Select_Menu() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

	private void Message_proc(TEAM_MENU selMenu) throws Exception{
		
		switch (selMenu) {
		case MENU_QUIT:
			System.out.println("����");
			break;
		
		case TEAM_FILE_OPEN: 
			//msgCnt.insertTeam();
			team_msgCnt.fileOpenTeams();
			break;			
			
		case TEAM_PRINT :
			team_msgCnt.printAllTeam();
			break;

		case TEAM_COMPARE :
			team_msgCnt.compareTeam();
			break;

		case TEAM_MODIFY :
			team_msgCnt.modifyTeam();
			break;			

		case TEAM_DELETE :
			team_msgCnt.deleteTeam();
			break;
			
		case TEAM_INSERT :
			team_msgCnt.insertTeam();
			break;
			
		default:
			System.out.println("�Է��� �߸��Ǿ����ϴ�.");
			break;
		}
		
		
	}


	private  void Menu_View() {
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("1. �� �߰�(�ؽ�Ʈ ���Ͽ��� �ҷ�����).");
		System.out.println("2. �� ���� ���.");
		System.out.println("3. �� ���� ��.");
		System.out.println("4. �� ���� ����.");	
		System.out.println("5. �� ���� ����.");	
		System.out.println("6. �� ���� ���� �Է�.");	
		System.out.println("0. ���� �޴���.");		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.printf("�޴� ���� : ");
	}
	
}
