package teamMenu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.util.StringTokenizer;

import team.team;

public class team_msgControl implements team_msgControlInterface {

	private team_dataManagement team_dataMng;
	
	public team_msgControl(team_dataManagement team_dataMng){
		this.team_dataMng = team_dataMng;
	}

	@Override
	public void insertTeam() {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("팀명 입력 :");
		String teamName = sc.next();
		
		System.out.printf("경기수 입력 :");		
		int gameNumber = sc.nextInt() ;
		
		System.out.printf("승리한 경기수 입력 :");
		int winningNumber = sc.nextInt() ;
		
		System.out.printf("무승부 경기수 입력 :");
		int tieNumber = sc.nextInt() ;
				
		System.out.printf("패한 경기수 입력 :");
		int losingNumber = sc.nextInt() ;
		
		System.out.printf("승률 입력 :");
		float winningRate = sc.nextFloat();
		
		System.out.printf("득점 입력 :");
		int run = sc.nextInt() ;
		
		System.out.printf("홈런수 입력 :");
		int homeRun = sc.nextInt() ;
		
		System.out.printf("도루수 입력 :");
		int stealBase = sc.nextInt() ;
		
		System.out.printf("볼넷율 입력 :");
		float baseOnBallsRate = sc.nextFloat();
		
		System.out.printf("삼진율 입력 :");
		float strikeOutRate = sc.nextFloat();
		
		System.out.printf("타율 입력 :");
		float runsBattedInRate = sc.nextFloat();
		
		System.out.printf("출루율 입력 :");
		float onBaseAverage = sc.nextFloat();
		
		System.out.printf("장타율 입력 :");
		float sluggingAverage = sc.nextFloat();
		
		
		team t = new team(teamName,
				 gameNumber,
				 winningNumber,
				 tieNumber,
				 losingNumber,
				 winningRate,
				 run,
				 homeRun,
				 stealBase,
				 baseOnBallsRate,
				 strikeOutRate,
				 runsBattedInRate,
				 onBaseAverage,
				 sluggingAverage);
		team_dataMng.insertTeam(t);
		
	}

	@Override
	public void printAllTeam() {
		// TODO Auto-generated method stub
		team[] teams = team_dataMng.getTeams();
		int teamNum = team_dataMng.getTeamSize();
		int i;
		System.out.println("------------------------------------------------------------------------------------------------------");
		System.out.printf("ID\t 팀명\t 경기\t 승\t 무\t 패\t 승률\t 득점\t 홈런\t 도루\t 볼넷%%\t 삼진%%\t 타율\t 출루율\t 장타율\n");
		System.out.println("------------------------------------------------------------------------------------------------------");
		
		for(i =0; i< teamNum; i++){
			Object obj[] = teams[i].toArray();
			System.out.printf("%d\t %s\t %d\t %d\t %d\t %d\t %.3f\t %d\t %d\t %d\t %.1f\t %.1f\t %.3f\t %.3f\t %.3f\n",	obj[0], obj[1], obj[2], obj[3], obj[4], obj[5], obj[6], obj[7], obj[8], obj[9], obj[10], obj[11], obj[12], obj[13], obj[14]);
		}

		System.out.println("------------------------------------------------------------------------------------------------------");
	}

	
	@Override
	public void printSubTeam(team[] teams) {
		// TODO Auto-generated method stub
		
	}
	

