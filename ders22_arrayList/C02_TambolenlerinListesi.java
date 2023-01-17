package ders22_arrayList;

import java.net.http.WebSocket;
import java.util.ArrayList;
import java.util.List;

public class C02_TambolenlerinListesi {
    public static void main(String[] args) {
        int input=1028;
        System.out.println(tamBolenlerListesiOlustur(input));
    }
        public static List<Integer>tamBolenlerListesiOlustur(int input){

        List<Integer>tamBolenlerinListesi=new ArrayList<>();

            for (int i = 1; i <=input ; i++) {
                if (input%i==0){
                    tamBolenlerinListesi.add(i);

                }

            }
            return tamBolenlerinListesi;

        }


}
