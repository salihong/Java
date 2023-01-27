package ders_26_PassByValue_ref;

public class C01_PassByValue {
    public static void main(String[] args) {

        double fiyat= 100;


        System.out.println(indirimUygula(fiyat));

        System.out.println(fiyat);
        fiyat=indirimUygula(fiyat);
    }

    public static double indirimUygula(double ahmet){
        ahmet=ahmet*0.9;
        System.out.println(ahmet);
        ahmet=ahmet*0.9;
        System.out.println(ahmet);
        return ahmet;

    }
}
