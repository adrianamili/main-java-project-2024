package Homework16_17;

import java.util.ArrayList;
import java.util.List;

public class MainR {
    public static void main(String[] args) {


        List<String> ingredients = new ArrayList<>();
        String ingredient1 = "milk";
        String ingredient2 = "eggs";
        String ingredient3 = "flour";
        String ingredient4 = "sugar";
        ingredients.add(ingredient1);
        ingredients.add(ingredient2);
        ingredients.add(ingredient3);
        ingredients.add(ingredient4);



        List<Recipe> recipesWithMilk = new ArrayList<>();
        Recipe recipe1 = new Recipe("Cake",ingredients);

        System.out.println(recipe1.hasIngredients("milk"));


    }
}
