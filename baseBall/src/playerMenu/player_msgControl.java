package playerMenu;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.StringTokenizer;

import player.POSITION_INFO;
import player.batter;
import player.pitcher;
import player.player;

public class player_msgControl implements player_msgControlInterface {

	private player_dataManagement player_dataMng;

	public player_msgControl(player_dataManagement player_dataMng) {
		this.player_dataMng = player_dataMng;
	}


	@Override
	public void printPlayer() {
		// TODO Auto-generated method stub
		System.out.println("************************************");
		System.out.println("1. 모든 선수들을 출력");
		System.out.println("2. 투수 출력");
		System.out.println("3. 타자 출력");
		System.out.println("4. 팀으로 선수 출력");
		System.out.println("5. 포지션 별로 출력");
		System.out.println("************************************");
		System.out.printf("메뉴를 선택하세요 :");
		Scanner sc = new Scanner(System.in);
		int selMenu = sc.nextInt();
		switch (selMenu) {
		case 1:
			this.printAllPlayer();
			break;
		case 2:
			this.printPitchers();
			break;
		case 3:
			this.printBatters();
			break;
			
		case 4:
			this.selectTeam();
			break;

		case 5:
			this.selectPosition();
			break;

		default:
			System.out.println("잘못 입력하셨습니다.");
			break;
		}
	}
	
	
	private void selectPosition() {
		// TODO Auto-generated method stub
		System.out.println("");
	}


