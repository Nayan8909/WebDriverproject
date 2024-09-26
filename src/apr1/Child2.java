package apr1;

 class Overload {
	 //Override - child class can give its own implementation to method which is alraedy provided by the parent class
	 //parent class is overridden and child class is overriding
	void demo(int a)
	{
		System.out.println("a : "+a);
	}
	
	void demo(int a, float b)
	{
		System.out.println("a and b : "+a+ ","+b);

	}
	double demo(double a)
	{
		System.out.println("double a: "+a);
return a*a;
	}

	public static void main(String[] args) {
Overload d= new Overload();
d.demo(2);
d.demo(22.34);
d.demo(1, 15.2f);
	}

}
