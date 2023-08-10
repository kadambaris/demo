package oopspack;

public class EH4 {

	public static void main(String[] args) {
		String s = "Selenium";
		
		try {
			int i = Integer.parseInt(s);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Exception Handled");
	}
}
