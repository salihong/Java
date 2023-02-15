package ders_43_Deque;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class C04_Set {
    public static void main(String[] args) {

        Set<Integer> sayilar=new HashSet<>();

        sayilar.add(12);
        sayilar.add(15);

        Set<Integer> siraliSet=new TreeSet<>();

        siraliSet.add(23);
        siraliSet.add(34);
        siraliSet.addAll(sayilar);

        System.out.println(siraliSet);
        Random rnd=new Random();
        int sayi;
        LocalTime hashBas=LocalTime.now();
        for (int i=0; i<10000; i++){
            sayi=rnd.nextInt(1000);

        }
        LocalTime hashBit=LocalTime.now();
        LocalTime treeBit=LocalTime.now();

        System.out.println("Başlangıç hashBas : "+hashBas +"    Bitiş : "+hashBit);
    }
}
