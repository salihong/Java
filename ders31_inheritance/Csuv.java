package ders31_inheritance;

public class Csuv extends BinekArac{
    public static void main(String[] args) {
        Csuv suv1=new Csuv();
        System.out.println(suv1.marka);
        System.out.println(suv1.model);
        System.out.println(suv1.motor);
        System.out.println(suv1.plaka);
        suv1.teker();
        suv1.hiz();
        Csuv suv2=new Csuv();
        suv2.marka="Honda";
        suv2.motor="1.6";
        suv2.model="HRV";
        suv2.hiz(suv2.yakit);

    }
    public void hiz (String yakit){
        if (yakit.equalsIgnoreCase("benzin")){
            System.out.println("Benzinli SUV'lar max 300 km/h hiz yapar");
        } else if (yakit.equalsIgnoreCase("Dizel")) {
            System.out.println("Dizel Suvlar max 260 km/h hiz yapar");
        } else if (yakit.equalsIgnoreCase("hibrid")) {
            System.out.println("Hibrit SUVlar 220 km/h hiz yapar");

        }
    }

}
