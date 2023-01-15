package ders17_scope;

public class C01_Scope {
    public static void main(String[] args) {
        int sayi =10;
        String isim="Ramazan";

    }

    public static void method1(){
        // bu mahalle baska
        // System.out.println(isim); isim geçmez
        for (int i = 0; i < 10; i++) {
            String adres="Ankara";


        }
    }
}

