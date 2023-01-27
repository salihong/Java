package ders_26_PassByValue_ref;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class C04_PassByValueList2 {
    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>();

        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);

      yeniListDegeriAta(sayilar);
        System.out.println("callden sonra"+ sayilar);


    }
    public static void yeniListDegeriAta(List<Integer>sayilar){
        List<Integer>  yeniList =new ArrayList<>();
        for (int i = 0; i < sayilar.size(); i++) {
            yeniList.add(sayilar.get(i)+5);


        }
        sayilar=yeniList;
        System.out.println(sayilar);
    }

}
