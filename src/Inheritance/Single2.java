package Inheritance;

class A {
    void m1() {
        System.out.println("m1");
    }
}
class B extends A {
    void m2() {
        System.out.println("m2");
    }
}
public class Single2  {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.m1();
        b.m2();
    }
}