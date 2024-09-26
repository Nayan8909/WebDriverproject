package mar30;

public class Ranga {

	public static void addition(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	
	public static String verify_String(String str1, String str2)
	{
		String res;
		if(str1.equalsIgnoreCase(str2))
		{
			res="Both strings are equal";
		}
		else
		{
			res="Both strings are not equal";
		}
		return res;
	}
	
	public static boolean compare_values(int x,int y)
	{
		if(x==y)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	public static void main(String[] args) {
		
		//we can add parameters in method only once but we can execute it mutiple times by changing parameter values
		
		Ranga.addition(1234,3456);   //this method has void type hence its not return anything. didnt declare any variable
String a = Ranga.verify_String("hello", "sleep"); //this method has return type . hence declared any variable lets say a
System.out.println(a);
boolean x= Ranga.compare_values(100, 100);  //this method has return type . hence declared any variable lets say x
System.out.println(x);

		
	}

}
