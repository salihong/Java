package ders_26_PassByValue_ref;

import java.util.ArrayList;
import java.util.List;

public class C02_PassByValueList {
    public static void main(String[] args) {

        List<Integer>sayilar=new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        elementleri5Artir(sayilar);
        elementleri5Artir(sayilar);
        elementleri5Artir(sayilar);

            }
    public static void elementleri5Artir(List<Integer>sayilar){
        for (int i = 0; i < sayilar.size(); i++) {
            sayilar.set(i,sayilar.get(i)+5);

        }
        System.out.println(sayilar);
    }
}
