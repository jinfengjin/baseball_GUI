package engin;


import java.io.Serializable;
import java.util.ArrayList;

public class team_dataManagement implements team_dataManagementInterface , Serializable {

	team[] teams = new team[500];
	private int teamSize;
	
	ArrayList<team> teamsList = new ArrayList<team>();
	
	public team_dataManagement(){
		teamSize = 0 ;
	}
	
	public team_dataManagement(team_dataManagement team_dataMng){
		this.teams = team_dataMng.getTeams();
		this.teamSize = team_dataMng.getTeamSize();
	}
	
	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	@Override
	public void insertTeam(team t) {
		teamsList.add(t);
		
		teams[teamSize] = new team(t);
		teamSize++;
	}
	@Override
	public boolean deleteTeam(int inx) {
		// TODO Auto-generated method stub
		
		teamsList.remove(inx);
		
		/*
		int i;
		boolean flg = true;
		
		for(i=0;i<teamSize;i++){
			if(teams[i].getId() == id){
				flg=false;
				break;
			}
		}
		
		if(flg){
			return false;
		}
		
		for( ;i<teamSize-1; i++){
			teams[i] = new team(teams[i+1]);
		}
		teamSize--;
		*/
		return true;
	}
	@Override
	public team getTeam(int id) {
		// TODO Auto-generated method stub
		/*
		int i;
		for(i=0; i<teamSize; i++){
			if(teams[i].getId() == id){
				return teams[i];
			}
		}
		*/
		for(team t : teamsList){
			if(t.getId() == id){
				return t;
			}
		}
		
		return null;
	}
	@Override
	public team[] getTeams() {
				
		return teams;
	}
	public ArrayList<team> getTeams_GUI() {
		
		return teamsList;
	}

	@Override
	public void modifyTeam(int id, int select, int value) {
		// TODO Auto-generated method stub
		int i;
		for(i=0; i<teamSize; i++){
			if(teams[i].getId() == id){
				switch (select) {
				case 1:
					teams[i].setGameNumber(value);
					break;
				case 2:
					teams[i].setWinningNumber(value);
					break;
				case 3:
					teams[i].setTieNumber(value);
					break;
				case 4:
					teams[i].setLosingNumber(value);
					break;				
				case 6:
					teams[i].setRun(value);
					break;
				case 7:
					teams[i].setHomeRun(value);
					break;
				case 8:
					teams[i].setStealBase(value);
					break;
				
				default:
					break;
				}
			}
		}
	}

	@Override
	public void modifyTeam(int id, int select, float value) {
		// TODO Auto-generated method stub
		int i;
		for(i=0; i<teamSize; i++){
			if(teams[i].getId() == id){
				switch (select) {
				case 5:
					teams[i].setWinningRate(value);
					break;
				case 9:
					teams[i].setBaseOnBallsRate(value);
					break;
				case 10:
					teams[i].setStrikeOutRate(value);
					break;
				case 11:
					teams[i].setRunsBattedInRate(value);
					break;				
				case 12:
					teams[i].setOnBaseAverage(value);
					break;
				case 13:
					teams[i].setSluggingAverage(value);
					break;
				
				
				default:
					break;
				}
			}
		}
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		teamsList.clear();
	}

	public int getId(int inx) {
		// TODO Auto-generated method stub
		team t = teamsList.get(inx);
		return t.getId();
	}
}
