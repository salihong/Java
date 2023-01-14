package ders11_ForLoops;

public class C06_Rakamlartoplami {
    public static void main(String[] args) {
        long sayi= 99999999;
        String sayistr=""+sayi;

        long birlerbasamagi=0;
        long rakamlartoplami=0;

        for (int i = 1; i <=sayistr.length() ; i++) {
            birlerbasamagi =sayi%10;
            rakamlartoplami=rakamlartoplami+birlerbasamagi;
            sayi=sayi/10;
        }
        System.out.println(rakamlartoplami);

        }
    }

