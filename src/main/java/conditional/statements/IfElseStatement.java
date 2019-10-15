package conditional.statements;

/* Java if Statement
 * The Java if statement tests the condition. It executes the if block if condition is true.
 * 
 * Syntax:
	if(boolean condition){  
	//code to be executed  
	}  
 */

public class IfElseStatement {

	public static void main(String[] args) {
		int girlAge = 10;
		int boyAge = 12;
		
		if (girlAge == 10) {
			System.out.println("Age is 10");
		}

		if (boyAge == 12) {
			System.out.println("Age is 12");
		}
	}
}