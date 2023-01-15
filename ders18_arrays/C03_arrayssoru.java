package ders18_arrays;

import java.util.Arrays;

public class C03_arrayssoru {
    public static void main(String[] args) {
        int[]arr={2,4,6,8,10,15};
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]+2;

        }
        System.out.println(Arrays.toString(arr));

        arr=elementleri2arttir(arr);

    }
    public static int[]elementleri2arttir(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]+2;


        }
        return arr;
    }

}
