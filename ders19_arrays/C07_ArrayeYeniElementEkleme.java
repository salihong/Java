package ders19_arrays;

import java.util.Arrays;

public class C07_ArrayeYeniElementEkleme {
    public static void main(String[] args) {
        int[]arr={2,4,6};

        int[]arr2=new int[arr.length+1];

        for (int i = 0; i < arr.length; i++) {
            arr2[i]=arr[i];


        }
        System.out.println(Arrays.toString(arr2));


    }
}
