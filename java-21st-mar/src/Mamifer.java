public class Mamifer extends Animal {
    /** clasa Animal este parintele clasei Mamifer */

    @Override
    void eats(){
        System.out.println("The cow is eating");
    }
    void makeNoise(){ //daca metoda din clasa parinte este final, nu se poate face override

    }
}
