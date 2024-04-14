package 自己的代碼;

import java.util.*;


 class hellodate
{
        public static void main(String[] args)
    {
        System.out.println("Hello it's");
        System.out.println(new Date()+ "\nand" );
        person aa =new person();
        System.out.println(aa.shout());
    }
}

class person
{
    int age;
    public String shout()
    {
        System.out.println("oh,my-god!,I am "+age);
        return null;
    }
}

