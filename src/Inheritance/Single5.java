package Inheritance;

class person{
    String name = "Rushi";
}

class student extends person{
    int rollno = 5055;
}

public class Single5 {
    public static void main(String[] args) {
        student obj = new student();
        System.out.println(obj.rollno);
        System.out.println(obj.name);


    }
}
