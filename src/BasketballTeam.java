/**
 *  @author johnpaulthomas
 *  
 *  Class BasketballTeam represents a specific basketball team 
 *  and inherits from the abstract class SportsTeam
 *  
 */

import java.util.Arrays;

public class BasketballTeam extends SportsTeam{

	protected int fieldGoals;
	protected int fieldGoalsAttempted;
	protected int freeThrows;
	protected int freeThrowsAttempted;
	protected double fieldGoalPercentage;
	protected double freeThrowPercentage;
	public double [] stats;
	
	
	/**
	 * Empty argument constructor
	 */
	public BasketballTeam() {
		
		super();
		this.fieldGoalPercentage = 0;
		this.fieldGoals = 0;
		this.fieldGoalsAttempted = 0;
		this.freeThrowPercentage = 0;
		this.freeThrows = 0;
		this.freeThrowsAttempted = 0;
		
		
	}//end empty argument constructor
	

	/**
	 * preferred constructor
	 * super inherits methods for teamName, teamMascot and headCoach from abstract class SportsTeam
	 * @param teamName
	 * @param teamMascot
	 * @param headCoach
	 */
	public BasketballTeam(String teamName, String teamMascot, String headCoach) {

		super(teamName,teamMascot,headCoach);
		this.setFieldGoals(0);
		this.setFieldGoalsAttempted(0);
		this.setFieldGoalPercentage(0);
		this.setFreeThrows(0);
		this.setFreeThrowsAttempted(0);
		this.setFreeThrowPercentage(0);
	}//end preferred constructor
	/**
	 * getFieldGoals
	 * @return
	 */
	public int getFieldGoals() {
		return fieldGoals;
	}//end getFieldGoals
	/**
 	* setFieldGoals
 	* @param fieldGoals
 	*/
	public void setFieldGoals(int fieldGoals) {
		this.fieldGoals = fieldGoals;
	}//end setFieldGoals
	/**
	 * getFieldGoalsAttempted
	 * @return
	 */
	public int getFieldGoalsAttempted() {
		return fieldGoalsAttempted;
	}//end getFieldGoalsAttempted
	/**
	 * setFieldGoalsAttempted
	 * @param fieldGoalsAttempted
	 */
	public void setFieldGoalsAttempted(int fieldGoalsAttempted) {
		this.fieldGoalsAttempted = fieldGoalsAttempted;
	}//end setFieldGoalsAttempted
	/**
	 * getFreeThrows
	 * @return
	 */
	public int getFreeThrows() {
		return freeThrows;
	}//end getFreeThrows
	/**
	 * setFreeThrows
	 * @param freeThrows
	 */
	public void setFreeThrows(int freeThrows) {
		this.freeThrows = freeThrows;
	}//end setFreeThrows
	/**
	 * getFreeThrowsAttempted
	 * @return
	 */
	public int getFreeThrowsAttempted() {
		return freeThrowsAttempted;
	}//end getFreeThrwosAttempted
	/**
	 * setFreeThrowsAttempted
	 * @param freeThrowsAttempted
	 */
	public void setFreeThrowsAttempted(int freeThrowsAttempted) {
		this.freeThrowsAttempted = freeThrowsAttempted;
	}//end setFreethrowsAttempted
	/**
	 * getFieldGoalPercentage
	 * @return
	 */
	public double getFieldGoalPercentage() {
		return (double)getFieldGoals()/getFieldGoalsAttempted();
	}//end getFieldGoalPercentage
	/**
	 * setFieldGoalPercentage
	 * @param fieldGoalPercentage
	 */
	public void setFieldGoalPercentage(double fieldGoalPercentage) {
		this.fieldGoalPercentage = fieldGoalPercentage;
	}//end setFieldGoalPercentage
	/**
	 * getFreeThrowPercentage
	 * @return
	 */
	public double getFreeThrowPercentage() {
		return (double)getFreeThrows()/getFreeThrowsAttempted();
	}//end getFreeThrowPercentage
	/**
	 * setFreeThrowPercentage
	 * @param freeThrowPercentage
	 */
	public void setFreeThrowPercentage(double freeThrowPercentage) {
		this.freeThrowPercentage = freeThrowPercentage;
	}//end setFreeThrowPercentage
	/**
	 * getStats method
	 * creates a new array of doubles 
	 * returns the array values using toString
	 * @return Arrays.toString(stats)
	 */
	public String getStats() {
		stats = new double [] {getWinPercentage(), getFieldGoalPercentage(), getFreeThrowPercentage()};
		return Arrays.toString(stats);
	}//end getStats
	/**
	 * setter for getStats method
	 * @param winPercentage
	 * @param fieldGoalPercentage
	 * @param freeThrowPercentage
	 */
	public void setStats(double winPercentage, double fieldGoalPercentage, double freeThrowPercentage) {
		
		this.winPercentage = winPercentage;
		this.fieldGoalPercentage = fieldGoalPercentage;
		this.freeThrowPercentage = freeThrowPercentage;
		
	}//end setStats


	/**
	 * toString method 
	 */
	@Override
	public String toString() {
		return "BasketballTeam [fieldGoals=" + fieldGoals + ", fieldGoalsAttempted=" + fieldGoalsAttempted
				+ ", freeThrows=" + freeThrows + ", freeThrowsAttempted=" + freeThrowsAttempted
				+ ", fieldGoalPercentage=" + fieldGoalPercentage + ", freeThrowPercentage=" + freeThrowPercentage
				+ ", stats=" + Arrays.toString(stats) + ", teamName=" + teamName + ", teamMascot=" + teamMascot
				+ ", headCoach=" + headCoach + ", wins=" + wins + ", losses=" + losses + ", winPercentage="
				+ winPercentage + "]";
	}//end toString

	

}//end class