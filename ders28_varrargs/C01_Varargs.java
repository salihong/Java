package ders28_varrargs;

public class C01_Varargs {
    public static void main(String[] args) {
        topla(9,7);
        topla(9,7,5);
        //parametre sayisi değiştikçe bizden yeni method oluşturmamızı ister.
    }

    private static void topla(int sayi1, int sayi2, int sayi3) {
        System.out.println("üç sayinin toplami :"+(sayi1+sayi2+sayi3));

    }

    private static void topla(int sayi1,int sayi2){
        System.out.println("iki sayinin toplami: "+ (sayi1+sayi2));

    }
}
