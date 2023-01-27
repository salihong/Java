package ders_26_PassByValue_ref;

import java.util.ArrayList;
import java.util.List;

public class C06_immutableClasses {
    public static void main(String[] args) {

        String str="Java Guzeldir";

        System.out.println(str.toUpperCase());
        System.out.println(str);

        str.toLowerCase();
        System.out.println(str);

        List<String>harfler = new ArrayList<>();
        harfler.add("A");
        harfler.add("B");
        harfler.add("C");


        harfler.remove(0);
        System.out.println(harfler);

    }


}
