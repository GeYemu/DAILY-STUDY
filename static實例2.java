public class static實例2{
  
public static class A{
    public int i =10;
    public static int j=20;
   }
class M{
  public static void main(String[] args)
  {
    A aa1=new A();
    A aa2=new A();
    //aa2.j=30;
      System.out.printf("%d\n",aa2.j);
      System.out.printf("%d\n",aa1.j);
    }
}
}