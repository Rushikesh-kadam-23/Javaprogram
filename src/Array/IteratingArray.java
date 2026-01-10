package Array;

import java.util.Arrays;

public class IteratingArray {
    public static void main(String[] args) {

        int[] originalarr = {10, 20, 30, 40, 50, 60};
        int[] copiedarr = new int[originalarr.length];

        for (int i = 0; i < originalarr.length; i++) {
            copiedarr[i] = originalarr[i];
        }
        System.out.println("copied array");
        for (int i = 0; i < copiedarr.length; i++) {
            System.out.print(copiedarr[i] + " ");

        }
        System.out.println();
    }
}
