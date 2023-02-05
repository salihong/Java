package ders_39_abstractClass;

public abstract class Araba {
    public abstract void motor();

    public abstract void marka();

    public abstract void kasa();


    public abstract void tekerlek();

    public void abs(){
        System.out.println("Guvenlik için ABS");

    }
    public void klima(){
        System.out.println("Konfor için klima");
    }

}
