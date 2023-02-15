package ders_41_Iterators;

import java.util.ArrayList;
import java.util.List;

public class C01_iterators {
    public static void main(String[] args) {
        List<Integer>sayilar = new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);

        for (Integer each : sayilar
             ) {
            System.out.print(each+" ");
        }
        System.out.println("");
        for (Integer each:sayilar
             ) {
            System.out.print(each+1+" ");
        }
        System.out.println(sayilar);
        for (Integer  each : sayilar
             ) {
            each+=1;
        }

    }
}
