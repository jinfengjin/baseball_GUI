package engin;

import java.util.ArrayList;



public interface team_dataManagementInterface {
	public void insertTeam(team t);
	public boolean deleteTeam(int id);
	public team getTeam(int id);
	public team[] getTeams();
	public void modifyTeam(int id, int select, int value);
	public void modifyTeam(int id, int select, float value);
	
}
