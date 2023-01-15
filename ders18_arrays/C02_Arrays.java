package ders18_arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        String[]arr={"Ali","Ulus","Nesrin"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);//


        }
                System.out.println(arr);// array obje non prşmştşve olduğundan referansı yazdırır

        System.out.print(Arrays.toString(arr));
        }
}
