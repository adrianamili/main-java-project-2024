package Aplicatii;

public class Masina {
    int anulFabricatiei;
    String marca;
    String model;
    int serieCIV;
    static String culoareMasina;

    public Masina(int anulFabricatiei, String marca, String model, int serieCIV) {
        this.anulFabricatiei = anulFabricatiei;
        this.marca = marca;
        this.model = model;
        this.serieCIV = serieCIV;
    }

    public int getAnulFabricatiei() {
        return anulFabricatiei;
    }

    public static void metoda1(){
        System.out.println("Am folosit metoda 1");
    }
    public static void metoda2(){
        System.out.println("Am folosit metoda 2");
    }
    public static void metoda3(){
        System.out.println("Am folosit metoda 3");
    }
    public static void metoda4(){
        System.out.println("Am folosit metoda 4");
    }

    public void setModel(String model) {
        this.model = model;
    }
}
