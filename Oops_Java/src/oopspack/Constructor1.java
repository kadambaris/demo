package oopspack;

public class Constructor1 {

	int id;
	String Name;
	String address;
	
	
	Constructor1()
	{
		System.out.println("we r in d Default constructor");
	}
	
	public static void main(String[] args) {
		Constructor1 c1 = new Constructor1(); 
		Constructor1 c2 = new Constructor1(1, "ksp", "Pune");
		c2.display();
	}
	
	Constructor1(int a, String s, String c)
	{
		//this.a=id;
		//this.id=a;
		id =a;
		//s= Name;
		//this.Name = s;
		Name = s;
		//c= address;
		//this.address = c;
		address=c;
	}
	public void display()
	{
		System.out.println(id +" "+ Name + " "+ address);
	}
}
