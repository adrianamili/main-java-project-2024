public class Floare {

    int numarPetale;
    String culoare;
    String miros;
    boolean areGhivechi;

    /** Constructori */
    Floare(){
        this.miros = "de trandafir";
    }

    Floare(int numarPetaleParam, String culoareParam){
        this.numarPetale = numarPetaleParam;
        this.culoare = culoareParam;
        System.out.println("Am apelat constructorul cu 2 parametrii");
    }

    Floare(String mirosParam){
        this.miros = mirosParam;
    }

    /** Metode/ comportament */
    int metodaCareIntoarce10(){
        return 10;
    }

    String metodaCareReturneazaString() {
        return "Returnez String";
    }

    void metodaCareNuReturneazaNimic(){
        System.out.println("Nu returneaza nimic");
    }

    /** Getter & Setter*/

    public int getNumarPetale() {
        return numarPetale;
    }

    public void setNumarPetale(int numarPetale) {
        this.numarPetale = numarPetale;
    }
}
