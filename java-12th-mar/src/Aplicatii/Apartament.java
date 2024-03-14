package Aplicatii;

public class Apartament {
    int numarAp;
    String numeProprietar;
    int etajAp;
    boolean areBalcon = true;
    static int suprafataAp;

    public Apartament(int numarAp, String numeProprietar, int etajAp, boolean areBalcon) {
        this.numarAp = numarAp;
        this.numeProprietar = numeProprietar;
        this.etajAp = etajAp;
        this.areBalcon = areBalcon;
    }

    public int getNumarAp() {
        return numarAp;
    }

    public void setEtajAp(int etajAp) {
        this.etajAp = etajAp;
    }
    public static void metodaM1(){
        System.out.println("Am folosit metoda M1");
    }
    public static void metodaM2(){
        System.out.println("Am folosit metoda M2");
    }
    public static void metodaM3(){
        System.out.println("Am folosit metoda M3");
    }
    public static void metodaM4(){
        System.out.println("Am folosit metoda M4");
    }

}
