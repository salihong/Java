package ders11_Null;

public class C02_replace {
    public static void main(String[] args) {
        String str="Jawa candir";
        System.out.println(str.replace('a', 'A'));
        System.out.println(str.replace(' ','_'));
        System.out.println(str.replace(" ",""));
        System.out.println(str.replace("a",""));
        System.out.println(str.replace("Jawa","Hava").replace("candir","çok güzel"));

    }
}
