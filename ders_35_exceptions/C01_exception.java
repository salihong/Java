package ders_35_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01_exception {
    public static void main(String[] args) {

       sayiAlKaresiniyazdir();
    }
    public static void sayiAlKaresiniyazdir(){
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen bir tamsayi giriniz.");


        try {

             int girilenSayi = scan.nextInt();
            System.out.println(girilenSayi*girilenSayi);
            System.out.println("Girdiğiniz sayının karesi:  ");
        } catch (InputMismatchException e) {

            System.out.println("Sana tam sayı gir dedik!");
            sayiAlKaresiniyazdir();


        }


    }
}
