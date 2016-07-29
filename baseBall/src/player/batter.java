package player;

import java.io.Serializable;

public class batter extends player implements Serializable {
	private int plateAppearance;
	private int atBat;
	private int hit;
	private int homeRun;
	private int run;
	private int runsBattedIn;
	private int baseOnBalls;
	private int strikeOut;
	private int stealBase;
	
	public batter(
			  String playName,
			  String teamName,
			  POSITION_INFO position,
			  int gameNumber,
			  int plateAppearance,
			  int atBat,
			  int hit,
			  int homeRun,
			  int run,
			  int runsBattedIn,
			  int baseOnBalls,
			  int strikeOut,
			  int stealBase){
		
		super(playName, teamName, gameNumber, position);
		
		this.plateAppearance = plateAppearance;
		this.atBat			  = atBat;
		this.hit			  = hit;		
		this.homeRun		  = homeRun;
		this.run			  = run;
		this.runsBattedIn	  = runsBattedIn;
		this.baseOnBalls	  = baseOnBalls;
		this.strikeOut		  = strikeOut;
		this.stealBase		  = stealBase;
	}
	
	public batter(batter b){
		super(b);
		this.plateAppearance  = b.plateAppearance;
		this.atBat			  = b.atBat;
		this.hit			  = b.hit;		
		this.homeRun		  = b.homeRun;
		this.run			  = b.run;
		this.runsBattedIn	  = b.runsBattedIn;
		this.baseOnBalls	  = b.baseOnBalls;
		this.strikeOut		  = b.strikeOut;
		this.stealBase		  = b.stealBase;
	}
	
	public int getPlateAppearance() {
		return plateAppearance;
	}

	public void setPlateAppearance(int plateAppearance) {
		this.plateAppearance = plateAppearance;
	}

	public int getAtBat() {
		return atBat;
	}

	public void setAtBat(int atBat) {
		this.atBat = atBat;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public int getHomeRun() {
		return homeRun;
	}

	public void setHomeRun(int homeRun) {
		this.homeRun = homeRun;
	}

	public int getRun() {
		return run;
	}

	public void setRun(int run) {
		this.run = run;
	}

	public int getRunsBattedIn() {
		return runsBattedIn;
	}

	public void setRunsBattedIn(int runsBattedIn) {
		this.runsBattedIn = runsBattedIn;
	}

	public int getBaseOnBalls() {
		return baseOnBalls;
	}

	public void setBaseOnBalls(int baseOnBalls) {
		this.baseOnBalls = baseOnBalls;
	}

	public int getStrikeOut() {
		return strikeOut;
	}

	public void setStrikeOut(int strikeOut) {
		this.strikeOut = strikeOut;
	}

	public int getStealBase() {
		return stealBase;
	}

	public void setStealBase(int stealBase) {
		this.stealBase = stealBase;
	}

}
