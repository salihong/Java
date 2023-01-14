package ders15_Overloading_while;

public class C07_whilesoru {
    public static void main(String[] args) {
        int sayi=2;
        int us=7;
        ushesapla(sayi,us);
    }

    public static void ushesapla(int sayi,int us){
        int sonuc=1;
        while (us>0){
            sonuc*=sayi;
            us--;

        }
        System.out.println(sonuc);
    }
}
