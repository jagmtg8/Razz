package github2b2b.razz;

import java.util.ArrayList;

/**
 * Created by Katipo on 10/4/2015.
 */
public class Sandwich extends MenuItem{

    /**
     * @param ingredientList - Holds the ingredients for the current sandwich object
     * @param includedIngredient - Holds ingredients that are included for pre made sandwich
     */

    public  ArrayList<Ingredient> ingredientList = new ArrayList<>();
    public  ArrayList<Ingredient> includedIngredients = new ArrayList<>();       //If the sandwhich has included ingredients, do things with stuff


    /** @author Shane Demskie 10/03
     * add all items from included ingredient list to ingredient list.
     */
    public  void addIncludedIngredient(){
        ingredientList.addAll(includedIngredients);
        //TODO: Buttons will have to be depressed.
    }

    /** @author Shane Demskie 10/03
     * add single ingredient to sandwich
     *
     * @param givenIngredient - Ingredient object to be added (meat, cheese, topping, or bread )
     */
    public  void addIngredient(Ingredient givenIngredient){
        //if Toggle button is pressed
        ingredientList.add(givenIngredient);
    }

    /** @author Shane Demskie 10/03
     * removes single ingredient to sandwich
     *
     * @param ingredient - Ingredient object to be removed (meat, cheese, topping, or bread )
     */
    public  void removeIngredient(Ingredient ingredient){
        //if Toggle button is depressed
        ingredientList.remove(ingredient);

    }

    /**
     * Debug / test purpose only
     */
    public void print(){
        System.out.println("-------------------------------------------------------------------------");
        for(int i =0; i < ingredientList.size(); i ++){
            if(i == 0){
                System.out.print(" Current Ingredient = " + ingredientList.get(i).getIngredientName());
            }else{
                System.out.print(", "+ingredientList.get(i).getIngredientName());
            }
        }
        System.out.println();
    }


    //Wipes the ingredientList and returns breadType to null
    /** @author -  Shane Demskie, 10/09
     * TODO - Remove BreadType from sandwich
     * Clear the sandwich current ingredientList and set breadType as null
     *
     */
    public  void removeAllIngredients(){
        if(ingredientList.size()!=0) {
            ingredientList.clear();
        }
    }
}
