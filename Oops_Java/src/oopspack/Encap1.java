package oopspack;

public class Encap1 {

	String name;
	int a = 45;
	final int b=3;
	
	public void setName(String s)
	{
		this.name = s;
		this.a = 4;
		
		System.out.println(a);
		System.out.println(b);
		
	}
	
	public Object getName()
	{
		return name;
	}
	
	public void d()
	{
		//b = 4; we can not change the value of final variable 
	}
	
	final void e()
	{
		System.out.println("Final method e");
	}
}