	@Override
	public void printTeam(int id) {
		// TODO Auto-generated method stub
		team t = new team(team_dataMng.getTeam(id));
		Object obj[] =  t.toArray();
		System.out.printf("%d\t %s\t %d\t %d\t %d\t %d\t %.3f\t %d\t %d\t %d\t %.1f\t %.1f\t %.3f\t %.3f\t %.3f\n",	obj[0], obj[1], obj[2], obj[3], obj[4], obj[5], obj[6], obj[7], obj[8], obj[9], obj[10], obj[11], obj[12], obj[13], obj[14]);
		
	}

	
	@Override
	public void compareTeam() {
		// TODO Auto-generated method stub
		System.out.println("다음 리스트에서 비교 팀의 번호를 선택하세요");
		this.printAllTeam();
		System.out.printf("비교 팀 번호 입력 :");

		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();

		System.out.println("====================");
		System.out.println("1. 경기수 비교");
		System.out.println("2. 승수 비교");
		System.out.println("3. 무승부수 비교");
		System.out.println("4. 패배수 비교");
		System.out.println("5. 승률 비교");
		System.out.println("6. 득점 비교");
		System.out.println("7. 홈런 비교");
		System.out.println("8. 도루 비교");
		System.out.println("9. 볼넷률 비교");
		System.out.println("10. 삼진율 비교");
		System.out.println("11. 타율 비교");
		System.out.println("12. 출루율 비교");
		System.out.println("13. 장타율 비교");
		System.out.println("0. 상위 메뉴로");
		System.out.println("====================");
		System.out.printf("메뉴 선택 :");
		int selectMenu =  sc.nextInt();
		
		if(selectMenu==0){
			return;
		}
		

		System.out.println("====================");
		System.out.println("1. 크거나 같은 팀 출력 ");
		System.out.println("2. 작거나 같은 팀 출력 ");		
		System.out.println("====================");

		int selectsubMenu =  sc.nextInt();
		//ids는 찾은 값들의 ID값들을 가지고 있다. 또한 IDS[0]번째 값에는 배열에 들어가 있는 ID의 개수를 가지고 있다
		int[] ids = new int[50];
		
		team t = new team(team_dataMng.getTeam(id));
		Object obj[] =  t.toArray();
		
		ids = this.compareST(id, selectMenu,selectsubMenu);
	
		System.out.println("------------------------------------------------------------------------------------------------------");
		System.out.printf("%s를 비교해서 만든 팀 리스트 입니다.\n",obj[1]);
		System.out.printf("ID\t 팀명\t 경기\t 승\t 무\t 패\t 승률\t 득점\t 홈런\t 도루\t 볼넷%%\t 삼진%%\t 타율\t 출루율\t 장타율\n");
		System.out.println("------------------------------------------------------------------------------------------------------");
		
		
		int i;
		for(i=1; i<=ids[0]; i++){
			this.printTeam(ids[i]);
		}
		System.out.println("------------------------------------------------------------------------------------------------------");
		
	}

	@Override
	public int[] compareST(int id, int selectMenu, int selectsubMenu) {
		int[] ids = new int[50];
		team[] teams = team_dataMng.getTeams();
		team t = new team(team_dataMng.getTeam(id));
		Object obj[] =  t.toArray();
		
		int oriId = id;
		//selectMenu+1은 obj[0]은 id값, obj[1]은 팀명이다.
		//비교를 할것이기 때문에 float로 일단 캐스팅해서 비교한다.
		float temp = Float.parseFloat((obj[selectMenu+1].toString()));
		
		int i,j;
		//결국 j가 ids에 들어가 있는 배열의 크기가 된다.
		j=0;
		if(selectsubMenu == 1){
			for(i=0; i<team_dataMng.getTeamSize(); i++){
				obj = teams[i].toArray();
				float temp2 = Float.parseFloat((obj[selectMenu+1].toString()));
				int temp3 = Integer.parseInt(obj[0].toString());
				
				if(temp2 >= temp && temp3 != oriId ){
					j++;
					ids[j]=temp3;
				}
			}
			ids[0]=j;			
		}else if (selectsubMenu == 2){
			for(i=0; i<team_dataMng.getTeamSize(); i++){
				obj = teams[i].toArray();
				float temp2 = Float.parseFloat((obj[selectMenu+1].toString()));
				int temp3 = Integer.parseInt(obj[0].toString());
				if(temp2 <= temp && temp3 != oriId ){
					j++;
					ids[j]=temp3;
				}
			}
			ids[0]=j;
		}
		
		return ids;
	}

	
	
	
	@Override
	public void modifyTeam() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("다음 리스트에서 수정할 팀 번호를 선택하세요");
		System.out.println("------------------------------------------------------------------------------------------------------");
		System.out.printf("ID\t 팀명\t 경기\t 승\t 무\t 패\t 승률\t 득점\t 홈런\t 도루\t 볼넷%%\t 삼진%%\t 타율\t 출루율\t 장타율\n");
		System.out.println("------------------------------------------------------------------------------------------------------");
		this.printAllTeam();
		System.out.printf("수정할 팀 ID 입력 :");
		int id = sc.nextInt();
		this.printTeam(id);
		
