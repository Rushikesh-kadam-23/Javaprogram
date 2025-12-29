package Exceptionhandling;

public class Exception1 {

    public static void main(String[] args) {

        try {
            int a = 100, b = 0, c;
            c = a / b;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

        System.out.println("hello");
    }
}