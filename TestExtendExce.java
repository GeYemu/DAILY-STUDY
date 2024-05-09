


class A extends Exception
{
}

class B extends Exception
{
}

class C extends Exception
{
}

class M
{
	void f() throws A, B
	{
	}
}

class N extends M
{
	void f() throws A,B 
	{
	}
}

class Test
{
	public void k(M mm)
	{
		try
		{
			mm.f();
		}
		catch (A aa)
		{
		}
		catch (B bb)
		{
		}		
	}
}

class TestExtendExce
{
	public static void main(String[] args)
	{
		M m = new M();
		N n = new N();
		
		//System.out.println("1111");
	}
}
