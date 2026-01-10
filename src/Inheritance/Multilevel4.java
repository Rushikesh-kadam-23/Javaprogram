package Inheritance;
class Addition{
    void add(int a,int b){
        System.out.println("addition is " + a + b);
    }
}
class Subtraction{
    void sub(int a,int b){
        System.out.println("Subtraction is " + (a - b));
    }
}
class Multiplication extends Addition{
    void multiplication(int a,int b){
        System.out.println("multiplication is " + a * b);
    }
}
class div extends Multiplication{
    void div(int a,int b){
        System.out.println("division is " + a / b);

    }
    void callAllmethods(){
        add(3,2);
        div(2,6);
        multiplication(7,9);
    }
}
public class Multilevel4 {
    public static void main(String[] args) {
        Addition add = new Addition();
        div d = new div();
        d.callAllmethods();

    }
}