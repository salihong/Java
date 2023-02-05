package ders_37_CheckedException;

import java.util.Scanner;

public class C06_ThrowKeyword {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz.");
        int yas= scan.nextInt();
        if (yas<=0 || yas<0 ){
            try {
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
               e.printStackTrace();
                System.out.println("Yas sıfır veya negatif OLAMAZ");
            }



        }


    }
}
