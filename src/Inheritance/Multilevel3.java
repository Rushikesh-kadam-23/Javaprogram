package Inheritance;
 class employee1{
     void showId(){
         System.out.println("showId");
     }
 }
 class manager extends employee1{
     void salary(){
         System.out.println("display");
     }
 }
 class employee2 extends manager{
 }
public class Multilevel3 {
    public static void main(String[] args) {
      manager man=new manager();
      man.showId();
      man.salary();
    }
}