package ders28_varrargs;

public class C05_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Java Candır.");
        sb.replace(0,3,"Yaaaa");
        System.out.println(sb);

        sb.insert(7,"bu bir yalandır, ");
        System.out.println(sb);
    }
}
