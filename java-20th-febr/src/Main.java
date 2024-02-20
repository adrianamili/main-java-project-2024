import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Person persoana1 = new Person();
//        persoana1.name = "Gheorghe";
//        persoana1.age = 45;
//        Person persoana2 = new Person();
//        persoana2.name = "Andreea";
//        persoana2.age = 20;
//
//
//        System.out.println(persoana1);
//        System.out.println(persoana2);
//
//        if (persoana1.age != persoana2.age) {
//            System.out.println("Varsta celor doua persoane este diferita.");
//        }

//        Person persoana3 = new Person(27,"Alina");
//        System.out.println(persoana3.name);
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Introduceti numarul utilizatorului:");
//        int numarUtilizator = scanner.nextInt();
//        System.out.println("Utilizatorul dvs are numarul: " + numarUtilizator);


//        Bloc bloc1 = new Bloc("Luceafarului", 87);
//        System.out.println(bloc1.numarBloc);
//        Bloc bloc2 = new Bloc("Margaritarului", 12);
//        System.out.println(bloc2.stradaBloc);
//        Bloc bloc3 = new Bloc("Amicitiei", 25);
//        if (bloc2.stradaBloc != bloc3.stradaBloc) {
//            System.out.println("Ultimele doua blocuri se afla pe strazi diferite. " +
//                    "Cele doua strazi sunt: " + " strada " + bloc2.stradaBloc + " si strada "
//                    + bloc3.stradaBloc);
//        }

//        Masina masina1 = new Masina("Dacia", 2012);
//        Masina masina2 = new Masina("Volkswagen", 2018);
//        Masina masina3 = new Masina("Skoda", 2021);
//
//        if (masina1.anFabricatie > 2020) {
//            System.out.println("Masina este noua!");
//        } else {
//            System.out.println("Masina este veche!");
//        }

        Contract contract1 = new Contract("Contract de vanzare-cumparare",2014);
        Contract contract2 = new Contract("Contract de inchiriere",2004);
        Contract contract3 = new Contract("Contract de prestare servicii",2022);

        System.out.println(contract2.obiectulContractului);
    }
}