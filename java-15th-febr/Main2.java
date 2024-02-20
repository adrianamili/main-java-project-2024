import curs7.Animal;

public class Main2 {
    public static void main(String[] args) {

        System.out.println("Start");
        System.out.println(3 == 3.1);


        /* Creeare obiect*/
        Animal animalObiect = new Animal();
        new Animal();
        Animal pisica = new Animal();
        Animal caine = new Animal();

        /*Nu se mai creeaza o noua zona de memorie/Nu se creeaza un alt obiect.*/
        Animal soarece = pisica;
        System.out.println(pisica == soarece);
        System.out.println(caine == soarece);

        int numarMasini = 10;
        if (numarMasini == 10){
            System.out.println("Ai 10 masini");}
        else{
            System.out.println("Nu ai 10 masini");

        }
    }
}
