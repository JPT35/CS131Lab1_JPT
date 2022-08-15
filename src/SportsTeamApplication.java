/**
 * 
 * @author johnpaulthomas
 *CS131 Lab1 
 *	This is the application class for testing the abstract class SportsTeam 
 *	and the class BasketballTeam, which will inherit from SportsTeam.
 *
 *	A new BasketballTeam object is created: team1
 *
 *	toString is called before setters add values
 *	Method getters and setters are tested and displayed with a println();
 *	toString displays again with added values
 *
 */
public class SportsTeamApplication {

	public static void main(String[] args) {
	
	BasketballTeam team1 = new BasketballTeam();
	
	
	System.out.println(team1.toString());
	System.out.println();
	team1.setTeam("Houston");
	team1.setHeadCoach("Mike D'Antoni");
	team1.setTeamMascot("Rockets");
	team1.setWins(55);
	team1.setLosses(17);

	System.out.println("Team: "+team1.getTeam());
	System.out.println("Mascot: "+team1.getTeamMascot());
	System.out.println("Head Coach: "+team1.getHeadCoach());
	System.out.println("Wins: "+team1.getWins()+"\n"+"Loses: "+team1.getLosses()+"\n"+"Win Percentage: "+team1.getWinPercentage()+"%");
	System.out.println();
	
	team1.setFieldGoals(25);
	team1.setFieldGoalsAttempted(60);
	team1.setFreeThrows(10);
	team1.setFreeThrowsAttempted(15);
	team1.setFieldGoalPercentage(team1.getFieldGoalPercentage());
	team1.setFreeThrowPercentage(team1.getFreeThrowPercentage());
	team1.setStats(team1.getWinPercentage(), team1.getFieldGoalPercentage(), team1.getFreeThrowPercentage());
	
	
	System.out.println("Free Throw Percentage: "+team1.getFreeThrowPercentage()+"%");
	System.out.println("Field Goal Percentage: "+team1.getFieldGoalPercentage()+"%");
	System.out.println("Team stats: "+team1.getStats());
	System.out.println();
	System.out.println(team1.toString());
	}//end main method 

}//end class
