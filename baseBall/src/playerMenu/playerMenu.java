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
			System.out.println("종료");
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
			System.out.println("입력이 잘못되었습니다.");
			break;
		}
		
		
	}


	private  void Menu_View() {
		System.out.println("************************************");
		System.out.println("1. 선수 추가(텍스트 파일에서 불러오기).");
		System.out.println("2. 선수 정보 출력.");
		System.out.println("3. 선수 정보 삭제.");	
		System.out.println("0. 상위 메뉴로.");		
		System.out.println("************************************");
		System.out.printf("메뉴 선택 : ");
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
