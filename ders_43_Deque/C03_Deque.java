package ders_43_Deque;

import java.util.Deque;
import java.util.LinkedList;
import java.util.ListIterator;

public class C03_Deque {
    public static void main(String[] args) {
        //tüm elemanlara Y ekleyin

        Deque<String> urunler=new LinkedList<>();
        urunler.add("Nutella");
        urunler.add("Çikolatalı Gofret");
        urunler.add("çokoprens");

        String eleman="";
        Deque geciciDeque=new LinkedList();

      while (eleman!=null){

           eleman=urunler.poll();

          if (eleman!=null){
             eleman= "Y"+ eleman;
           geciciDeque.add(eleman);

          }
      }
      urunler=geciciDeque;
        System.out.println(urunler);
    }
}
