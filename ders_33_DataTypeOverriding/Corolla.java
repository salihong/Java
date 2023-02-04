package ders_33_DataTypeOverriding;

public class Corolla extends BToyota{

    String model="Corollal";
    String uretimyeri="Turkiye";
    int yil =2023;
    public static void main(String[] args) {

        Corolla corolla1=new Corolla();
        System.out.println(corolla1.model);
        System.out.println(corolla1.uretimyeri);
        System.out.println(corolla1.yil);
        System.out.println(corolla1.marka);
        System.out.println(corolla1.motor);
        System.out.println(corolla1.plaka);
        System.out.println(corolla1.yakit);

        BToyota corolla2=new Corolla();

        System.out.println(corolla2.model);
       //ystem.out.println(corolla2.uretimyeri);
        System.out.println(corolla2.yil);
        System.out.println(corolla2.marka);
        System.out.println(corolla2.motor);
        System.out.println(corolla2.plaka);
        System.out.println(corolla2.yakit);

        Araba corolla3=new Corolla();

            }


}
