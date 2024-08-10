class A
{
	int divide(int a, int b)
	{
		int m = 0;
		
		m = a / b;;
		return m;
	}
}

public class TestExcep_6
{
	public static void main(String[] args)
	{
		try
		{
			new A().divide(6, 0);
		}
		catch (Exception e)
		{
			System.out.printf("1\n");
			e.printStackTrace();
		}
		finally
		{
			System.out.printf("2\n");
		}
		
				
	}
}
