import java.security.SecureRandom;
import java.util.*;
/**
 * This is our NonPlayer Character that inherits
 * from GameCharacter it represent objects the game controls 
 * (as opposed to objects a human player controls).
 * @author 
 * @version 1.3
 * Lab1
 * CS131ON
 */

public class NonPlayerCharacter extends GameCharacter {
	

    protected String IntelligenceType;
    protected boolean active = false;
    public String introduce = "";
    public String exclaim = "";
    
    
    
    /**
     * end empty argument constructor
     */
    public NonPlayerCharacter(){
        super();
        this.setActive(false);
        this.setIntelligenceType("AVERAGE");
    }//end empty argument constructor


/**
 * preferred constructor
 * @param id
 * @param personality
 * @param active
 * @param IntelligenceType
 */
    public NonPlayerCharacter(String id, String personality, boolean active, String IntelligenceType){

    	super(id, personality);
        this.setActive(false);
        this.setIntelligenceType("AVERAGE");

    }//end preferred constructor
/**
 * boolean isActive
 * @return
 */
public boolean isActive() {
	return active;
}//end isActive
/**
 * setter for Active
 * @param active
 */
public void setActive(boolean active) {
	this.active = active;
}//end setActive
/**
 * getter for IntelligenceType
 * @return
 */
public String getIntelligenceType() {
	return IntelligenceType;
}//end getIntelligenceType
/**
 * setter for IntelligenceType
 * @param IntelligenceType
 */
public void setIntelligenceType(String IntelligenceType) {
	this.IntelligenceType = IntelligenceType;
}//end setIntelligenceType
/**
 * getter for Introduce
 * @return
 */
public String getIntroduce() {
	return "Hello, my name is: "+uniqueID;
	
}//end getIntroduce
/**
 * setter for Introduce
 * @param introduce
 */
public void setIntroduce(String introduce) {
	this.introduce = introduce;
}//end setIntroduce
/**
 * getter for Exclaim 
 * new Random object created 
 * Array list of strings created 
 * 
 * @return
 */
public String getExclaim() {
	
	Random r2 = new Random();
    List<String>statements = Arrays.asList("Dag Gummit" , "Doggone it" , "Holy cow" , "Jeez" , "Well cheese and crackers");
    int randomitem = r2.nextInt(statements.size());
    
	return statements.get(randomitem);
}//end getExclaim
/**
 * setter for Exclaim
 * @param exclaim
 */
public void setExclaim(String exclaim) {
	this.exclaim = exclaim;
}//end setExclaim


/**
 * report structure
 * utilizes StringBuilder
 * inherits ReportStructure from GameCharacter
 */
public String reportStructure(){
	
	
	StringBuilder sb2 = new StringBuilder(super.reportStructure());
	sb2.append("ACTIVE: "+active+"\n");
	sb2.append("INTELLIGENCE: "+IntelligenceType+"\n");
	sb2.append("==================================\n");
	
	return sb2.toString();
	
}//end reportStructure
/**
 * toString method
 */
@Override
public String toString() {
	return "NonPlayerCharacter [IntelligenceType=" + IntelligenceType + ", active=" + active + 
			 ", personality=" + personality + ", uniqueID=" + uniqueID + "]";
}//end toString

}//end class

