package ders_42_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C04_LinkedListQDataturu {
    public static void main(String[] args) {
        Queue<String>q1=new LinkedList<>();
        q1.add("H");
        q1.add("Y");
        System.out.println(q1);
        q1.offer("P");

        System.out.println(q1.remove());
        System.out.println(q1);
        q1.poll();




    }


}
