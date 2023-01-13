package ders10_StringManupilation;

public class C10_lastindex {
    public static void main(String[] args) {
        String cumle="Jawa cok guzeldir";
        String metin= "cok";

        int ilkindex=cumle.indexOf(metin);
        int sonindex=cumle.lastIndexOf(metin);

        if (ilkindex==(-1)){
            System.out.println("...");
    }
}
}
