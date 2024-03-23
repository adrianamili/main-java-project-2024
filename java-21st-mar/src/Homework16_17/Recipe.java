package Homework16_17;

import java.util.*;

public class Recipe {
    private String recipeName;
    private List<String> ingredients;

    ArrayList<Recipe> recipes = new ArrayList<>();

    public Recipe(String recipeName, List<String> ingredients) {
        this.recipeName = recipeName;
        this.ingredients = ingredients;
    }

    public Recipe() {

    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    /**methods*/

    public void addRecipe(Recipe recipe) {
        recipes.add(recipe);
    }


    public void removeRecipe() {
        for (int i = 0; i < recipes.size(); i++) {
            if (recipes.get(i).getRecipeName().equals(recipeName)) {
                recipes.remove(i);
                break;
            }
        }
    }

    public boolean hasIngredients(String ingredient){
        return true;
    }

    public Recipe searchRecipe() {
        for (Recipe recipe : recipes) {
            if (recipe.getRecipeName().equals(recipeName)) {
                return recipe;
            }

        }
        return null;
    }
}
