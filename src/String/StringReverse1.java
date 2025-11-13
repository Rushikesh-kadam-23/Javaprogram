package String;

public class StringReverse1 {

    public  static void main(String[] args) {
        String str1 = "Rushi";

        String reverse = new String();
        for(int i=str1.length()-1;i>=0;i--){
            reverse = reverse + str1.charAt(i);
        }
        System.out.println(reverse);
    }
}
