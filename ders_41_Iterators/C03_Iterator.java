package ders_41_Iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C03_Iterator {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);

        //15 ile 35 sayıları arasını silin

        Iterator it1=sayilar.iterator();
        Integer element;
        while (it1.hasNext()){
            element=(Integer) it1.next();
            if (element>15 && element<35){
                it1.remove();
            }
        }
        System.out.println(sayilar);
    }
}
