/**
 * 
 */
package myfirstjavaprogram;
public class AccountHolder {
		
		//System.out.println("Hello World...");
		//System.out.print("This is my first java program!!!");

		String firstname;
		String lastname;
		int age;
		float accountbalance;
		boolean iseligibleforcreditcard;
		
	public void eligibleforcc() {
		
		if (age > 25 && accountbalance >= 20000) {
			
			iseligibleforcreditcard = true;
			
		}
		
	}
		
}
		