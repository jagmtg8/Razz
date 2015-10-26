package github2b2b.razz;

import java.util.ArrayList;
import java.util.Currency;

/**
 * Created by Katipo on 10/4/2015.
 */
public class Cart {

    //TODO: INCREMENT itemsincart at the very end of order process for cur sandwich.
    //TODO: IF WE ADD SANDWICH AND INC IN ADDSAND, WE WILL HAVE BUG IF THEY HIT BACK BUTTON TO RETURN TO CHOOSE BREAD SCREEN. DECREMENT ONBACK BUTTON FOR MEAT SCREEN

    static ArrayList<Sandwich> chosenItems = new ArrayList<>();
    public static int itemsInCart = 0;

    static ArrayList<String> cartContentStringForm = new ArrayList<>();


    public static Currency totalPrice;
    public static int orderNum = 0;


    public static void checkOut(){
        //TODO: Display order on screen. Send order. Print recipt
        //Wipe Cart, and Sandwich. Increment Order Number and return to main menu. ??Write order to log??
    }

    public static void addIngredToCur(Ingredient ingred){
        chosenItems.get(itemsInCart-1).addIngredient(ingred);               //itemsInCart-1 will make the AL be at the correct spot in the AL
    }

    public static void removeIngredFromCur(Ingredient ingred){
        chosenItems.get(itemsInCart-1).removeIngredient(ingred);               //itemsInCart-1 will make the AL be at the correct spot in the AL
    }

    public static void addSand(Sandwich sand){
        chosenItems.add(itemsInCart, sand);
        itemsInCart++;
    }

    public static void eraseSandwich(){


    }



    public static void cancelOrder(){
        //TODO: empty chosenItems list. Clear totalPrice. Basically start the app over without actually doing that..
        if(chosenItems.size()!=0) {
            chosenItems.clear();
        }
        itemsInCart = 0;
    }

}
