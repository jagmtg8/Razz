package github2b2b.razz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ToggleButton;

public class ChooseMeat extends AppCompatActivity {


    //When a button is clicked...
    public void onClickMeat(View v){

        int num = Cart.itemsInCart;
        int numOfItemsInCart = num-1;                                           //-1 to access the arraylist location of the object in reference
//        System.out.println("Total # items currently added to cart: XXX = " + num);        //DEBUG

        int curMeatTag = Integer.parseInt(v.getTag().toString());             //Look at the tag of the item and find the corresponding tag in ingredient manager. **Ask Shane
        Meat curMeat = IngredientManager.meatList.get(curMeatTag);            //Create object

        if(((ToggleButton) v).isChecked()){
            //on
            Cart.addIngredToCur(curMeat);
//            for(int i = 0; i < Cart.chosenItems.get(numOfItemsInCart).ingredientList.size(); i++){
//                Log.i("LOG X", Cart.chosenItems.get(numOfItemsInCart).ingredientList.get(i).getIngredientName());                                               //Print contents of current sandwich ** DEBUG
//            }

        }else{
            //off
            Cart.removeIngredFromCur(curMeat);                                                              //Remove current ingredient (Button is not highlighted anymore)
//            for(int i = 0; i < Cart.chosenItems.get(numOfItemsInCart).ingredientList.size(); i++){
//                Log.i("LOG X", Cart.chosenItems.get(numOfItemsInCart).ingredientList.get(i).getIngredientName());                                               //Print contents of current sandwich ** DEBUG
//            }                                                                                            //Print contents of current sandwich ** Debug
        }

    }

    //Advance to next page
    public void nextPage(View v){

        Intent intent = new Intent(this, ChooseCheese.class);
        startActivity(intent);
    }

    //Return to Previous page
    public void backToPrev(View v){

        Cart.chosenItems.get(Cart.itemsInCart-1).removeAllIngredients();                    //wipe all ingredients.
        Log.i("Log itemincart X", String.valueOf(Cart.itemsInCart));                        //print # of ingred in cart
        Cart.itemsInCart = (Cart.itemsInCart-1);
        Log.i("Log itemincart X", String.valueOf(Cart.itemsInCart));                        //print # of ingred in cart
        super.onBackPressed();
    }


    //When the exit button is clicked, activity will go back to start screen.
    public void exitToStart(View v){
        Cart.cancelOrder();                     //Clear the cart and the current sandwich if applicable

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_meat);

        Intent intent = getIntent();
    }
}
