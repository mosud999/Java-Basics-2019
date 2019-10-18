package modifiers.access.nonaccess;

/* 
 * 
 * A Java access modifier specifies which classes can access a given class and its fields, constructors and methods.
 *  Access modifiers can be specified separately for a class, its constructors, fields and methods. Java access modifiers 
 *  are also sometimes referred to in daily speech as Java access specifiers, but the correct name is Java access modifiers. 
 *  Classes, fields, constructors and methods can have one of four different Java access modifiers:
 *  
 *  private 
 *  default (package)
 *  protected
 *  public
 *  
 *  Each of these Java access modifiers will be covered in the following sections of this Java access modifier tutorial. 
 *  The following table summarizes what Java constructs each Java access modifier can be applied to:
 *  
 *  private	default	protected	public
	Class	No	Yes	No	Yes
	Nested Class	Yes	Yes	Yes	Yes
	Constructor	Yes	Yes	Yes	Yes
	Method	Yes	Yes	Yes	Yes
	Field	Yes	Yes	Yes	Yes
 * 
 * 1) Creating an objects in same package;
 * 	- public, default and protected can access private cannot access.
 * 
 * 2) By inheritance  in the same package;
 *  - All access modifiers can access except private;
 *  
 * 3) By creating an object in different package;
 *  - Only public is accessible;
 *  
 * 4) By inheritance in different package;
 *  - Only public and protected;
 */

public class AccessModifiers {

}