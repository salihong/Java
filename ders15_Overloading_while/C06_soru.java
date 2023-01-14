package ders15_Overloading_while;

import java.util.Scanner;

public class C06_soru {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        int girilensayi=0;
        int toplam=0;
        int sayac=0;

                while (toplam<500){
                    System.out.println("Toplamak icin sayi girinzi");
                    girilensayi= scan.nextByte();
                    toplam+=girilensayi;
                    sayac++;
                }
        System.out.println("Girilen "+ sayac+"sayinin toplami"+
                toplam+"Bu kadar yeter");

    }
}
