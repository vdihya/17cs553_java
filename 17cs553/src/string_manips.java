//import java.lang.*;
public class string_flipclass {
	public static void main(String [] args)
	{
	String s = new String("abcdefghijklmnopqristuvwxyz");
	System.out.println(s.toCharArray()[26]);
	System.out.println(new String(s.toCharArray(),2,12));
	String s1 = new String(s.toCharArray(),10,4);
	System.out.println(new String(s1));
	byte asciivalues[] = {65,126,92,99,124,127};
	System.out.println(new String(asciivalues));
	System.out.println(new String(asciivalues,1,2));
	System.out.println(new String(asciivalues).length());
	//String literal 
	String literal = "this is a string literal!! it automatically initializes Strings and makes String objects";
	System.out.println("String"+" Concatenation");
	System.out.println("String concatenation with other data types "+23+345);

	System.out.println("String concatenation with other data types "+(23+345));
	//23 and 345 are converted to String objects because one part of the + is a string

	details obj = new details(21,"yogesh");
	System.out.println(obj);
	System.out.println(obj.toString());
	
	}
}
class details
{
	int age; String name;
	details(int age,String name)
	{
	this.age=age;
	this.name=name;
	}
	public String toString()
	{
		return "Age: " + age + " Name: " + name;
		
	}
	
}