package Loops;

import java.util.Scanner;

/* Loops in Java
 * In programming languages, loops are used to execute a set of instructions/functions repeatedly 
 * when some conditions become true. There are three types of loops in java.
	 * 1) for loop
	 * 2) while loop
	 * 3) do-while loop
	 
 * For Loop: If the number of iteration is fixed, it is recommended to use for loop. 
 	
 	for(init;condition;incr/decr){  
	// code to be executed 
	}
 */

public class ForLoop {

	public static void main(String[] args) {
	
	// Write a program to print numbers from 1 to 10.
		/*
		 * for(int i=1; i<=10; i++) { System.out.println(i); }
		 */
		
	// Write a program to calculate the sum of first 10 natural number.
		/*
		 * int sum = 0; for(int i=0; i<=10; i++) { sum += i; }
		 * System.out.println("Sum of total number = " +sum);
		 */
		
	// Write a program to find the factorial value of any number entered through the keyboard. 

		/*
		 * Scanner console = new Scanner(System.in); int num; // To hold number int fact
		 * = 1; // To hold factorial
		 * 
		 * System.out.print("Enter any positive integer: "); num = console.nextInt();
		 * 
		 * for (int i = 1; i <= num; i++) { fact *= i; }
		 * 
		 * System.out.println("Factorial: " + fact);
		 */
	}
}
