package Array;

import java.util.Arrays;

public class FindCommonElement {
        public static void main(String[] args) {

            String [] arr1 = {"java","c++","python","php","ruby","HTML"};
            String [] arr2 = {"java","c++","python","javascript","php"};

            System.out.println("Common Element :");

            for(int i=0;i<arr1.length;i++){

                for(int j=0;j<arr2.length;j++){

                    if(arr1[i].equals(arr2[j])){
                        System.out.println(arr1[i]);

                    }
                }

            }
        }
}
