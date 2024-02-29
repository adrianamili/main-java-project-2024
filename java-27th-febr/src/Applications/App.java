package Applications;

public class App {

    public static void main(String[] args) {

        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
            if (i == 3) {
                System.out.println("Indexul a ajuns la valoarea 3");
                break;
            }
        }


        Laptop laptopRandom = new Laptop("Intel Core i7",64,
                2021,"Asus");
        System.out.println(laptopRandom.denumireLaptop);

        Bloc blocRandom = new Bloc("Petrosani",2,10,"Vasile Gheorghe");
        System.out.println(blocRandom.numarBloc);

        blocRandom.afiseazaRiscSeismic();
        System.out.println("Blocul random are " + blocRandom.getNumarEtaje() + " etaje");


    }
}



