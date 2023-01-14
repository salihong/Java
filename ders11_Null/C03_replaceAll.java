package ders11_Null;

public class C03_replaceAll {
    public static void main(String[] args) {
        String str="J1ava2 G9uzel5dir8";
        System.out.println(str.replaceAll("\\d",""));
        System.out.println(str.replaceAll("\\D",""));

        String s1="ilk urun fiyati: 1250";
        String s2="ikinci urun fiyati: 2450";

        System.out.println(str.replaceAll("\\D", ""));


    }
}
