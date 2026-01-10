package Inheritance;

class Animal{
    void eat(){
        System.out.println("eating");
    }
}
class dog  extends Animal{
    void Bark(){
        System.out.println("barking");
    }
}
class puppy extends dog{
    void pup(){
        System.out.println("pupping");
    }
}

public class Multilevel2 {
    public static void main(String[] args) {
        puppy p = new puppy();
        p.eat();
        p.pup();


    }
}
