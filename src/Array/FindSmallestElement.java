package Array;

public class FindSmallestElement {

    public static void main(String[] args) {

        int a [] = {1,3,5,6,7};

        int smallest = a[0];
        int secondSmallest = a[1];

        int temp = smallest;
        smallest = secondSmallest;
        secondSmallest = temp;

        for( int i = 2; i < a.length; i++ ) {
           if(a[i]<secondSmallest) {
               secondSmallest = a[i];

           }
           else if(a[i]<secondSmallest) {
               secondSmallest = a[i];

           }
       }
        System.out.println("smallest element : " +smallest);
        System.out.println("second smallest element : " +secondSmallest);

  }
}
