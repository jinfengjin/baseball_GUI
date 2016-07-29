package player;

import java.io.Serializable;

public class player implements Serializable {
	
	public static int inx;
	public static int size;
	
	public static int getInx() {
		return inx;
	}
	public static void setInx(int inx) {
		player.inx = inx;
	}	
	public static int getSize() {
		return size;
	}
	public static void setSize(int size) {
		player.size = size;
	}
//asd;	   
	protected int id;
	protected String playName;
	protected String teamName;
	protected int gameNumber;
	protected POSITION_INFO position;
	protected POSITION_INFO_KOREAN positionKorean;
	
	public player(String playName,
				  String teamName,
				  int gameNumber,
				  POSITION_INFO position){
		this.playName = playName;
		this.teamName = teamName;
		this.gameNumber = gameNumber;
		this.position = position;
		this.id = inx;
		this.size++;
		this.inx++;
		
	}
	
	public player(player p){
		this.id = p.id;
		this.playName = p.playName;
		this.teamName = p.teamName;
		this.gameNumber = p.gameNumber;
		this.position = p.position;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPlayName() {
		return playName;
	}
	public void setPlayName(String playName) {
		this.playName = playName;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public int getGameNumber() {
		return gameNumber;
	}
	public void setGameNumber(int gameNumber) {
		this.gameNumber = gameNumber;
	}
	public POSITION_INFO getPosition() {
		return position;
	}
	public void setPosition(POSITION_INFO position) {
		this.position = position;
	}
}
