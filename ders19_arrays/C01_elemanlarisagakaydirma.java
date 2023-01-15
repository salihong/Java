package ders19_arrays;

import java.util.Arrays;

public class C01_elemanlarisagakaydirma {
    public static void main(String[] args) {
        int[] arr={4,5,6,7};
         arr=sagakaydir(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static int[]sagakaydir(int[]arr){
        int bosKova= arr[arr.length-1];
        for (int i =arr.length-2; i >=0 ; i--) {
            arr[i+1]=arr[i];
        }
        arr[0]=bosKova;
        return arr;
    }


}

