class A
{
	int divide(int a, int b)
	{
		int m = 0;
		
		try
		{
			m = a/b;
		}
		catch (ArithmeticException e)
		{
			System.out.printf("��������Ϊ��!\n");
		}
		
		//System.out.printf("1111");
		return m;
	}
}

public class TestExcep_1拷貝
{
	public static void main(String[] args)
	{
		new A().divide(6, 2);
		//System.out.printf("2222");
	}
}