		System.out.println("====================");
		System.out.println("1. 경기수 수정");
		System.out.println("2. 승수 수정");
		System.out.println("3. 무승부수 수정");
		System.out.println("4. 패배수 수정");
		System.out.println("5. 승률 수정");
		System.out.println("6. 득점 수정");
		System.out.println("7. 홈런 수정");
		System.out.println("8. 도루 수정");
		System.out.println("9. 볼넷률 수정");
		System.out.println("10. 삼진율 수정");
		System.out.println("11. 타율 수정");
		System.out.println("12. 출루율 수정");
		System.out.println("13. 장타율 수정");
		System.out.println("0. 상위 메뉴로");
		System.out.println("====================");
		System.out.printf("메뉴 선택 :");
		int selectMenu =  sc.nextInt();
		int value;
		float fvalue;
		switch (selectMenu) {
		case 1:
			System.out.printf("경기수 입력 :");
			value = sc.nextInt();
			team_dataMng.modifyTeam(id, selectMenu, value);
			break;
		case 2:

			System.out.printf("승수 입력 :");
			value = sc.nextInt();
			team_dataMng.modifyTeam(id, selectMenu, value);
			break;
		case 3:

			System.out.printf("무승부수 입력 :");
			value = sc.nextInt();
			team_dataMng.modifyTeam(id, selectMenu, value);
			break;
		case 4:

			System.out.printf("패배수 입력 :");
			value = sc.nextInt();
			team_dataMng.modifyTeam(id, selectMenu, value);
			break;
		case 5:

			System.out.printf("승률 입력 :");
			fvalue = sc.nextFloat();
			team_dataMng.modifyTeam(id, selectMenu, fvalue);
			break;
		case 6:

			System.out.printf("득점 입력 :");
			value = sc.nextInt();
			team_dataMng.modifyTeam(id, selectMenu, value);
			break;
		case 7:

			System.out.printf("홈런 입력 :");
			value = sc.nextInt();
			team_dataMng.modifyTeam(id, selectMenu, value);
			break;
		case 8:

			System.out.printf("도루 입력 :");
			value = sc.nextInt();
			team_dataMng.modifyTeam(id, selectMenu, value);
			break;
		case 9:

			System.out.printf("볼넷율 입력 :");
			fvalue = sc.nextFloat();
			team_dataMng.modifyTeam(id, selectMenu, fvalue);
			break;
		case 10:

			System.out.printf("삼진율 입력 :");
			fvalue = sc.nextFloat();
			team_dataMng.modifyTeam(id, selectMenu, fvalue);
			break;
		case 11:

			System.out.printf("타율 입력 :");
			fvalue = sc.nextFloat();
			team_dataMng.modifyTeam(id, selectMenu, fvalue);
			break;

		case 12:

			System.out.printf("출루율 입력 :");
			fvalue = sc.nextFloat();
			team_dataMng.modifyTeam(id, selectMenu, fvalue);
			break;

		case 13:

			System.out.printf("장타율 입력 :");
			fvalue = sc.nextFloat();
			team_dataMng.modifyTeam(id, selectMenu, fvalue);
			break;


		default:
			break;
		}
		
	}

	@Override
	public void deleteTeam() {
		// TODO Auto-generated method stub
		System.out.println("다음 리스트에서 삭제할 팀 번호를 선택하세요");
		this.printAllTeam();
		System.out.printf("삭제 팀 번호 입력 :");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		team_dataMng.deleteTeam(id);
		System.out.println("삭제 결과");
		this.printAllTeam();
	}

	@Override
	public void fileOpenTeams() throws Exception {
		// TODO Auto-generated method stub

	
		FileReader fReader = new FileReader("baseball_team_info.txt");
		BufferedReader bReader = new BufferedReader(fReader);

		String str = null;	
		StringTokenizer st;	
		bReader.readLine();
		while ( (str = bReader.readLine()) !=null){
			st = new StringTokenizer(str, "#");
			
			//데이터의 맨 앞의 NO를 버리기 위해서 한번 실행한다.
			st.nextToken();
			
			String teamName = st.nextToken();
			int gameNumber = Integer.parseInt(st.nextToken()) ;
			int winningNumber = Integer.parseInt(st.nextToken()) ;
			int tieNumber = Integer.parseInt(st.nextToken()) ;
			int losingNumber = Integer.parseInt(st.nextToken()) ;
			float winningRate = Float.parseFloat(st.nextToken());
			int run = Integer.parseInt(st.nextToken()) ;
			int homeRun = Integer.parseInt(st.nextToken()) ;
			int stealBase = Integer.parseInt(st.nextToken()) ;
			float baseOnBallsRate = Float.parseFloat(st.nextToken());
			float strikeOutRate = Float.parseFloat(st.nextToken());
			float runsBattedInRate = Float.parseFloat(st.nextToken());
			float onBaseAverage = Float.parseFloat(st.nextToken());
			float sluggingAverage = Float.parseFloat(st.nextToken());
			
			
			team t = new team(teamName,
					 gameNumber,
					 winningNumber,
					 tieNumber,
					 losingNumber,
					 winningRate,
					 run,
					 homeRun,
					 stealBase,
					 baseOnBallsRate,
					 strikeOutRate,
					 runsBattedInRate,
					 onBaseAverage,
					 sluggingAverage);
			team_dataMng.insertTeam(t);
		}
		
		
		bReader.close();
		fReader.close();
	}




	
}
