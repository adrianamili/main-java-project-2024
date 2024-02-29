package Applications;

public class Bloc {

    String stradaBloc;
    int numarBloc;
    int numarEtaje;
    String numeAdministrator;


    Bloc(String stradaBlocParam, int numarBloc, int numarEtajeParam, String numeAdministrator) {
        this.stradaBloc = stradaBlocParam;
        this.numarBloc = numarBloc;
        this.numarEtaje = numarEtajeParam;
        this.numeAdministrator = numeAdministrator;
    }

    void afiseazaRiscSeismic() {
        System.out.println("Riscul seismic este mare");
    }

    public int getNumarEtaje() {
        return this.numarEtaje;
    }
}



