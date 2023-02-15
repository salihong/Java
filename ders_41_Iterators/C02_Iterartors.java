package ders_41_Iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C02_Iterartors {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);

        Iterator itr=sayilar.iterator();
        System.out.println(itr.hasNext());
        System.out.println(itr.next());

        System.out.println(itr.hasNext());
        System.out.println(itr.next());
        System.out.println("=============");

        while (itr.hasNext()){
            System.out.println(itr.next());


        }
        Iterator it2=sayilar.iterator();
        System.out.println("=============");

        while (it2.hasNext()){
            System.out.println(it2.next());
        }

    }



}
