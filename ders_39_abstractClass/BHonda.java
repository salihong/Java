package ders_39_abstractClass;

public abstract class BHonda extends Araba {

    public void marka(){
        System.out.println("Marka:Honda");

    }
    public abstract void yakit();
    public abstract void guvenlik();
    public void ozelTeknology(){
        System.out.println("Tum hondalarda vtec vardır");
    }
}
