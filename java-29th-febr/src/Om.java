public class Om {

    String nume;
    int varsta;
    int inaltime;
    String zodie;

    Om(String numeParam,int varstaParam){
        this.nume = numeParam;
        this.varsta = varstaParam;
    }

    Om(int inaltimeParam,String zodieParam){
        this.inaltime = inaltimeParam;
        this.zodie = zodieParam;
    }

    int getVarsta(){
        return varsta;
    }

    public void setZodie(String zodieParam){
        this.zodie = zodieParam;
    }



}
