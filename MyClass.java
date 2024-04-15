public class MyClass {
   
    public void firstMethod() {
     
        secondMethod();
        System.out.println("i have the first format!");
       
        this.secondMethod();
    }
    
    public void secondMethod() {
        System.out.println("Second method called");
    }
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.firstMethod(); 
    }
}
