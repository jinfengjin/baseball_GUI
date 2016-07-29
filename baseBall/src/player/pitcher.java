package player;

import java.io.Serializable;

public class pitcher extends player implements Serializable {
	
	private int winningNumber;
	private int losingNumber;
	private int save;
	private int holdSave;
	private int blownSave;
	private int staringNumber;
	private float inning;
	private float strikeOutPerNine;
	private float baseOnBallsOutPerNine;
	private float homeRunPerNine;
	
	public pitcher(String playName,
			  String teamName,
			  POSITION_INFO position,
			  int winningNumber,
			  int losingNumber,
			  int save,
			  int holdSave,
			  int blownSave,
			  int gameNumber,
			  int staringNumber,
			  float inning,
			  float strikeOutPerNine,
			  float baseOnBallsOutPerNine,
			  float homeRunPerNine){
		super(playName, teamName, gameNumber, position);
		this.winningNumber		    =winningNumber;
		this.losingNumber           =losingNumber;
		this.save					=save;
		this.holdSave               =holdSave;
		this.blownSave              =blownSave;
		this.gameNumber				=gameNumber;
		this.staringNumber          =staringNumber;
		this.inning                 =inning;
		this.strikeOutPerNine       =strikeOutPerNine;
		this.baseOnBallsOutPerNine  =baseOnBallsOutPerNine;
		this.homeRunPerNine         =homeRunPerNine;
	}
	
	public pitcher(pitcher p){
		super(p);
		this.winningNumber		    =p.winningNumber;
		this.losingNumber           =p.losingNumber;
		this.save					=p.save;
		this.holdSave               =p.holdSave;
		this.blownSave              =p.blownSave;
		this.gameNumber				=p.gameNumber;
		this.staringNumber          =p.staringNumber;
		this.inning                 =p.inning;
		this.strikeOutPerNine       =p.strikeOutPerNine;
		this.baseOnBallsOutPerNine  =p.baseOnBallsOutPerNine;
		this.homeRunPerNine         =p.homeRunPerNine;
	}

	public int getWinningNumber() {
		return winningNumber;
	}

	public void setWinningNumber(int winningNumber) {
		this.winningNumber = winningNumber;
	}

	public int getLosingNumber() {
		return losingNumber;
	}

	public void setLosingNumber(int losingNumber) {
		this.losingNumber = losingNumber;
	}

	public int getHoldSave() {
		return holdSave;
	}

	public void setHoldSave(int holdSave) {
		this.holdSave = holdSave;
	}

	public int getBlownSave() {
		return blownSave;
	}

	public void setBlownSave(int blownSave) {
		this.blownSave = blownSave;
	}

	public int getStaringNumber() {
		return staringNumber;
	}

	public void setStaringNumber(int staringNumber) {
		this.staringNumber = staringNumber;
	}

	public float getInning() {
		return inning;
	}

	public void setInning(float inning) {
		this.inning = inning;
	}

	public float getStrikeOutPerNine() {
		return strikeOutPerNine;
	}

	public void setStrikeOutPerNine(float strikeOutPerNine) {
		this.strikeOutPerNine = strikeOutPerNine;
	}

	public float getBaseOnBallsOutPerNine() {
		return baseOnBallsOutPerNine;
	}

	public void setBaseOnBallsOutPerNine(float baseOnBallsOutPerNine) {
		this.baseOnBallsOutPerNine = baseOnBallsOutPerNine;
	}

	public float getHomeRunPerNine() {
		return homeRunPerNine;
	}

	public void setHomeRunPerNine(float homeRunPerNine) {
		this.homeRunPerNine = homeRunPerNine;
	}
	public int getSave() {
		return save;
	}

	public void setSave(int save) {
		this.save = save;
	}
}