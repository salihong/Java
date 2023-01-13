package ders10_StringManupilation;

public class C10_Concat {
    public static void main(String[] args) {
        String str1= "Jawa";
        String str2="Guzeldir";
        boolean bl=true;
        int sayi= 20;
        double dbl= 3.54;
        System.out.println(str1+bl+sayi);
        System.out.println(sayi+dbl);
        System.out.println(str1.concat(" ").concat(str2));



    }
}
