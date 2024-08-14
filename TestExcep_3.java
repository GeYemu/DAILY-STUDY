import java.util.Scanner;
import java.util.InputMismatchException;

public class TestExcep_3
{
	public static void main(String[] args)
	{
		int i;
		
		Scanner sc = new Scanner(System.in);  
		
		try
		{
			i = sc.nextInt();
			System.out.printf("i = %d\n", i);	
		}
		catch (InputMismatchException e)
		{
			System.out.printf("ֹ錯完了給妳!\n");
		}				
	}
	
}