package mar30;

public class Sample {
	//global static variables
static int a,b,c;
public static void mul()
{
	a=9876;
	b=765;
	c=a*b;
	System.out.println(c);
}

public static void sub()
{
	a=98786;
	b=876;
	c=a-b;
	System.out.println(c);
}


	public static void main(String[] args) {
		//we can call static method using classname or methodname. No need to create reference object of class.
Sample.mul();
Sample.sub();
	}

}
