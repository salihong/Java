package ders28_varrargs;

public class C04_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder(7);
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append("Favo");

        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());

        sb.append(" Güzeldir");
        System.out.println(sb.capacity());
        System.out.println(sb);

        System.out.println(sb.length());
        sb.append(" ona ne şüphe");
        System.out.println(sb);

        sb.trimToSize();
        System.out.println(sb.capacity());
        sb.reverse();
        System.out.println(sb);

    }
}
