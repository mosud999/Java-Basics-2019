package defaultValue.of.data.types;

/* 
 * Java Break Statement::
 * Data Type	Default Value (for fields)
	byte	0
	short	0
	int	0
	long	0L
	float	0.0f
	double	0.0d
	char	‘u0000’
	String (or any object)	null
	boolean	false
 */

public class DefaultValuesOfDataTypes {

	static boolean bool;
	  static byte by;
	  static char ch;
	  static double d;
	  static float f;
	  static int i;
	  static long l;
	  static short sh;
	  static String str;

	  public static void main(String[] args) {
	    System.out.println("Bool :" + bool);
	    System.out.println("Byte :" + by);
	    System.out.println("Character:" + ch);
	    System.out.println("Double :" + d);
	    System.out.println("Float :" + f);
	    System.out.println("Integer :" + i);
	    System.out.println("Long :" + l);
	    System.out.println("Short :" + sh);
	    System.out.println("String :" + str);
	  }
}