package Exceptionhandling;

public class YoungerAgeException extends RuntimeException {
   
    YoungerAgeException(String msg) {
        super(msg);
    }
}
class voting{
    public static void main(String[] args) {
        System.out.println("Enter your age");
        int age = 19;
        if(age<18)
        {
            throw new YoungerAgeException("you are not eligible for voting");
        } else
        {
            System.out.println("you are eligible for voting");
        }
    }
}