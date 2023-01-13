package ders09_StringManupilation;

public class C09_Equals {
    public static void main(String[] args) {
        String str1= "Ali";
        String str2="ali";

        String str3=new String("Ali");// nesne

        String str4="Ali";

        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str1==str4);  // Stringler karsilastirirken ...equals kullanılır

         System.out.println(str1.equalsIgnoreCase(str2));



    }
}
