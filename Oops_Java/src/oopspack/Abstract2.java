package oopspack;

public class Abstract2 extends Abstract1 {

	void eat()
	{
		System.out.println("Eating");
	}
	
	public static void main(String[] args) {
		Abstract2 a2 = new Abstract2();
		a2.eat();
	}
}
