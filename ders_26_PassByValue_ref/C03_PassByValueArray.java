package ders_26_PassByValue_ref;

import java.util.Arrays;

public class C03_PassByValueArray {
    public static void main(String[] args) {
        // 5 artırıp sonra yazdıran metod oluştur

        int[] arr={3,4,5};
            elementleri5artir(arr);
        elementleri5artir(arr);
        elementleri5artir(arr);
        System.out.println("call dan sonra"+Arrays.toString(arr));

    }
    public static void elementleri5artir(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]+5;

        }
        System.out.println(Arrays.toString(arr));
    }
}
