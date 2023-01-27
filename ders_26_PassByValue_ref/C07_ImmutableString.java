package ders_26_PassByValue_ref;

public class C07_ImmutableString {
    public static void main(String[] args) {

        String str = "java candir";

        str=str.toUpperCase();


        System.out.println(str.toUpperCase());
        System.out.println(str);
        str=str.toLowerCase();
    }
}
