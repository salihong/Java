package ders28_varrargs;

public class C06_StrinBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("java Güzeldir");
        sb.indexOf("a");
        System.out.println(sb);

        System.out.println(sb.indexOf("a",2));

    }
}
