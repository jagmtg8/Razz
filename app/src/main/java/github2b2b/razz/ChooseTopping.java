package github2b2b.razz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ToggleButton;

import java.util.ArrayList;

public class ChooseTopping extends AppCompatActivity {

    ArrayList<Integer> tags = new ArrayList<>();

    public void onClickTopping(View v){

        int num = Cart.itemsInCart;
        int numOfItemsInCart = num-1;                                                    //-1 to access the arraylist location of the object in reference
        System.out.println("Total # items currently added to cart: XXX = " + num);

        Integer curToppingTag = Integer.parseInt(v.getTag().toString());             //Look at the tag of the item and find the corresponding tag in ingredient manager. **Ask Shane
        Topping curTopping = IngredientManager.toppingList.get(curToppingTag);             //Create object

        if(((ToggleButton) v).isChecked()){
            //on
            tags.add(curToppingTag);
            Cart.addIngredToCur(curTopping);
//            for(int i = 0; i < Cart.chosenItems.get(numOfItemsInCart).ingredientList.size(); i++){
//                Log.i("LOG XXX", Cart.chosenItems.get(numOfItemsInCart).ingredientList.get(i).getIngredientName());                                                         //Print contents of current sandwich ** DEBUG
//            }
        }else{
            //off
            tags.remove(curToppingTag);
            Cart.removeIngredFromCur(curTopping);                                 //Remove current ingredient (Button is not highlighted anymore)
//            for(int i = 0; i < Cart.chosenItems.get(numOfItemsInCart).ingredientList.size(); i++){
//                Log.i("LOG XXX", Cart.chosenItems.get(numOfItemsInCart).ingredientList.get(i).getIngredientName());                                                         //Print contents of current sandwich ** DEBUG
//            }
        }

    }

    public void onClickCompleteSandwich(View v){
        Intent intent = new Intent(this, ContinueOrFinish.class);
        startActivity(intent);
    }

    public void backToPrev(View v){
        if(tags.size()!=0) {
            for (int i = 0; i < tags.size(); i++) {
                Topping curToppimg = IngredientManager.toppingList.get(tags.get(i));               //wipe all cheese ingredients from cur sandwich
                Cart.removeIngredFromCur(curToppimg);
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






    ////
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_topping);
        if(tags.size()!=0){
            tags.clear();
        }
        Intent intent = getIntent();
    }
}
