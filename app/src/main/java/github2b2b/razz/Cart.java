package github2b2b.razz;


import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Locale;

/**
 * Created by Katipo on 10/4/2015.
 */
public class Cart {

    /**
     * @param chosenItems - Holds current items in cart (Sandwich objects).
     * @param itemsInCart - keeps track of number of items in cart
     * @param cartContentStringForm - Holds the string rep, (sandwich description ) of the items in cart
     * @param totalPrice - Holds the current total for items in cart
     * @param orderNum - Holds the current order number
     */
    static ArrayList<Sandwich> chosenItems = new ArrayList<>();
    public static int itemsInCart = 0;
    static ArrayList<String> cartContentStringForm = new ArrayList<>();
    public static NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.US);
    public static int orderNum = 0;

    /**@author Shane Demskie 10/10
     * TO BE COMPLETED: Send order to other device and write to log (maybe?)
     *
     * Clears items in cart, sets itemsInCart counter to 0, and increments orderNumber
     *
     *
     */
    public static void checkOut(){
        //TODO: Send order. Print receipt ??Write order to log??

        chosenItems.clear();
        itemsInCart = 0;
        orderNum++;

    }

    /**@author Shane Demskie 10/10
     *adds the ingredient to the current sandwich in cart
     *
     * @param ingred - A passed in Ingredient Object ( Meat, Cheese, Bread, Topping )
     */
    public static void addIngredToCur(Ingredient ingred){
        chosenItems.get(itemsInCart-1).addIngredient(ingred);               //itemsInCart-1 will make the AL be at the correct spot in the AL
    }
    /**@author Shane Demskie 10/10
     * removes the ingredient to the current sandwich in cart
     *
     * @param ingred - A passed in Ingredient Object ( Meat, Cheese, Bread, Topping )
     */
    public static void removeIngredFromCur(Ingredient ingred){
        chosenItems.get(itemsInCart-1).removeIngredient(ingred);               //itemsInCart-1 will make the AL be at the correct spot in the AL
    }
    /**@author Shane Demskie 10/10
     *adds sandwich to Cart at designated location. Location given by itemsInCart Counter.
     *
     * @param sand - A passed in Ingredient Object ( Meat, Cheese, Bread, Topping )
     *
     */
    public static void addSand(Sandwich sand){
        chosenItems.add(itemsInCart, sand);
        itemsInCart++;
    }

    public static void eraseSandwich(){
    //TODO: Erase designated sandwich in list if specified to do so
    }


    /**@author Shane Demskie 10/10
     *
     * Wipes the Cart contents and sets itemsInCart counter to 0.
     *
     *
     */
    public static void cancelOrder(){

        //TODO: Clear totalPrice.

        if(chosenItems.size()!=0) {
            chosenItems.clear();
        }
        itemsInCart = 0;
    }

}