	private void selectTeam() {
		// TODO Auto-generated method stub
		System.out.println("************************************");
		System.out.println("찾고싶은 팀을 고르시오");
		System.out.println("1. 두산");
		System.out.println("2. NC");
		System.out.println("3. 넥센");
		System.out.println("4. SK");
		System.out.println("5. 롯데");
		System.out.println("6. LG");
		System.out.println("7. KIA");
		System.out.println("8. KT");
		System.out.println("9. 삼성");
		System.out.println("10. 한화");
		System.out.println("************************************");
		System.out.printf("메뉴를 선택하세요 :");
		Scanner sc = new Scanner(System.in);
		int selMenu = sc.nextInt();
		

		player[] players = player_dataMng.getPlayers();
		int playerNum = player_dataMng.getPlayerSize();
		
		int i;
		switch (selMenu) {
		case 1:
			System.out.println("투수의 정보입니다.");
			// NO#선수명#팀명#포지션#승#패#세이브#홀드#블론#경기#선발#이닝#삼진#볼넷#홈런
			System.out.println("------------------------------------------------------------------------------------------------------");
			System.out.printf("ID\t 선수명\t 팀명\t 포지션\t 승\t 패\t 세이브\t 홀드\t 블론\t 경기\t 선발\t 이닝\t 삼진\t 볼넷\t 홈런\n");
			System.out.println("------------------------------------------------------------------------------------------------------");

			for(i=0; i<playerNum; i++){
				if(players[i].getTeamName().equals("두산")){
					if(players[i].getPosition() ==  POSITION_INFO.PITCHER){
						this.printPitcher(players[i]);
					}
				}
			}
			System.out.println("타자의 정보입니다.");
			//NO#선수명#팀명#포지션#경기#타석#타수#안타#홈런#득점#타점#볼넷#삼진#도루
			System.out.println("------------------------------------------------------------------------------------------------------");
			System.out.printf("ID\t 선수명\t 팀명\t 포지션\t 경기\t 타석\t 타수\t 안타\t 홈런\t 득점\t 타점\t 볼넷\t 삼진\t 도루\n");
			System.out.println("------------------------------------------------------------------------------------------------------");
			for(i=0; i<playerNum; i++){
				if(players[i].getTeamName().equals("두산")){
					if(players[i].getPosition() !=  POSITION_INFO.PITCHER){
						this.printBatter(players[i]);
					}
					
				}
			}
			
			
			break;
		case 2:

			System.out.println("투수의 정보입니다.");
			// NO#선수명#팀명#포지션#승#패#세이브#홀드#블론#경기#선발#이닝#삼진#볼넷#홈런
			System.out.println("------------------------------------------------------------------------------------------------------");
			System.out.printf("ID\t 선수명\t 팀명\t 포지션\t 승\t 패\t 세이브\t 홀드\t 블론\t 경기\t 선발\t 이닝\t 삼진\t 볼넷\t 홈런\n");
			System.out.println("------------------------------------------------------------------------------------------------------");

			for(i=0; i<playerNum; i++){
				if(players[i].getTeamName().equals("NC")){
					if(players[i].getPosition() ==  POSITION_INFO.PITCHER){
						this.printPitcher(players[i]);
					}
				}
			}
			System.out.println("타자의 정보입니다.");
			//NO#선수명#팀명#포지션#경기#타석#타수#안타#홈런#득점#타점#볼넷#삼진#도루
			System.out.println("------------------------------------------------------------------------------------------------------");
			System.out.printf("ID\t 선수명\t 팀명\t 포지션\t 경기\t 타석\t 타수\t 안타\t 홈런\t 득점\t 타점\t 볼넷\t 삼진\t 도루\n");
			System.out.println("------------------------------------------------------------------------------------------------------");
			for(i=0; i<playerNum; i++){
				if(players[i].getTeamName().equals("NC")){
					if(players[i].getPosition() !=  POSITION_INFO.PITCHER){
						this.printBatter(players[i]);
					}
					
				}
			}
			break;
		case 3:

			System.out.println("투수의 정보입니다.");
			// NO#선수명#팀명#포지션#승#패#세이브#홀드#블론#경기#선발#이닝#삼진#볼넷#홈런
			System.out.println("------------------------------------------------------------------------------------------------------");
			System.out.printf("ID\t 선수명\t 팀명\t 포지션\t 승\t 패\t 세이브\t 홀드\t 블론\t 경기\t 선발\t 이닝\t 삼진\t 볼넷\t 홈런\n");
			System.out.println("------------------------------------------------------------------------------------------------------");

			for(i=0; i<playerNum; i++){
				if(players[i].getTeamName().equals("넥센")){
					if(players[i].getPosition() ==  POSITION_INFO.PITCHER){
						this.printPitcher(players[i]);
					}
				}
			}
			System.out.println("타자의 정보입니다.");
			//NO#선수명#팀명#포지션#경기#타석#타수#안타#홈런#득점#타점#볼넷#삼진#도루
			System.out.println("------------------------------------------------------------------------------------------------------");
			System.out.printf("ID\t 선수명\t 팀명\t 포지션\t 경기\t 타석\t 타수\t 안타\t 홈런\t 득점\t 타점\t 볼넷\t 삼진\t 도루\n");
			System.out.println("------------------------------------------------------------------------------------------------------");
			for(i=0; i<playerNum; i++){
				if(players[i].getTeamName().equals("넥센")){
					if(players[i].getPosition() !=  POSITION_INFO.PITCHER){
						this.printBatter(players[i]);
					}
					
				}
			}
			break;
			
		case 4:

			System.out.println("투수의 정보입니다.");
			// NO#선수명#팀명#포지션#승#패#세이브#홀드#블론#경기#선발#이닝#삼진#볼넷#홈런
			System.out.println("------------------------------------------------------------------------------------------------------");
			System.out.printf("ID\t 선수명\t 팀명\t 포지션\t 승\t 패\t 세이브\t 홀드\t 블론\t 경기\t 선발\t 이닝\t 삼진\t 볼넷\t 홈런\n");
			System.out.println("------------------------------------------------------------------------------------------------------");

			for(i=0; i<playerNum; i++){
				if(players[i].getTeamName().equals("SK")){
					if(players[i].getPosition() ==  POSITION_INFO.PITCHER){
						this.printPitcher(players[i]);
					}
				}
			}
			System.out.println("타자의 정보입니다.");
			//NO#선수명#팀명#포지션#경기#타석#타수#안타#홈런#득점#타점#볼넷#삼진#도루
			System.out.println("------------------------------------------------------------------------------------------------------");
			System.out.printf("ID\t 선수명\t 팀명\t 포지션\t 경기\t 타석\t 타수\t 안타\t 홈런\t 득점\t 타점\t 볼넷\t 삼진\t 도루\n");
			System.out.println("------------------------------------------------------------------------------------------------------");
			for(i=0; i<playerNum; i++){
				if(players[i].getTeamName().equals("SK")){
					if(players[i].getPosition() !=  POSITION_INFO.PITCHER){
						this.printBatter(players[i]);
					}
					
				}
			}
			break;

		case 5:

			System.out.println("투수의 정보입니다.");
			// NO#선수명#팀명#포지션#승#패#세이브#홀드#블론#경기#선발#이닝#삼진#볼넷#홈런
			System.out.println("------------------------------------------------------------------------------------------------------");
			System.out.printf("ID\t 선수명\t 팀명\t 포지션\t 승\t 패\t 세이브\t 홀드\t 블론\t 경기\t 선발\t 이닝\t 삼진\t 볼넷\t 홈런\n");
			System.out.println("------------------------------------------------------------------------------------------------------");

			for(i=0; i<playerNum; i++){
				if(players[i].getTeamName().equals("롯데")){
					if(players[i].getPosition() ==  POSITION_INFO.PITCHER){
						this.printPitcher(players[i]);
					}
				}
			}
			System.out.println("타자의 정보입니다.");
			//NO#선수명#팀명#포지션#경기#타석#타수#안타#홈런#득점#타점#볼넷#삼진#도루
			System.out.println("------------------------------------------------------------------------------------------------------");
			System.out.printf("ID\t 선수명\t 팀명\t 포지션\t 경기\t 타석\t 타수\t 안타\t 홈런\t 득점\t 타점\t 볼넷\t 삼진\t 도루\n");
			System.out.println("------------------------------------------------------------------------------------------------------");
			for(i=0; i<playerNum; i++){
				if(players[i].getTeamName().equals("롯데")){
					if(players[i].getPosition() !=  POSITION_INFO.PITCHER){
						this.printBatter(players[i]);
					}
					
				}
			}
			break;
			
		case 6:

			System.out.println("투수의 정보입니다.");
			// NO#선수명#팀명#포지션#승#패#세이브#홀드#블론#경기#선발#이닝#삼진#볼넷#홈런
			System.out.println("------------------------------------------------------------------------------------------------------");
			System.out.printf("ID\t 선수명\t 팀명\t 포지션\t 승\t 패\t 세이브\t 홀드\t 블론\t 경기\t 선발\t 이닝\t 삼진\t 볼넷\t 홈런\n");
			System.out.println("------------------------------------------------------------------------------------------------------");

			for(i=0; i<playerNum; i++){
				if(players[i].getTeamName().equals("LG")){
					if(players[i].getPosition() ==  POSITION_INFO.PITCHER){
						this.printPitcher(players[i]);
					}
				}
			}
			System.out.println("타자의 정보입니다.");
			//NO#선수명#팀명#포지션#경기#타석#타수#안타#홈런#득점#타점#볼넷#삼진#도루
			System.out.println("------------------------------------------------------------------------------------------------------");
			System.out.printf("ID\t 선수명\t 팀명\t 포지션\t 경기\t 타석\t 타수\t 안타\t 홈런\t 득점\t 타점\t 볼넷\t 삼진\t 도루\n");
			System.out.println("------------------------------------------------------------------------------------------------------");
			for(i=0; i<playerNum; i++){
				if(players[i].getTeamName().equals("LG")){
					if(players[i].getPosition() !=  POSITION_INFO.PITCHER){
						this.printBatter(players[i]);
					}
					
				}
			}
			break;
		case 7:
			System.out.println("투수의 정보입니다.");
			// NO#선수명#팀명#포지션#승#패#세이브#홀드#블론#경기#선발#이닝#삼진#볼넷#홈런
			System.out.println("------------------------------------------------------------------------------------------------------");
			System.out.printf("ID\t 선수명\t 팀명\t 포지션\t 승\t 패\t 세이브\t 홀드\t 블론\t 경기\t 선발\t 이닝\t 삼진\t 볼넷\t 홈런\n");
			System.out.println("------------------------------------------------------------------------------------------------------");

			for(i=0; i<playerNum; i++){
				if(players[i].getTeamName().equals("KIA")){
					if(players[i].getPosition() ==  POSITION_INFO.PITCHER){
						this.printPitcher(players[i]);
					}
				}
			}
			System.out.println("타자의 정보입니다.");
			//NO#선수명#팀명#포지션#경기#타석#타수#안타#홈런#득점#타점#볼넷#삼진#도루
			System.out.println("------------------------------------------------------------------------------------------------------");
			System.out.printf("ID\t 선수명\t 팀명\t 포지션\t 경기\t 타석\t 타수\t 안타\t 홈런\t 득점\t 타점\t 볼넷\t 삼진\t 도루\n");
			System.out.println("------------------------------------------------------------------------------------------------------");
			for(i=0; i<playerNum; i++){
				if(players[i].getTeamName().equals("KIA")){
					if(players[i].getPosition() !=  POSITION_INFO.PITCHER){
						this.printBatter(players[i]);
					}
					
				}
			}
			break;
		case 8:
			System.out.println("투수의 정보입니다.");
			// NO#선수명#팀명#포지션#승#패#세이브#홀드#블론#경기#선발#이닝#삼진#볼넷#홈런
			System.out.println("------------------------------------------------------------------------------------------------------");
			System.out.printf("ID\t 선수명\t 팀명\t 포지션\t 승\t 패\t 세이브\t 홀드\t 블론\t 경기\t 선발\t 이닝\t 삼진\t 볼넷\t 홈런\n");
			System.out.println("------------------------------------------------------------------------------------------------------");

			for(i=0; i<playerNum; i++){
				if(players[i].getTeamName().equals("KT")){
					if(players[i].getPosition() ==  POSITION_INFO.PITCHER){
						this.printPitcher(players[i]);
					}
				}
			}
			System.out.println("타자의 정보입니다.");
			//NO#선수명#팀명#포지션#경기#타석#타수#안타#홈런#득점#타점#볼넷#삼진#도루
			System.out.println("------------------------------------------------------------------------------------------------------");
			System.out.printf("ID\t 선수명\t 팀명\t 포지션\t 경기\t 타석\t 타수\t 안타\t 홈런\t 득점\t 타점\t 볼넷\t 삼진\t 도루\n");
			System.out.println("------------------------------------------------------------------------------------------------------");
			for(i=0; i<playerNum; i++){
				if(players[i].getTeamName().equals("KT")){
					if(players[i].getPosition() !=  POSITION_INFO.PITCHER){
						this.printBatter(players[i]);
					}
					
				}
			}
			break;
		case 9:
			System.out.println("투수의 정보입니다.");
			// NO#선수명#팀명#포지션#승#패#세이브#홀드#블론#경기#선발#이닝#삼진#볼넷#홈런
			System.out.println("------------------------------------------------------------------------------------------------------");
			System.out.printf("ID\t 선수명\t 팀명\t 포지션\t 승\t 패\t 세이브\t 홀드\t 블론\t 경기\t 선발\t 이닝\t 삼진\t 볼넷\t 홈런\n");
			System.out.println("------------------------------------------------------------------------------------------------------");

			for(i=0; i<playerNum; i++){
				if(players[i].getTeamName().equals("삼성")){
					if(players[i].getPosition() ==  POSITION_INFO.PITCHER){
						this.printPitcher(players[i]);
					}
				}
			}
			System.out.println("타자의 정보입니다.");
			//NO#선수명#팀명#포지션#경기#타석#타수#안타#홈런#득점#타점#볼넷#삼진#도루
			System.out.println("------------------------------------------------------------------------------------------------------");
			System.out.printf("ID\t 선수명\t 팀명\t 포지션\t 경기\t 타석\t 타수\t 안타\t 홈런\t 득점\t 타점\t 볼넷\t 삼진\t 도루\n");
			System.out.println("------------------------------------------------------------------------------------------------------");
			for(i=0; i<playerNum; i++){
				if(players[i].getTeamName().equals("삼성")){
					if(players[i].getPosition() !=  POSITION_INFO.PITCHER){
						this.printBatter(players[i]);
					}
					
				}
			}
			break;
		case 10:
			System.out.println("투수의 정보입니다.");
			// NO#선수명#팀명#포지션#승#패#세이브#홀드#블론#경기#선발#이닝#삼진#볼넷#홈런
			System.out.println("------------------------------------------------------------------------------------------------------");
			System.out.printf("ID\t 선수명\t 팀명\t 포지션\t 승\t 패\t 세이브\t 홀드\t 블론\t 경기\t 선발\t 이닝\t 삼진\t 볼넷\t 홈런\n");
			System.out.println("------------------------------------------------------------------------------------------------------");

			for(i=0; i<playerNum; i++){
				if(players[i].getTeamName().equals("한화")){
					if(players[i].getPosition() ==  POSITION_INFO.PITCHER){
						this.printPitcher(players[i]);
					}
				}
			}
			System.out.println("타자의 정보입니다.");
			//NO#선수명#팀명#포지션#경기#타석#타수#안타#홈런#득점#타점#볼넷#삼진#도루
			System.out.println("------------------------------------------------------------------------------------------------------");
			System.out.printf("ID\t 선수명\t 팀명\t 포지션\t 경기\t 타석\t 타수\t 안타\t 홈런\t 득점\t 타점\t 볼넷\t 삼진\t 도루\n");
			System.out.println("------------------------------------------------------------------------------------------------------");
			for(i=0; i<playerNum; i++){
				if(players[i].getTeamName().equals("한화")){
					if(players[i].getPosition() !=  POSITION_INFO.PITCHER){
						this.printBatter(players[i]);
					}
					
				}
			}
			break;

		default:
			System.out.println("잘못 입력하셨습니다.");
			break;
		}
	}


