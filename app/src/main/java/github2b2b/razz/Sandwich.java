package github2b2b.razz;

import java.util.ArrayList;

/**
 * Created by Katipo on 10/4/2015.
 */
public class Sandwich extends MenuItem{


    public  ArrayList<Ingredient> ingredientList = new ArrayList<>();
    public  ArrayList<Ingredient> includedIngredients = new ArrayList<>();       //If the sandwhich has included ingredients, do things with stuff
    public  Bread breadType;


    //add all items from included ingredient list to ingredient list.
    public  void addIncludedIngredient(){
        ingredientList.addAll(includedIngredients);
        //TODO: Buttons will have to be depressed.
    }

    //Adds single ingredient
    public  void addIngredient(Ingredient givenIngredient){
        //if Toggle button is pressed
        ingredientList.add(givenIngredient);
    }

    //Removes single ingredient
    public  void removeIngredient(Ingredient ingredient){
        //if Toggle button is depressed
        ingredientList.remove(ingredient);

    }

    //TODO: SWITCH TO CHECK IF CHEESE OR TOPPING, then remove accordingly


    public void print(){
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Current Bread Is: " + breadType.getIngredientName());
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
    public  void removeAllIngredients(){
        if(ingredientList.size()!=0) {
            ingredientList.clear();
        }
        breadType = null;
    }
}
