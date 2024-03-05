public class Main {
    public static void main(String[] args) {


        /** Am creeat o instanta de tip Floare */

        Floare lalea = new Floare(6,"roz");

        int numarul10 = lalea.metodaCareIntoarce10();
        System.out.println(numarul10);

        String variabilaAnimal = "Leu   ";
        String trimmed = variabilaAnimal.trim();
        System.out.println(variabilaAnimal.trim());

        System.out.println(trimmed.toLowerCase());

        System.out.println(trimmed.toLowerCase().replace('e','E'));

        String exemplu = "Hipopotam";
        System.out.println(exemplu.replace('p','P'));

        lalea.setNumarPetale(30);
        System.out.println(lalea.getNumarPetale());

        Om Andrei = new Om(183,"Taur");
        Om George = new Om("George",30);

        System.out.println(George.getVarsta());
//        Andrei.zodie("Taur");
        System.out.println(Andrei.zodie);

        Contract contract1 = new Contract("De inchiriere",18);
        Contract contract2 = new Contract(2021,"Gheorghe Vasile si Dumitru Ion");

        System.out.println(contract1.getObiectulContractului());
        System.out.println(contract2.anulIncheieriiContractului);


        Student student1 = new Student(2,"contabilitate","Finante,banci si contabilitate","zi");
        Student student2 = new Student(1,"botanica","biologie","fr");


        System.out.println(student2.getAnulScolar());
        System.out.println(student1.denumireFacultate);



    }
}