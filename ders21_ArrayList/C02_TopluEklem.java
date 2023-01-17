package ders21_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_TopluEklem {
    public static void main(String[] args) {
        List<String >harfler=new ArrayList<>();
        String []arr={"a","e","i","o","u"};
        for (int i = 0; i < arr.length; i++) {
            harfler.add(arr[i]);


        }
        System.out.println(harfler);
    }
}
