package apr1;

public class Child1 extends Parent{

	public static void main(String[] args) {

		Parent.add();   //call methods using parent class as methods present in parent class only and we are only inheriting it in child class
		Parent.sub();
		Parent.div();
	}

}
