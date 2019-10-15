package conditional.statements;

/* Java if-else Statement::
 * The Java if-else statement also tests the condition. It executes the if block if condition is true otherwise else block is executed. 
 * 
 * Syntax:
	if(condition){  
		//code if condition is true  
	} else{  
		//code if condition is false  
	}  
 */

public class IfStatement {

	public static void main(String[] args) {

	    //defining an 'age' variable  
	    int age=20;  
	    //checking the age  
	    if(age>18){  
	        System.out.print("Age is greater than 18"); 
	       
	        //It's a ternary operator. General form:
	        int a = 1;
	        int b = (a == 1) ? 2 : (a + 1);
	    }
	}
}

