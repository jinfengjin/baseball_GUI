package playerMenu;

import java.util.Scanner;

public class playerMenu {

	private PLAYER_MENU selMenu;
	private PLAYER_MENU[] menuValues;
	
	private player_msgControl player_msgCnt;
	
	
	
	public playerMenu(player_msgControl team_msgCnt){
		this.player_msgCnt = team_msgCnt;
		
		menuValues = PLAYER_MENU.values();
	}
		
	
	
	private void Message_proc(PLAYER_MENU selMenu) throws Exception{
		
		switch (selMenu) {
		case MENU_QUIT:
			System.out.println("����");
			break;
		
		case PLAYER_FILE_OPEN: 
			//msgCnt.insertTeam();
			player_msgCnt.fileOpenPlayer();
			break;			
			
		case PLAYER_PRINT :
			player_msgCnt.printPlayer();
			break;

	
			
		case PLAYER_DELETE :
			player_msgCnt.deletePlayer();
			break;
			

			
		default:
			System.out.println("�Է��� �߸��Ǿ����ϴ�.");
			break;
		}
		
		
	}


	private  void Menu_View() {
		System.out.println("************************************");
		System.out.println("1. ���� �߰�(�ؽ�Ʈ ���Ͽ��� �ҷ�����).");
		System.out.println("2. ���� ���� ���.");
		System.out.println("3. ���� ���� ����.");	
		System.out.println("0. ���� �޴���.");		
		System.out.println("************************************");
		System.out.printf("�޴� ���� : ");
	}
	

	public boolean menuLoop() throws Exception{

		Menu_View();
		selMenu = menuValues[Select_Menu()];

		Message_proc(selMenu);	
		if(selMenu == PLAYER_MENU.MENU_QUIT){
			return false;
		}
		
		return true;
	}
	

	private  int Select_Menu() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

}
