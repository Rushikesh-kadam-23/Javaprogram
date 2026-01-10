package Inheritance;

class car{
    void diesel(){
        System.out.println("diesel");
    }
}
class ride extends car{
    void petrol(){
        System.out.println("petrol");
    }
}

public class Single3 {
    public static void main(String[] args) {
        ride ride = new ride();
        ride.diesel();
        ride.petrol();
    }
}
