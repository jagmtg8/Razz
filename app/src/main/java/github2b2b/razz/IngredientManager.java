package github2b2b.razz;

import java.util.ArrayList;

/**
 * Created by Katipo on 10/4/2015.
 */
public class IngredientManager {

    static ArrayList<Bread> breadList = new ArrayList<>();
    static ArrayList<Topping> toppingList = new ArrayList<>();
    static ArrayList<Cheese> cheeseList = new ArrayList<>();
    static ArrayList<Meat> meatList = new ArrayList<>();

    public static void setMeatList() {
        ArrayList<Meat> temp = new ArrayList<>();
        meatList.add(new Meat("Chicken"));
        meatList.add(new Meat("Turkey"));
        meatList.add(new Meat("Ham"));
        meatList.add(new Meat("Honey Ham"));
        meatList.add(new Meat("Pastrami"));
        meatList.add(new Meat("Salami"));
        meatList.add(new Meat("Roast Beef"));
        meatList.add(new Meat("Pepperoni"));
        meatList.add(new Meat("Bologna"));

    }

    public static void setCheeseList() {
        ArrayList<Cheese> temp = new ArrayList<>();
        temp.add(new Cheese("American Cheese"));
//        temp.add(new Cheese("White American Cheese"));            //Un comment this when we figure out spacing issue with buttons
        temp.add(new Cheese("Asiago Cheese"));
        temp.add(new Cheese("Cheddar Cheese"));
        temp.add(new Cheese("Mozerella Cheese"));
        temp.add(new Cheese("Provologne Cheese"));
        temp.add(new Cheese("Pepperjack Cheese"));
        temp.add(new Cheese("Swiss Cheese"));
        temp.add(new Cheese("Gouda Cheese"));

        IngredientManager.cheeseList = temp;
    }

    public static void setToppingList() {
        ArrayList<Topping> temp = new ArrayList<>();
        temp.add(new Topping("Mayo"));
        temp.add(new Topping("Mustard"));
        temp.add(new Topping("Oil & Vinegar"));
        temp.add(new Topping("Sriracha"));
        temp.add(new Topping("Lettuce"));
        temp.add(new Topping("Tomato"));
        temp.add(new Topping("Onion"));
        temp.add(new Topping("Salt"));
        temp.add(new Topping("Pepper"));
        IngredientManager.toppingList = temp;
    }

    public static void setBreadList() {
        ArrayList<Bread> temp = new ArrayList<>();
        temp.add(new Bread("Sub Roll"));
        temp.add(new Bread("Deli Roll"));
        temp.add(new Bread("White Bread"));
        temp.add(new Bread("Wheat Bread"));
        temp.add(new Bread("Wrap"));
        temp.add(new Bread("Wheat Wrap"));
        IngredientManager.breadList = temp;
    }



    public static void fillALl(){
        setBreadList();
        setCheeseList();
        setMeatList();
        setToppingList();
    }

    public void addIngredient(Ingredient ingredient){

        // Ingredient turkey = new Meat();
        //we'd need a way to utilize this depending on how we're going to handle our menu; hard code or enter manually

    }

    public void removeIngredient(Ingredient ingredient){

        // Loop through the arraylist and search for the item entered. If it exists, remove, if not return flag
        //we'd need a way to utilize this depending on how we're going to handle our menu; hard code or enter manually
    }




}
