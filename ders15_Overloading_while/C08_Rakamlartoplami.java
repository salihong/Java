package ders15_Overloading_while;

public class C08_Rakamlartoplami {
    public static void main(String[] args) {
        int sayi=1453;

        int birlerBasamagi=0;
        int rakamlarToplami=0;

        while (sayi!=0){
            birlerBasamagi=sayi%10;
            rakamlarToplami+=sayi;
            sayi/=10;

        }
        System.out.println(rakamlarToplami);
    }
}
