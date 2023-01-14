package Ders13_NestedForLoop;

import java.util.Scanner;

public class C08_MetodOlusturma {
    public static void main(String[] args) {
        istetoplayazdir();

        //kullanıcıdan iki sayı alıp toplamını yazdıran bir metod olusturun





        }
        public static void istetoplayazdir(){

            Scanner scan=new Scanner(System.in);
            System.out.println("Lutfen iki sayı giriniz");

            double sayi1= scan.nextDouble();
            double sayi2= scan.nextDouble();
            System.out.println("Girilen sayıların toplamı :  "+ (sayi1+sayi2));

    }
}
