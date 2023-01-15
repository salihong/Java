package ders19_arrays;

import java.util.Arrays;

public class C06_ArrayaYeniDegerAtama {
    public static void main(String[] args) {
        String []arr1={"Ali","Veli"};
        String[]arr2={"a","B","c"};

        arr1=arr2;
        System.out.println(Arrays.toString(arr1));

    }
}
