package conditional.statements;

/*Java if-else-if ladder Statement
 * The if-else-if ladder statement executes one condition from multiple statements.
 * Syntax:

	if(condition1){  
		//code to be executed if condition1 is true  
	}else if(condition2){  
		//code to be executed if condition2 is true  
	}  
	else if(condition3){  
		//code to be executed if condition3 is true  
	}  
	...  
	else{  
		//code to be executed if all the conditions are false  
	}   
 */

public class IfElseIfStatement {

	public static void main(String[] args) {
		// Program to check POSITIVE, NEGATIVE or ZERO:

		int number = -13;
		if (number > 0) {
			System.out.println("POSITIVE");
		} else if (number < 0) {
			System.out.println("NEGATIVE");
		} else {
			System.out.println("ZERO");
		}
	}
}