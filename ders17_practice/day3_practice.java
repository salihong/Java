package ders17_practice;

import java.util.Scanner;

public class day3_practice {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen iki tamsayi giriniz");

            int sayi1= scan.nextInt();
            int sayi2= scan.nextInt();

        System.out.println("Yapmak istediginiz islemi seciniz : "
                + "\n\t1.Toplama\n\t2.Cikarma\n\t3.Carpma\n\t4.Bolme");

        int islem= scan.nextInt();

        if (islem==1) System.out.println("Girdiginiz sayıların toplamı= "+ (sayi1+sayi2));
        else if (islem==2)
            System.out.println("Girdiginiz sayıların farkı: "+ (sayi1-sayi2));
        else if (islem==3)
            System.out.println("Girdiginiz sayıların çarpımı: "+(sayi2*sayi2));
        else if (islem==04)
            System.out.println("Bölümü");
        else System.out.println("hatalı giriş yaptınız");

        }
    }







