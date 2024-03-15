package Aplicatii;

import java.awt.color.ProfileDataException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Ap1 {
    public static void main(String[] args) {

//        Bonus: -Design a shopping cart system where products can be added,
//        removed, and the total price can be calculated.

        List<Product> cart = new ArrayList<>();
        Product produsNou = new Product("ciocolata", 15);
        Product produs1 = new Product("lapte", 10);
        Product produs2 = new Product("paine", 3);
        cart.add(produsNou);
        cart.add(produs1);
        cart.add(produs2);


            cart.remove(produsNou);
            System.out.println(cart.size());


        for (int i =0; i<cart.size(); i++){
            if (cart.get(i).getName().equals("lapte")){
                cart.remove(i);
                break;
            }
        }
        for(Product product : cart){
            System.out.println(product.name);
        }

        Product produs3 = new Product("oua", 30.58);
        Product produs4 = new Product("carne",49.21);
        cart.add(produs3);
        cart.add(produs4);

        double sum = 0;
        for (Product produs: cart){
            sum += produs.getPrice();
        }
        System.out.println("Suma produselor din cos este: " + sum);

        double sum2 = 0;
        for (int i = 0; i < cart.size();i++){
            sum2+= cart.get(i).price;
        }
        System.out.println("Suma produselor din cos este: " + sum2);
    }
}
