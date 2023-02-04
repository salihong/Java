package ders_27_immutable_DateandTime;

public class C02_StringPool {
    public static void main(String[] args) {

        String str1="java";
        String str2="java";
        String str3=new String("java");

        String str4="";
        str4="java";

        String str5="ja";
        str5=str5.concat("va");

        System.out.println(str1.equals(str2)); //true
        System.out.println(str1.equals(str3)); //t
        System.out.println(str1.equals(str4));//true
        System.out.println(str1.equals(str5));//true

        System.out.println(str1==str2); //t
        System.out.println(str1==str3);//f
        System.out.println(str1==str4);//t
        System.out.println(str1==str5);//f  ? neden?

    }
}
