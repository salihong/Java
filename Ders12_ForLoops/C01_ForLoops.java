package Ders12_ForLoops;

public class C01_ForLoops {
    public static void main(String[] args) {
        int sayi=14535;

        int birlerbasamagi=0;
        int rakamlartoplami=0;

        for (int i = 1; i<6 ; i++) {

            birlerbasamagi=sayi%10;
            rakamlartoplami=rakamlartoplami+birlerbasamagi;
            sayi=sayi/10;


        }
        System.out.println(rakamlartoplami);

    }
}
