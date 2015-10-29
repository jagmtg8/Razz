package github2b2b.razz;

import java.util.ArrayList;

/**
 * Created by Katipo on 10/4/2015.
 */
public class IngredientManager {

    /**@author Shane Demskie 10/01
     * @param breadList - Holds Bread types currently in inventory
     * @param toppingList - Holds Toppings types currently in inventory
     * @param cheeseList - Holds Cheeses types currently in inventory
     * @param meatList - Holds meats types currently in inventory
     */
    static ArrayList<Bread> breadList = new ArrayList<>();
    static ArrayList<Topping> toppingList = new ArrayList<>();
    static ArrayList<Cheese> cheeseList = new ArrayList<>();
    static ArrayList<Meat> meatList = new ArrayList<>();

    /**
     * Below Methods are used to full lists above
     */
    public static void fillALl(){
        setBreadList();
        setCheeseList();
        setMeatList();
        setToppingList();
    }

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
        temp.add(new Bread("Sub Roll", 7.50));
        temp.add(new Bread("Deli Roll", 7.00));
        temp.add(new Bread("White Bread", 6.50));
        temp.add(new Bread("Wheat Bread", 6.50));
        temp.add(new Bread("Wrap", 7.50));
        temp.add(new Bread("Wheat Wrap", 8.50));
        IngredientManager.breadList = temp;
    }

    public void addIngredient(Ingredient ingredient){

        //TODO - Ingredient turkey = new Meat();
        //TODO - we'd need a way to utilize this depending on how we're going to handle our menu; hard code or enter manually

    }

    public void removeIngredient(Ingredient ingredient){

        // TODO - Loop through the arraylist and search for the item entered. If it exists, remove, if not return flag
        // TODO - we'd need a way to utilize this depending on how we're going to handle our menu; hard code or enter manually
    }




}
