public class supertest {
    protected void display() {
        System.out.println("Display in Parent");
    }
}

public class Child extends supertest {
    /**
     * @param args
     */
    public static void main(String[] args){
    public void display() {
        super.display(); // 调用父类的 display 方法
        System.out.println("Display in Child");
    }
}
}

