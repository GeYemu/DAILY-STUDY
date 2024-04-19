abstract class A {
    abstract public void f();
}

class B extends A {
    @Override
    public void f() {
        System.out.printf("AAAA\n");
    }

    public static void main(String[] args) {
        B obj = new B();
        obj.f();
    }
}
