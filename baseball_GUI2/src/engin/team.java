package engin;


import java.io.Serializable;

public class team implements Serializable {
	
	public static int inx;
	public static int size;
	
	public static int getInx() {
		return inx;
	}
	public static void setInx(int inx) {
		team.inx = inx;
	}	
	public static int getSize() {
		return size;
	}
	public static void setSize(int size) {
		team.size = size;
	}
	
	private int id;
	private String teamName;
	private int gameNumber;
	private int winningNumber;
	private int losingNumber;
	private int tieNumber;
	private float winningRate;
	private int run;
	private int homeRun;
	private int stealBase;
	private float baseOnBallsRate;
	private float strikeOutRate;
	private float runsBattedInRate;
	private float onBaseAverage; 
	private float sluggingAverage;
	
	public team(String teamName,
			int gameNumber,	//1
			int winningNumber,	//2
			int tieNumber,	//3
			int losingNumber,	//4
			float winningRate,	//5
			int run,	//6
			int homeRun,	//7
			int stealBase,	//8
			float baseOnBallsRate,	//9
			float strikeOutRate,	//10
			float runsBattedInRate,	//11
			float onBaseAverage,	//12
			float sluggingAverage){	//13
		this.teamName			= teamName;
		this.gameNumber			= gameNumber;
		this.winningNumber		= winningNumber;
		this.losingNumber		= losingNumber;
		this.tieNumber			= tieNumber;
		this.winningRate		= winningRate;
		this.run				= run;
		this.homeRun			= homeRun;
		this.stealBase			= stealBase;
		this.baseOnBallsRate	= baseOnBallsRate;
		this.strikeOutRate		= strikeOutRate;
		this.runsBattedInRate	= runsBattedInRate;
		this.onBaseAverage		= onBaseAverage;
		this.sluggingAverage	= sluggingAverage;
		this.id = team.inx;
		team.inx++;
		team.size++;
	}
	
	public team(team t){
		this.id					= t.id;
		this.teamName			= t.teamName;
		this.gameNumber			= t.gameNumber;
		this.winningNumber		= t.winningNumber;
		this.losingNumber		= t.losingNumber;
		this.tieNumber			= t.tieNumber;
		this.winningRate		= t.winningRate;
		this.run				= t.run;
		this.homeRun			= t.homeRun;
		this.stealBase			= t.stealBase;
		this.baseOnBallsRate	= t.baseOnBallsRate;
		this.strikeOutRate		= t.strikeOutRate;
		this.runsBattedInRate	= t.runsBattedInRate;
		this.onBaseAverage		= t.onBaseAverage;
		this.sluggingAverage	= t.sluggingAverage;		
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getTieNumber() {
		return tieNumber;
	}
	public void setTieNumber(int tieNumber) {
		this.tieNumber = tieNumber;
	}
	public float getWinningRate() {
		return winningRate;
	}
	public void setWinningRate(float winningRate) {
		this.winningRate = winningRate;
	}
	public int getRun() {
		return run;
	}
	public void setRun(int run) {
		this.run = run;
	}
	public int getHomeRun() {
		return homeRun;
	}
	public void setHomeRun(int homeRun) {
		this.homeRun = homeRun;
	}
	public int getStealBase() {
		return stealBase;
	}
	public void setStealBase(int stealBase) {
		this.stealBase = stealBase;
	}
	public float getBaseOnBallsRate() {
		return baseOnBallsRate;
	}
	public void setBaseOnBallsRate(float baseOnBallsRate) {
		this.baseOnBallsRate = baseOnBallsRate;
	}
	public float getStrikeOutRate() {
		return strikeOutRate;
	}
	public void setStrikeOutRate(float strikeOutRate) {
		this.strikeOutRate = strikeOutRate;
	}
	public float getRunsBattedInRate() {
		return runsBattedInRate;
	}
	public void setRunsBattedInRate(float runsBattedInRate) {
		this.runsBattedInRate = runsBattedInRate;
	}
	public float getOnBaseAverage() {
		return onBaseAverage;
	}
	public void setOnBaseAverage(float onBaseAverage) {
		this.onBaseAverage = onBaseAverage;
	}
	public float getSluggingAverage() {
		return sluggingAverage;
	}
	public void setSluggingAverage(float sluggingAverage) {
		this.sluggingAverage = sluggingAverage;
	}
	
	public Object[] toArray(){
		Object obj[]= {this.getId(),
						this.getTeamName(),
						this.getGameNumber(),
						this.getWinningNumber(),
						this.getTieNumber(),
						this.getLosingNumber(),
						this.getWinningRate(),
						this.getRun(),
						this.getHomeRun(),
						this.getStealBase(),
						this.getBaseOnBallsRate(),
						this.getStrikeOutRate(),
						this.getRunsBattedInRate(),
						this.getOnBaseAverage(),
						this.getSluggingAverage()};
		return obj;
	}
	
}
