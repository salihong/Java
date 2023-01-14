package ders11_ForLoops;

public class C03_factoriyel {
    public static void main(String[] args) {

        int sayi=10;
        int faktoriyel=1;

        for (int i= sayi; i >=1 ; i--) {
            faktoriyel= faktoriyel*i;

        }
        System.out.println(faktoriyel);
       //1 den 100 e kadar sayıları toplayın
        int toplam=0;
        for (int i = 1; i>=100 ; i++) {
            toplam=toplam+ i;
            System.out.println(toplam);
// 2.kısım çalışmadı çözülecek

        }

    }
}
