package github2b2b.razz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ToggleButton;

public class ChooseBread extends AppCompatActivity {

    /** @author -  Shane Demskie, 10/09
     * When a view is passed  ( when clicked ), we get the tag of the object ( an integer ) which
     * corresponds to the location in the ingredientManager list and instantiate the matching
     * locations object. We then make a new sandwich object, add the bread object to the list of
     * ingredients, and add the sandwich to the cart. We then set the toggle button to un clicked
     * and proceed to the ChooseMeat activity using intent
     *
     * @param v - Takes in a view as a parameter.
     */
    public void breadClick(View v){

        ToggleButton tb = (ToggleButton) v;

        int curBread = Integer.parseInt(v.getTag().toString());
        Bread curBreadObj = IngredientManager.breadList.get(curBread);           //New Bread obj = Look at the tag of the item and find the corresponding tag in ingredient manager. **Ask Shane

        Sandwich sand = new Sandwich();      //create new bread object.
        sand.addIngredient(curBreadObj);     //set the bread type for the sandwich obj
        sand.itemPrice = curBreadObj.breadPrice;  //Set the price of the item

        Cart.addSand(sand);      //add sandwich ** increment itemInCart counter done in Cart class**

        tb.setChecked(false);                                        //change the toggle back to off since we can only have one bread selected
        Intent intent = new Intent(this, ChooseMeat.class);          //Jump to ChooseMeat Activity
        startActivity(intent);                                       //JK, now we can jump
    }



    /**@author -  Shane Demskie, 10/09
     * When a view is passed  ( when clicked ), We call static method cancelOrder, and then change
     * activity to start screen.
     *
     * @param v - Takes in a view as a parameter.
     */
    public void exitToStart(View v){
        Cart.cancelOrder();                     //Clear the cart and the current sandwich if applicable

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_bread);


        Intent intent = getIntent();


    }
}
