package ders19_arrays;

import java.util.Arrays;

public class C2_EnbuyukEnkucuk {
    public static void main(String[] args) {
        int[]arr={3,8,1,5,2,9,20};
        enBuyukEnkucukElementyazdir(arr);
    }
    public static void enBuyukEnkucukElementyazdir(int[]arr){
        Arrays.sort(arr);

        System.out.println("En büyük: " + arr[arr.length-1]);
        System.out.println("En küçük element:" + arr[0]);

    }
}
