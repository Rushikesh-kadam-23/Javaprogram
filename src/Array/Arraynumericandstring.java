package Array;

import java.util.Arrays;

public class Arraynumericandstring {

    public static void main(String[] args) {

        int [] numbers ={10,20,30,40,50 };
        String [] names ={"pune,mumbai,dharashiv,latur"};

        Arrays.sort(numbers);
        Arrays.sort(names);

        System.out.println("sorted numeric array :");
        for(int num:numbers){
            System.out.println(num + " ");
        }


        System.out.println("Sorted string array :");
        for(String name: names){
            System.out.println(name + " ");
        }


    }
}
