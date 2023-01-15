package ders17_scope;

public class C02_classlevelvariables {
    static String hastaneismi="Yildiz Hastanesi";
    static int hastasayisi=23154;
    static String bashekimismi;
    String personelismi="isim girilmedi";
    int personelyasi;

    public static void main(String[] args) {

        System.out.println(hastasayisi);
        hastasayisi++;
        System.out.println(hastaneismi);
        System.out.println(bashekimismi);

    }
    //public static void method1();{
        //System.out.println(hastaneismi);
       // System.out.println(personelismi);

    }
    //public void method2();{
       // System.out.println(hastaneismi);
      //  System.out.println(personelismi);
       // System.out.println(personelyasi);


