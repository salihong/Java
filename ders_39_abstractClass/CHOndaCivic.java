package ders_39_abstractClass;

public class CHOndaCivic extends BHonda{
    @Override
    public void motor() {

    }

    @Override
    public void kasa() {
        System.out.println("Civic ler sedan veya Hatcb ");
    }

    @Override
    public void tekerlek() {
        System.out.println(" R15 kullanır");

    }

    @Override
    public void yakit() {
        System.out.println("Honda Civic araclar VTEC kullanır");
    }

    @Override
    public void guvenlik() {
        System.out.println("Cicicler Guvenlik paketi kullanır");

    }

    public static void main(String[] args) {
        CHOndaCivic civic1=new CHOndaCivic();
        civic1.abs();
        civic1.klima();
        civic1.marka();
        civic1.ozelTeknology();
    }
}
