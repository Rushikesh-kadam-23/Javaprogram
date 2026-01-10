package Inheritance;

class parent{
    void show(){
        System.out.println("parent");
    }
}
class  child extends parent{
    void show(){
        System.out.println("child");
    }
}
class child1 extends parent{
    void display(){
        System.out.println("child1");
    }
}
public class Multilevel1 {
    public static void main(String[] args) {
        child obj=new child();
        child1 obj1=new child1();
        obj1.display();
        obj1.show();

    }
}
