package oopspack;

public class EH6 {
	
	public static void main(String args[])
	{
		try {
			int i =20/2;
			}finally
		{
				try {
						int a=5/0;
				}catch(Exception e)
				{
					e.printStackTrace();
				}
				
				System.out.println("Exception Handled");
		}	
	}
}
