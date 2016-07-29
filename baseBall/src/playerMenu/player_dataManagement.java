package playerMenu;

import java.io.Serializable;

import player.POSITION_INFO;
import player.batter;
import player.pitcher;
import player.player;

public class player_dataManagement implements player_dataManagementInterface, Serializable{


	player[] players = new player[5000];
	private int playerSize;
	
	public player_dataManagement(){
		setPlayerSize(0);
	}
	

	public player_dataManagement(player_dataManagement player_dataMng){
		this.players = player_dataMng.getPlayers();
		this.setPlayerSize(player_dataMng.getPlayerSize());
	}


	@Override
	public void insertPlayer(player p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean deletePlayer(int id) {
		int i;
		boolean flg = true;
		
		for(i=0;i<playerSize;i++){
			if(players[i].getId() == id){
				flg=false;
				break;
			}
		}
		
		if(flg){
			return false;
		}
		
		for( ;i<playerSize-1; i++){
			if(players[i+1].getPosition() == POSITION_INFO.PITCHER){
				players[i] = new pitcher((pitcher)players[i+1]);
			}else{
				players[i] = new batter((batter)players[i+1]);
			}
		}
		playerSize--;
		
		return true;
	}


	@Override
	public player getPlayer(int id) {
		// TODO Auto-generated method stub
		int i;
		for(i=0; i<playerSize; i++){
			if(players[i].getId() == id){
				return players[i];
			}
		}		
		return null;
	}


	@Override
	public player[] getPlayers() {
		// TODO Auto-generated method stub
		return players;
	}


	public int getPlayerSize() {
		return playerSize;
	}


	public void setPlayerSize(int playerSize) {
		this.playerSize = playerSize;
	}


	@Override
	public void insertPlayer(pitcher p) {
		// TODO Auto-generated method stub
		players[getPlayerSize()] = new pitcher(p);
		playerSize++;
	}


	@Override
	public void insertPlayer(batter b) {
		// TODO Auto-generated method stub
		players[getPlayerSize()] = new batter(b);
		playerSize++;
	}
	
}
