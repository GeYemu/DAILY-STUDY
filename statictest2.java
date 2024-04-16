class A {
    public int i=10;
    public static int j=20;

}
class statictest2{
    public static void main(String[] args)
    {
        //A aa1=new A();
        //A aa2 = new A();
        //aa1.j=40;
        //System.out.printf("%d\n",aa2.j);
        System.out.printf("%d\n",A.j);
    }
}