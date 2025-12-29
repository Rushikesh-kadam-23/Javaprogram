package Array;

public class FindIndexArray {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9};
        int element = 7;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                System.out.println(arr[i]);
                System.out.println("Index found at index " + i);

            }
        }
    }
}
