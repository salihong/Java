package ders17_practice;

import java.util.Scanner;

public class Dogumgunukarsilastirma {
    public static void main(String[] args) {
        System.out.println("Doğum gününüzü, \nYil\n" +
                "Ay\n" +
                "Gün\nolarak giriniz.");
        Scanner scan= new Scanner(System.in);

        int yil1= scan.nextInt();
        int ay1= scan.nextInt();
        int gun1= scan.nextInt();

        System.out.println("Karşılastırmak istediğiniz ikinci doğum gününü giriniz.");

        int yil2= scan.nextInt();
        int ay2=scan.nextInt();
        int gun2=scan.nextInt();

        int dogumgunu1=yil1*10000+ay1*100+gun1;
        int dogumgunu2=yil2*10000+ay2*100+gun2;

        if (dogumgunu1<dogumgunu2){ System.out.println("ilk kişi büyüktür.");

    } else if (dogumgunu1<dogumgunu2) {
            System.out.println("İkinci kişi büyüktür.");
        }else System.out.println("Doğum günleri aynı.\n" +
                "Saat farkını bilmiyoruz\n" +
                ":))");

        }
    }
