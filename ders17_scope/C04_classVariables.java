package ders17_scope;

public class C04_classVariables {

    public static void main(String[] args) {
        //c03 teki hastane ismini yazdırmak istesek

        System.out.println(C03_Objectvariables.hastaneismi);

        C03_Objectvariables.hastasayisi++;
        C03_Objectvariables.hastasayisi++;
        method1();
        System.out.println(C03_Objectvariables.hastasayisi);
    }
    public static void method1(){
        C03_Objectvariables.hastasayisi++;
    }

}
