package Aplicatii;

public class Bloc {
    int numarBloc;
    String adresaBloc;
    int numarEtaje;
    char scara;
    static String stradaBloc;

    public Bloc(int numarBloc, String adresaBloc, int numarEtaje, char scara) {
        this.numarBloc = numarBloc;
        this.adresaBloc = adresaBloc;
        this.numarEtaje = numarEtaje;
        this.scara = scara;
    }

    public String getAdresaBloc() {
        return adresaBloc;
    }

    public void setNumarEtaje(int numarEtajeParam) {
        this.numarEtaje = numarEtajeParam;
    }
    public static void metodaA(){
        System.out.println("Am folosit metoda A");
    }
    public static void metodaB(){
        System.out.println("Am folosit metoda B");
    }
    public static void metodaC(){
        System.out.println("Am folosit metoda C");
    }
    public static void metodaD(){
        System.out.println("Am folosit metoda D");
    }

    public int getNumarEtaje() {
        return numarEtaje;
    }
}
