abstract class A {
    abstract public void f();
}

class B extends A{
    public static void main(String[] args){
    public void f(){
    System.out.printf("AAAA");
    }
}}

package zhangsan.lisi;  
public class TestPackage
{
	public static void main(String[] args)
	{
		new A().print();
	}
}
class A{
	public void print(){
		System.out.println("AAAAA");
	}
}