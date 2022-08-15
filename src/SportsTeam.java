/**
 * 
 * @author johnpaulthomas
 * Abstract class SportsTeam 
 * 
 */
public abstract class SportsTeam {
	
	
	protected String teamName= "";
	protected String teamMascot="";
	protected String headCoach="";
	
	int wins=0;
	int losses=0;
	double winPercentage = 0; //= wins/(wins+losses);
	
	/**
	 * empty argument constructor
	 */
public SportsTeam() {
	
	this.teamName = "";
	this.teamMascot = "";
	this.headCoach = "";
	this.wins = 0;
	this.losses = 0;
	
}//end empty argument constructor
/**
 * preferred constructor
 * @param teamName
 * @param teamMascot
 * @param headCoach
 */
public SportsTeam(String teamName, String teamMascot, String headCoach) {
	
	this.setTeam(teamName);
	this.setTeamMascot(teamMascot);
	this.setHeadCoach(headCoach);
	this.setLosses(0);
	this.setWins(0);
	
}//end preferred constructor
	/**
	 * getTeam
	 * @return teamName
	 */
	public String getTeam() {
		return teamName;
		
	}//end getTeam
	
	
	/**
	 * setTeam
	 * @param teamName
	 */
	public void setTeam(String teamName) {
		this.teamName = teamName;
	}//end setTeam
	/**
	 * getTeamMascot
	 * @return teamMascot
	 */
	public String getTeamMascot() {
		return teamMascot;
	}//end getTeamMascot
	/**
	 * setTeamMascot
	 * @param teamMascot
	 */
	public void setTeamMascot(String teamMascot) {
		this.teamMascot = teamMascot;
	}//end setTeamMascot
	/**
	 * getHeadCoach
	 * @return headCoach
	 */
	public String getHeadCoach() {
		return headCoach;
	}//end getHeadCoach
	/**
	 * setHeadCoach
	 * @param headCoach
	 */
	public void setHeadCoach(String headCoach) {
		this.headCoach = headCoach;
	}//end setheadCoach
	/**
	 * getWins
	 * @return wins
	 */
	public int getWins() {
		return wins;
	}//end getWins
	/**
	 * setWins
	 * @param wins
	 */
	public void setWins(int wins) {
		this.wins = wins;
	}//end setWins
	/**
	 * getLosses
	 * @return losses
	 */
	public int getLosses() {
		return losses;
	}//end getLosses
	/**
	 * setLosses
	 * @param losses
	 */
	public void setLosses(int losses) {
		this.losses = losses;
	}//end setLosses
	/**
	 * getWinPercentage
	 * @return (double)getWins()/(getWins()+getLosses());
	 */
	public double getWinPercentage() {
		return (double)getWins()/(getWins()+getLosses());
	}//end getWinPercentage
	/**
	 * setWinPercentage
	 * @param winPercentage
	 */
	public void setWinPercentage(double winPercentage) {
		this.winPercentage = winPercentage;
	}//end setWinPercentage
	/**
	 * toString 
	 */
	@Override
	public String toString() {
		return "SportsTeam [teamName=" + teamName + ", teamMascot=" + teamMascot + ", headCoach=" + headCoach
				+ ", wins=" + wins + ", losses=" + losses + ", winPercentage=" + winPercentage + "]";
	}//end toString
	
}//end class