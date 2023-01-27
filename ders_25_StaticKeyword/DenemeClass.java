package ders_25_StaticKeyword;

public class DenemeClass {

    int a=10;
    static int b=20;
    static String str2="Ayşe";
    static String  str1="Ali";


    DenemeClass(){
        str1="hasan";
        str2+="++";

    }
    DenemeClass(int x, int y){
        a=x;
        b= y;
    }

    public static void main(String[] args) {

        DenemeClass dnm1=new DenemeClass(6,8);
        System.out.println(dnm1.b);
        DenemeClass dnm2=new DenemeClass(10,12);
        System.out.println(dnm1.b);

    }
}
