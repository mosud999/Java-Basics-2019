package main.method;

/* 
 * 
 * public – access modifier, meaning global visibility; Main method can be accessed by public modifier;
 * static – Main method is called by java virtual machine without creating an object. We know if you want to call 
 * any method by its class name then it will be static. the method can be accessed straight from the class, we don’t have 
 * to instantiate an object to have a reference and use it
 * void – Main method does not return anything hence the return type is void. means that this method doesn't return a value
 * main – the name of the method, that’s the identifier JVM looks for when executing a Java program
 * As for the args parameter, it represents the values received by the method. This is how we pass arguments to the program 
 * when we first start it.
 * 
 * args[] - Main method returns an array of String object as an arguement.
 * 
 * 
The parameter args is an array of Strings. In the following example:


java CommonMainMethodSignature foo bar
we're executing a Java program called CommonMainMethodSignature and passing 2 arguments: foo and bar. Those values can be accessed inside of the main method as args[0] (having foo as value) and args[1] (having bar as value).

In the next example, we're checking args to decide whether to load test or production parameters:


public static void main(String[] args) {
    if (args.length > 0) {
        if (args[0].equals("test")) {
            // load test parameters
        } else if (args[0].equals("production")) {
            // load production parameters
        }
    }
}
 */

public class MainMethodJava {

	public static void main(String[] args) {
		int i;
		for (i = 1; i <= 5; i++) {
			System.out.println(i);
			if (i == 3) {
				break;
			}
		}

	}
}