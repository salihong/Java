package ders_33_DataTypeOverriding;
public class FAvciKuslar extends EKuslar{
    public void hareket(){
        System.out.println("Avci kuslar ucarlar");
    }
    public void beslenme(){
        System.out.println("avci kuslar et yerler");
    }
    public void gaga(){
        System.out.println("Avci kusların sivri gagaları vardır");
    }
    public void pence(){
        System.out.println("Avcı kuslar pencelidir");
    }
    public static void main(String[] args) {
        FAvciKuslar avci1=new FAvciKuslar();
        avci1.beslenme();
        avci1.gaga();
        avci1.pence();
        avci1.hareket();
        avci1.cogalma();
        avci1.kanat();
        avci1.omur();
        avci1.solunum();
    }
}
