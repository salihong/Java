package ders09_StringManupilation;

public class C06_substring {
    public static void main(String[] args) {
        String str="Jawa ogren, isi kap";
        System.out.println(str.substring(str.length()-3));
        System.out.println(str.length());
        System.out.println(str.substring(str.length()-1).toUpperCase());
        System.out.println(str.substring(str.length()-1).toUpperCase()); // P


        String str2="Jawa gün gectikce guzellesiyor";
        System.out.println(str2.substring(5,8));
        System.out.println(str2.substring(9,17));
        System.out.println(str2.substring(3,7));
        String isim="huseYIN";
        isim=isim.substring(0,1).toUpperCase()+
             isim.substring(1).toLowerCase();
        System.out.println(isim);

        System.out.println("zor sorunun cevabı: " + isim.substring(2,5));
    }


}
