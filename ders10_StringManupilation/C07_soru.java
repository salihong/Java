package ders10_StringManupilation;

public class C07_soru {
    public static void main(String[] args) {
        String cumle = "Jawa cok guzeldir cok";
        String metin ="cok";

        if (!cumle.contains("metin")){
            System.out.println("cumle metni icermiyor");

        }else {int ilkindex=cumle.indexOf(metin);
            int ikinciIndex=cumle.indexOf(metin,ilkindex+1);
            if (ikinciIndex==(-1)){
                System.out.println("cumle metni sadece 1 kez iceriyor");
            }else{
                System.out.println("cumle metni birden fazla iceriyor");


            }
    }
    }
}