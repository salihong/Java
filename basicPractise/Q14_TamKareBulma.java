package basicPractise;

import java.util.Scanner;

public class Q14_TamKareBulma {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
         int sayi= scan.nextInt();

        int i=1;
        for (i=1; i<sayi; i++)
            while (i * i == sayi) {
                System.out.println("Sayi "+ i +" in Tamkaresidir");

                if (i*i!=sayi) System.out.println("Sayi tamkare değildir");
                break;
            }


        }
    }



