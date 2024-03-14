import Aplicatii.Apartament;
import Aplicatii.Bloc;
import Aplicatii.Masina;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        String[] listaDeFructe = {"Mar", "Para", "Banana"};

        Arrays.sort(listaDeFructe);
        for (String fruct : listaDeFructe) {
            System.out.println(fruct);
        }
        System.out.println("Sortarea listei de fructe");
        String[] listaDeFructeTryCopy = listaDeFructe;

        Arrays.sort(listaDeFructeTryCopy, Comparator.reverseOrder());
        for (String fruct : listaDeFructe) {
            System.out.println(fruct);
        }

        /** static methods & properties*/

        Contract contract = new Contract();
        Contract.metodaContract();
        System.out.println(Contract.numarDePagini);
//        Contract.numarDePagini;
//        contract.numarDePagini;

        ArrayList arrayList = new ArrayList();


        /**Aplicatii*/

        Bloc bloc = new Bloc(12, "Covasna", 10, 'B');
        System.out.println(bloc.getAdresaBloc());
        System.out.println(bloc.getNumarEtaje());
        Bloc.metodaB();

        Apartament apartament = new Apartament(23,"Vasile Ionel",3,true);
        System.out.println(apartament.getNumarAp());
        apartament.setEtajAp(3);
        Apartament.metodaM3();

        Masina masina = new Masina(2022,"Skoda","Karoq", 245122);
        System.out.println(masina.getAnulFabricatiei());
        masina.setModel("Karoq");
        Masina.metoda1();



    }
}