package basicPractise;

import java.util.Scanner;

public class Q15_ArmstrongSayisi {
    public static void main(String[] args) {
        //verilen sayinin armstrongolup olmadığını kontrol edin.küp sayi

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int sayi= scan.nextInt();

        int kuplerToplami=0;
        int ilkdeger=sayi;
        int rakam= 0;

        while (sayi !=0){
            rakam=sayi%10;
            kuplerToplami+=rakam*rakam*rakam;
            sayi/=10;

        }
        if (kuplerToplami==ilkdeger) System.out.println("Girdiğiniz sayi Armstrong sayisidır");
        else System.out.println("Girdiğiniz sayi Armstrong sayisi değildır");
    }
}
