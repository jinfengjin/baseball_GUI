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
		
		System.out.printf("���� �Է� :");
		String teamName = sc.next();
		
		System.out.printf("���� �Է� :");		
		int gameNumber = sc.nextInt() ;
		
		System.out.printf("�¸��� ���� �Է� :");
		int winningNumber = sc.nextInt() ;
		
		System.out.printf("���º� ���� �Է� :");
		int tieNumber = sc.nextInt() ;
				
		System.out.printf("���� ���� �Է� :");
		int losingNumber = sc.nextInt() ;
		
		System.out.printf("�·� �Է� :");
		float winningRate = sc.nextFloat();
		
		System.out.printf("���� �Է� :");
		int run = sc.nextInt() ;
		
		System.out.printf("Ȩ���� �Է� :");
		int homeRun = sc.nextInt() ;
		
		System.out.printf("����� �Է� :");
		int stealBase = sc.nextInt() ;
		
		System.out.printf("������ �Է� :");
		float baseOnBallsRate = sc.nextFloat();
		
		System.out.printf("������ �Է� :");
		float strikeOutRate = sc.nextFloat();
		
		System.out.printf("Ÿ�� �Է� :");
		float runsBattedInRate = sc.nextFloat();
		
		System.out.printf("����� �Է� :");
		float onBaseAverage = sc.nextFloat();
		
		System.out.printf("��Ÿ�� �Է� :");
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
		System.out.printf("ID\t ����\t ���\t ��\t ��\t ��\t �·�\t ����\t Ȩ��\t ����\t ����%%\t ����%%\t Ÿ��\t �����\t ��Ÿ��\n");
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
		System.out.println("���� ����Ʈ���� �� ���� ��ȣ�� �����ϼ���");
		this.printAllTeam();
		System.out.printf("�� �� ��ȣ �Է� :");

		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();

		System.out.println("====================");
		System.out.println("1. ���� ��");
		System.out.println("2. �¼� ��");
		System.out.println("3. ���ºμ� ��");
		System.out.println("4. �й�� ��");
		System.out.println("5. �·� ��");
		System.out.println("6. ���� ��");
		System.out.println("7. Ȩ�� ��");
		System.out.println("8. ���� ��");
		System.out.println("9. ���ݷ� ��");
		System.out.println("10. ������ ��");
		System.out.println("11. Ÿ�� ��");
		System.out.println("12. ����� ��");
		System.out.println("13. ��Ÿ�� ��");
		System.out.println("0. ���� �޴���");
		System.out.println("====================");
		System.out.printf("�޴� ���� :");
		int selectMenu =  sc.nextInt();
		
		if(selectMenu==0){
			return;
		}
		

		System.out.println("====================");
		System.out.println("1. ũ�ų� ���� �� ��� ");
		System.out.println("2. �۰ų� ���� �� ��� ");		
		System.out.println("====================");

		int selectsubMenu =  sc.nextInt();
		//ids�� ã�� ������ ID������ ������ �ִ�. ���� IDS[0]��° ������ �迭�� �� �ִ� ID�� ������ ������ �ִ�
		int[] ids = new int[50];
		
		team t = new team(team_dataMng.getTeam(id));
		Object obj[] =  t.toArray();
		
		ids = this.compareST(id, selectMenu,selectsubMenu);
	
		System.out.println("------------------------------------------------------------------------------------------------------");
		System.out.printf("%s�� ���ؼ� ���� �� ����Ʈ �Դϴ�.\n",obj[1]);
		System.out.printf("ID\t ����\t ���\t ��\t ��\t ��\t �·�\t ����\t Ȩ��\t ����\t ����%%\t ����%%\t Ÿ��\t �����\t ��Ÿ��\n");
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
		//selectMenu+1�� obj[0]�� id��, obj[1]�� �����̴�.
		//�񱳸� �Ұ��̱� ������ float�� �ϴ� ĳ�����ؼ� ���Ѵ�.
		float temp = Float.parseFloat((obj[selectMenu+1].toString()));
		
		int i,j;
		//�ᱹ j�� ids�� �� �ִ� �迭�� ũ�Ⱑ �ȴ�.
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
		
		System.out.println("���� ����Ʈ���� ������ �� ��ȣ�� �����ϼ���");
		System.out.println("------------------------------------------------------------------------------------------------------");
		System.out.printf("ID\t ����\t ���\t ��\t ��\t ��\t �·�\t ����\t Ȩ��\t ����\t ����%%\t ����%%\t Ÿ��\t �����\t ��Ÿ��\n");
		System.out.println("------------------------------------------------------------------------------------------------------");
		this.printAllTeam();
		System.out.printf("������ �� ID �Է� :");
		int id = sc.nextInt();
		this.printTeam(id);
		
		System.out.println("====================");
		System.out.println("1. ���� ����");
		System.out.println("2. �¼� ����");
		System.out.println("3. ���ºμ� ����");
		System.out.println("4. �й�� ����");
		System.out.println("5. �·� ����");
		System.out.println("6. ���� ����");
		System.out.println("7. Ȩ�� ����");
		System.out.println("8. ���� ����");
		System.out.println("9. ���ݷ� ����");
		System.out.println("10. ������ ����");
		System.out.println("11. Ÿ�� ����");
		System.out.println("12. ����� ����");
		System.out.println("13. ��Ÿ�� ����");
		System.out.println("0. ���� �޴���");
		System.out.println("====================");
		System.out.printf("�޴� ���� :");
		int selectMenu =  sc.nextInt();
		int value;
		float fvalue;
		switch (selectMenu) {
		case 1:
			System.out.printf("���� �Է� :");
			value = sc.nextInt();
			team_dataMng.modifyTeam(id, selectMenu, value);
			break;
		case 2:

			System.out.printf("�¼� �Է� :");
			value = sc.nextInt();
			team_dataMng.modifyTeam(id, selectMenu, value);
			break;
		case 3:

			System.out.printf("���ºμ� �Է� :");
			value = sc.nextInt();
			team_dataMng.modifyTeam(id, selectMenu, value);
			break;
		case 4:

			System.out.printf("�й�� �Է� :");
			value = sc.nextInt();
			team_dataMng.modifyTeam(id, selectMenu, value);
			break;
		case 5:

			System.out.printf("�·� �Է� :");
			fvalue = sc.nextFloat();
			team_dataMng.modifyTeam(id, selectMenu, fvalue);
			break;
		case 6:

			System.out.printf("���� �Է� :");
			value = sc.nextInt();
			team_dataMng.modifyTeam(id, selectMenu, value);
			break;
		case 7:

			System.out.printf("Ȩ�� �Է� :");
			value = sc.nextInt();
			team_dataMng.modifyTeam(id, selectMenu, value);
			break;
		case 8:

			System.out.printf("���� �Է� :");
			value = sc.nextInt();
			team_dataMng.modifyTeam(id, selectMenu, value);
			break;
		case 9:

			System.out.printf("������ �Է� :");
			fvalue = sc.nextFloat();
			team_dataMng.modifyTeam(id, selectMenu, fvalue);
			break;
		case 10:

			System.out.printf("������ �Է� :");
			fvalue = sc.nextFloat();
			team_dataMng.modifyTeam(id, selectMenu, fvalue);
			break;
		case 11:

			System.out.printf("Ÿ�� �Է� :");
			fvalue = sc.nextFloat();
			team_dataMng.modifyTeam(id, selectMenu, fvalue);
			break;

		case 12:

			System.out.printf("����� �Է� :");
			fvalue = sc.nextFloat();
			team_dataMng.modifyTeam(id, selectMenu, fvalue);
			break;

		case 13:

			System.out.printf("��Ÿ�� �Է� :");
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
		System.out.println("���� ����Ʈ���� ������ �� ��ȣ�� �����ϼ���");
		this.printAllTeam();
		System.out.printf("���� �� ��ȣ �Է� :");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		team_dataMng.deleteTeam(id);
		System.out.println("���� ���");
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
			
			//�������� �� ���� NO�� ������ ���ؼ� �ѹ� �����Ѵ�.
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
