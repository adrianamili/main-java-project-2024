package Aplicatii;

public class Fruct {
    String gust;
    String culoare;
    int dimensiune;
    char vitamine;

    Fruct (String gustParam,String culoareParam, int dimensiuneParam, char vitamineParam) {
        this.gust = gustParam;
        this.culoare = culoareParam;
        this.dimensiune = dimensiuneParam;
        this.vitamine = vitamineParam;
    }
    public static void frufru1() {
        System.out.println("Am rulat metoda frufru1");
    }

    public static void frufru2() {
        System.out.println("Am rulat metoda frufru2");
    }
    String getCuloare(){
        return culoare;
    }

    String getVitamine(){
        return gust;
    }



}