	@Override
	public void insertPlayer() {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public void printAllPlayer() {
		// TODO Auto-generated method stub
		this.printBatters();
		this.printPitchers();
	}

	

	@Override
	public void printPlayer(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void comparePlayer() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void deletePlayer() {
		// TODO Auto-generated method stub
		System.out.println("다음 리스트에서 삭제할 선수의 id를 입력하세요");
		this.printAllPlayer();
		System.out.printf("삭제 선수 id 입력 :");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		player_dataMng.deletePlayer(id);
		System.out.println("삭제 결과");
		this.printAllPlayer();
	}

	@Override
	public int[] compareSP(int id, int selectMenu, int selectsubMenu) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void fileOpenPlayer() throws FileNotFoundException, Exception {
		// TODO Auto-generated method stub

		FileReader fReader = new FileReader("baseball_player_batter.txt");
		BufferedReader bReader = new BufferedReader(fReader);

		String str = null;	
		StringTokenizer st;	
		bReader.readLine();
		//첫줄을 버리기 위해 실행
		
		while ( (str = bReader.readLine()) !=null){
			st = new StringTokenizer(str, "#");
			
			//데이터의 맨 앞의 NO를 버리기 위해서 한번 실행한다.
			st.nextToken();
			
			String playName = st.nextToken();
			String teamName = st.nextToken();
			POSITION_INFO position = POSITION_INFO.valueOf(st.nextToken());
			int gameNumber = Integer.parseInt(st.nextToken());
			int plateAppearance = Integer.parseInt(st.nextToken());
			int atBat = Integer.parseInt(st.nextToken());
			int hit = Integer.parseInt(st.nextToken());
			int homeRun = Integer.parseInt(st.nextToken());
			int run = Integer.parseInt(st.nextToken());
			int runsBattedIn = Integer.parseInt(st.nextToken());
			int baseOnBalls = Integer.parseInt(st.nextToken());
			int strikeOut = Integer.parseInt(st.nextToken());
			int stealBase = Integer.parseInt(st.nextToken());
			  
			batter b = new batter(
					   playName,
					   teamName,
					   position,
					   gameNumber,
					   plateAppearance,
					   atBat,
					   hit,
					   homeRun,
					   run,
					   runsBattedIn,
					   baseOnBalls,
					   strikeOut,
					   stealBase);
			
			  
			player_dataMng.insertPlayer(b);
		}
		
		
		bReader.close();
		fReader.close();
		// batter를 받는 곳
		

		fReader = new FileReader("baseball_player_pitcher.txt");
		bReader = new BufferedReader(fReader);

		str = null;	
			
		bReader.readLine();
		//첫줄을 버리기 위해 실행
		
		while ( (str = bReader.readLine()) !=null){
			st = new StringTokenizer(str, "#");
			
			// 데이터의 맨 앞의 NO를 버리기 위해서 한번 실행한다.
			st.nextToken();
			String playName = st.nextToken();
			String teamName = st.nextToken();
			POSITION_INFO position = POSITION_INFO.valueOf(st.nextToken());
			int winningNumber = Integer.parseInt(st.nextToken());
			int losingNumber = Integer.parseInt(st.nextToken());
			int save = Integer.parseInt(st.nextToken());
			int holdSave = Integer.parseInt(st.nextToken());
			int blownSave = Integer.parseInt(st.nextToken());
			int gameNumber = Integer.parseInt(st.nextToken());
			int staringNumber = Integer.parseInt(st.nextToken());
			float inning = Float.parseFloat(st.nextToken());
			float strikeOutPerNine = Float.parseFloat(st.nextToken());
			float baseOnBallsOutPerNine = Float.parseFloat(st.nextToken());
			float homeRunPerNine = Float.parseFloat(st.nextToken());

			  pitcher p = new pitcher( playName,
					   teamName,
					   position,
					   winningNumber,
					   losingNumber,
					   save,
					   holdSave,
					   blownSave,
					   gameNumber,
					   staringNumber,
					   inning,
					   strikeOutPerNine,
					   baseOnBallsOutPerNine,
					   homeRunPerNine);
			  
			  
			player_dataMng.insertPlayer(p);
		}

		bReader.close();
		fReader.close();
		
		
	}

	@Override
	public void printBatters() {
		// TODO Auto-generated method stub
		player[] players = player_dataMng.getPlayers();
		int playerNum = player_dataMng.getPlayerSize();
		int i;
		System.out.println("타자의 정보입니다.");
		//NO#선수명#팀명#포지션#경기#타석#타수#안타#홈런#득점#타점#볼넷#삼진#도루
		System.out.println("------------------------------------------------------------------------------------------------------");
		System.out.printf("ID\t 선수명\t 팀명\t 포지션\t 경기\t 타석\t 타수\t 안타\t 홈런\t 득점\t 타점\t 볼넷\t 삼진\t 도루\n");
		System.out.println("------------------------------------------------------------------------------------------------------");
				
		for(i=0; i<playerNum ; i++){
			if(players[i].getPosition() != POSITION_INFO.PITCHER){
				this.printBatter(players[i]);
			}
		}
		
	}
	
	@Override
	public void printBatter(player p) {
		// TODO Auto-generated method stub
		System.out.printf("%d\t %s\t %s\t %s\t %d\t %d\t %d\t %d\t %d\t %d\t %d\t %d\t %d\t %d\n",
				((batter)p).getId(),
				((batter)p).getPlayName(),
				((batter)p).getTeamName(),
				((batter)p).getPositionKorean(),
				((batter)p).getGameNumber(),
				((batter)p).getPlateAppearance(),
				((batter)p).getAtBat(),
				((batter)p).getHit(),
				((batter)p).getHomeRun(),
				((batter)p).getRun(),
				((batter)p).getRunsBattedIn(),
				((batter)p).getBaseOnBalls(),
				((batter)p).getStrikeOut(),
				((batter)p).getStealBase()
				);
	}


	@Override
	public void printPitchers() {
		// TODO Auto-generated method stub
		player[] players = player_dataMng.getPlayers();
		int playerNum = player_dataMng.getPlayerSize();
		int i;
		System.out.println("투수의 정보입니다.");
		//NO#선수명#팀명#포지션#승#패#세이브#홀드#블론#경기#선발#이닝#삼진#볼넷#홈런
		System.out.println("------------------------------------------------------------------------------------------------------");
		System.out.printf("ID\t 선수명\t 팀명\t 포지션\t 승\t 패\t 세이브\t 홀드\t 블론\t 경기\t 선발\t 이닝\t 삼진\t 볼넷\t 홈런\n");
		System.out.println("------------------------------------------------------------------------------------------------------");
		
		for(i=0; i<playerNum ; i++){
			if(players[i].getPosition() == POSITION_INFO.PITCHER){
				this.printPitcher(players[i]);
			}
		}
	}


	@Override
	public void printPitcher(player p) {
		// TODO Auto-generated method stub
		System.out.printf("%d\t %s\t %s\t %s\t %d\t %d\t %d\t %d\t %d\t %d\t %d\t %.3f\t %.3f\t %.3f\t %.3f\n",
				((pitcher)p).getId(),
				((pitcher)p).getPlayName(),
				((pitcher)p).getTeamName(),
				((pitcher)p).getPositionKorean(),
				((pitcher)p).getWinningNumber(),
				((pitcher)p).getLosingNumber(),
				((pitcher)p).getSave(),
				((pitcher)p).getHoldSave(),
				((pitcher)p).getBlownSave(),
				((pitcher)p).getGameNumber(),
				((pitcher)p).getStaringNumber(),
				((pitcher)p).getInning(),
				((pitcher)p).getStrikeOutPerNine(),
				((pitcher)p).getBaseOnBallsOutPerNine(),
				((pitcher)p).getHomeRunPerNine()
				);
	}

	
}
