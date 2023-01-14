package Ders13_NestedForLoop;

public class C02_strintersine {
    public static void main(String[] args) {
        String input="Börek yaptın mı" ;
        String tersInput="";
        for (int i =input.length()-1; i >=0 ; i--) {
            tersInput+=input.substring(i,i+1);

        }
        System.out.print("Ters hali : " + tersInput);

    }
}
