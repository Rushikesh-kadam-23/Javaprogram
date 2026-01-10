package Inheritance;

class patient {
    void illness() {
        System.out.println("illness");
    }
}
class Hospital extends patient {
    void bill() {
        System.out.println("bill");
    }
}
class doctor extends patient {

}
public class Hybrid2 extends patient {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        hospital.illness();
        hospital.illness();
    }
}
