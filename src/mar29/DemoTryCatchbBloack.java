package mar29;

public class DemoTryCatchbBloack {

	public static void main(String[] args) {
//divide zero with any value
		
		try {
		int x=987,y=0,z;
		z=x/y;
		System.out.println(z);
		}catch(Throwable t)
		{
			System.out.println(t.getMessage());
			//t.printStackTrace();   -- this is used if we want to execute exception block as well with error msg 
		}
		
		int a=4566,b=56,c;
		c=a/b;
		System.out.println(c);
		
	}

}
