public class Casa {
    // private - acces doar in interiorul clasei
    private int nr;
    String judet;
    String oras;
    String strada;
static int mp = 100;


    // getter

    public int getNr(){
        return this.nr;
    }

    //setter
    public void setNr(int nr){
        this.nr = nr;
    }

    public int calculeazaCodPostal(int valoareData){
        int valoarePrimita = valoareData;
        int codPostal = valoarePrimita * this.nr;
        return codPostal;
    }

    //Constructor
     Casa(){
        System.out.println("Am apelat constructorul by default");
    }
}
