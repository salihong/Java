package ders21_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_Tekrarlarisilme {
    public static void main(String[] args) {
        int[]arr= {1,2,4,3,5,3,5,2,5,1,2,4,5,3,4,5};

        List<Integer> tekrarsizListe=new ArrayList<>();
        for (int i = 0; i < arr.length ; i++) {

            if(!tekrarsizListe.contains(arr[i])) {
                tekrarsizListe.add(arr[i]);
            }

        } System.out.println(tekrarsizListe);

    }
}
