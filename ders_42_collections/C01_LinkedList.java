package ders_42_collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C01_LinkedList {
    public static void main(String[] args) {
        LinkedList<String>ll1=new LinkedList<>();
        ll1.add("K");
        ll1.add("T");

        List<String>ll2=new LinkedList<>();

        Deque<String>ll3=new LinkedList<>();
        Queue<String>ll4=new LinkedList<>();

        ll2.add("R");
        ll2.add("z");

        ll2.add("A");
        System.out.println(ll2);
        ll2.addAll(0,ll2);
        System.out.println(ll2);

        ll2.set(3,"M");
        System.out.println(ll2);
        ll2.retainAll(ll1);
        ll2.add("K");
        ll2.add("T");

        System.out.println(ll1);
        System.out.println(ll2.hashCode());
        System.out.println(ll2.subList(1, 2));


        //remove(5) 5.indexi alır-size-contains-get set vb.
    }
}
