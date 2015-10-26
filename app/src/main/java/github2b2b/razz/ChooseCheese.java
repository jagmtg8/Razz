package github2b2b.razz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ToggleButton;

import java.util.ArrayList;

public class ChooseCheese extends AppCompatActivity {

    ArrayList<Integer> tags = new ArrayList<>();                                    //holds the tags for the buttons that were clicked

    //When a button is clicked..
    public void onClickCheese(View v){

        int num = Cart.itemsInCart;
        int numOfItemsInCart = num-1;                                                        //-1 to access the arraylist location of the object in reference
//        System.out.println("Total # items currently added to cart: XXX = " + num);        //DEBUG
//        Log.i("Items in cart: ", " = " + numOfItemsInCart);

        Integer curCheeseTag = Integer.parseInt(v.getTag().toString());             //Look at the tag of the item and find the corresponding tag in ingredient manager. **Ask Shane
        Cheese curCheese = IngredientManager.cheeseList.get(curCheeseTag);          //Create cheese object

        if(((ToggleButton) v).isChecked()){
            //on
            tags.add(curCheeseTag);
            Cart.addIngredToCur(curCheese);
//            for(int i = 0; i < Cart.chosenItems.get(numOfItemsInCart).ingredientList.size(); i++){
//                Log.i("LOG XXX", Cart.chosenItems.get(numOfItemsInCart).ingredientList.get(i).getIngredientName());                                                                        //Print contents of current sandwich ** DEBUG
//            }
        }else{
            //off
            tags.remove(curCheeseTag);
            Cart.removeIngredFromCur(curCheese);                                 //Remove current ingredient (Button is not highlighted anymore)
//            for(int i = 0; i < Cart.chosenItems.get(numOfItemsInCart).ingredientList.size(); i++){
//                Log.i("LOG XXX", Cart.chosenItems.get(numOfItemsInCart).ingredientList.get(i).getIngredientName());                                                                        //Print contents of current sandwich ** DEBUG
//            }                                                                                            //Print contents of current sandwich ** Debug
        }
    }

    public void nextPage(View v){
        Intent intent = new Intent(this, ChooseTopping.class);
        startActivity(intent);

    }


    //Return to Previous page
    public void backToPrev(View v){
        if(tags.size()!=0) {
            for (int i = 0; i < tags.size(); i++) {
                Cheese curCheese = IngredientManager.cheeseList.get(tags.get(i));               //wipe all cheese ingredients from cur sandwich
                Cart.removeIngredFromCur(curCheese);
            }
        }

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
        setContentView(R.layout.activity_choose_cheese);
        if(tags.size()!=0){
            tags.clear();
        }
        Intent intent = getIntent();
    }
}
