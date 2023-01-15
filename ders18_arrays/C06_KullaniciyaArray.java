package ders18_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C06_KullaniciyaArray {
    public static void main(String[] args) {

        int[] kullaniciArrayi= arrayOlustur();
        System.out.println(Arrays.toString(kullaniciArrayi));
    }
    public static int[]arrayOlustur(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Arrayin boyutunu giriniz");

        int length = scan.nextInt();
        int[]kullaniciArrayi=new int[length];

        for (int i = 0; i < length; i++) {
            System.out.println("Array'e eklenecek bir sayi giriniz");
            kullaniciArrayi[i]= scan.nextInt();


        }
        return kullaniciArrayi;

    }

}

