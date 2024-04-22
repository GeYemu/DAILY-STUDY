class A
{
	int divide(int a, int b)  
	{
		int m;
		//System.out.printf("22222\n");
		m = a / b;
		//System.out.printf("11111\n");
		return m;
	}
}

public class TestExcep_1
{
	public static void main(String[] args)
	{
		A aa = new A();
		
		//aa.divide(6, 0);
		
		try
		{
			aa.divide(6,0);
		}
		catch (ArithmeticException e)  
		{
			e.printStackTrace(); 
			System.out.printf("錯誤!\n");
		}		
		
		System.out.printf("能取暖!\n");
	}
}