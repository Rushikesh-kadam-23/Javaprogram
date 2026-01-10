package Inheritance;

class employee{
    void salary(){
        System.out.println("salary = 50000");
    }
}
class hr extends employee{
    void bonus(){
        System.out.println("bonus = 10000");
    }
}

public class Single4 {
    public static void main(String[] args) {
        hr obj = new hr();
        obj.salary();
        obj.bonus();


    }
}
