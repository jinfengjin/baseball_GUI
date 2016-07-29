package playerMenu;

import player.batter;
import player.pitcher;
import player.player;

public interface player_dataManagementInterface {

	public void insertPlayer(player p);
	public void insertPlayer(pitcher p);
	public void insertPlayer(batter b);
	public boolean deletePlayer(int id);
	public player getPlayer(int id);
	public player[] getPlayers();
}
