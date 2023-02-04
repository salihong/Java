package ders_35_exceptions;

import java.util.Scanner;

public class C03_ArrayIndexOutOfIndexException {
    public static void main(String[] args) {

       int[] arr={3,4,5,6,7,8,9,1};
        Scanner scan =new Scanner(System.in);

        System.out.println("Lütfen bir index giriniz");

        int index= scan.nextInt();

        try {
            System.out.println(arr[index]);
        } catch (ArrayIndexOutOfBoundsException hata) {
            System.out.println(hata.getMessage());
            hata.printStackTrace();

        }

    }

}
