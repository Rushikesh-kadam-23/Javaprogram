package Array;

public class MissingNumbers {
    public static void main(String[] args) {

        int arr[] = {1,2,3,5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

            int n = arr.length + 1;
            int total = n * (n + 1) / 2;

            int missingnumber = total - sum;
            System.out.println("missing numbers is : " + missingnumber);

    }
}