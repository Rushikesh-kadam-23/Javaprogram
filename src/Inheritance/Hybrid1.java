package Inheritance;
class Bank{
    void interest(){
        System.out.println("interest");
    }
}
class RBI extends Bank{
    void rules(){
        System.out.println("rules");
    }
}
class SBI extends RBI{}

public class Hybrid1 {
    public static void main(String[] args) {
        RBI r=new RBI();
        SBI s=new SBI();
        r.interest();
        s.rules();
    }
}
