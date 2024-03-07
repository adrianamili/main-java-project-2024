package Aplicatii;

public class Leguma {
    String gust;
    String culoare;
    int dimensiune;
    char vitamine;

    Leguma(String gustParam,String culoareParam, int dimensiuneParam, char vitamineParam){
        this.gust = gustParam;
        this.culoare = culoareParam;
        this.dimensiune = dimensiuneParam;
        this.vitamine = vitamineParam;

    }

    public static void metoda1() {
        System.out.println("Am rulat metoda1");
    }

    public static void metoda2() {
        System.out.println("Am rulat metoda2");
    }
    int getDimensiune(){
        return dimensiune;
    }

    String getGust(){
        return gust;
    }


}

