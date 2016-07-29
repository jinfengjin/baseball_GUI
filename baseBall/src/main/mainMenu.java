package main;

import java.util.Scanner;

import playerMenu.player_dataManagement;
import playerMenu.player_msgControl;
import teamMenu.team_dataManagement;
import teamMenu.team_msgControl;

public class mainMenu {

	private MAIN_MENU selMenu;
	private MAIN_MENU[] menuValues;
	

	private main_msgControl main_msgCnt;

	private team_dataManagement team_dataMng;
	private team_msgControl team_msgCnt;
	
	private player_dataManagement player_dataMng;
	private player_msgControl player_msgCnt;
	
	public mainMenu(){
		
		team_dataMng = new team_dataManagement();
		team_msgCnt = new team_msgControl(team_dataMng);
		
		player_dataMng = new player_dataManagement();
		player_msgCnt = new player_msgControl(player_dataMng);
		
		main_msgCnt = new main_msgControl();
		
		menuValues = MAIN_MENU.values();
	}
			
	private void Message_proc(MAIN_MENU selMenu) throws Exception{
		
		switch (selMenu) {
		case MENU_QUIT:
			System.out.println("종료");
			break;
		
		case TEAM_MENU: 
			main_msgCnt.teamMenu(team_msgCnt);
			break;			
			
		case PLAYER_MENU :
			main_msgCnt.playerMenu(player_msgCnt);
			break;

		case TEAM_FILE_OPEN :
			team_dataManagement temp = main_msgCnt.teamFileOpen();
			this.team_dataMng = new team_dataManagement(temp);
			this.team_msgCnt = new team_msgControl(team_dataMng);
			break;

		case TEAM_FILE_SAVE :
			main_msgCnt.teamFileSave(team_dataMng);
			break;			

		case PLAYER_FILE_OPEN :

			player_dataManagement temp2 = main_msgCnt.playerFileOpen();
			this.player_dataMng = new player_dataManagement(temp2);
			this.player_msgCnt = new player_msgControl(player_dataMng);
			break;

		case PLAYER_FILE_SAVE :
			main_msgCnt.playerFileSave(player_dataMng);
			break;
			
		default:
			System.out.println("입력이 잘못되었습니다.");
			break;
		}
		
		
	}
	

	public boolean menuLoop() throws Exception{

		Menu_View();
		selMenu = menuValues[Select_Menu()];

		Message_proc(selMenu);	
		if(selMenu == MAIN_MENU.MENU_QUIT){
			return false;
		}
		
		return true;
	}
	

	private  int Select_Menu() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}


	private  void Menu_View() {
		System.out.println("====================================");
		System.out.println("1. 팀 메뉴");
		System.out.println("2. 선수 메뉴");
		System.out.println("3. 팀 파일 열기");
		System.out.println("4. 팀 정보 저장");	
		System.out.println("5. 선수 파일 열기");	
		System.out.println("6. 선수 정보 저장");	
		System.out.println("0. 프로그램 종료");		
		System.out.println("====================================");
		System.out.printf("메뉴 선택 : ");
	}
	
}
