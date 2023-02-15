package ders_43_Deque;

import java.util.Deque;
import java.util.LinkedList;

public class C01_Deque {
    public static void main(String[] args) {
        Deque<String> dq1= new LinkedList<>();
        dq1.add("K");
        dq1.add("B");
        dq1.addFirst("F");
        dq1.addLast("V");
        dq1.remove();
        dq1.pop();
        System.out.println(dq1);
        System.out.println(dq1.peek());
        System.out.println(dq1.element());
        System.out.println(dq1.element());
    }
}
