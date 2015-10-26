package github2b2b.razz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ToggleButton;

public class ChooseBread extends AppCompatActivity {

    public void breadClick(View v){

        ToggleButton tb = (ToggleButton) v;

        int curBread = Integer.parseInt(v.getTag().toString());
        Bread curBreadObj = IngredientManager.breadList.get(curBread);           //New Bread obj = Look at the tag of the item and find the corresponding tag in ingredient manager. **Ask Shane

        Sandwich sand = new Sandwich();      //create new bread object.
        sand.addIngredient(curBreadObj);     //set the bread type for the sandwich obj

        Cart.addSand(sand);      //add sandwich ** increment itemInCart counter done in Cart class**
//       Log.i("LOG XXX", "Breads are: ");
//       Log.i("LOG XXX", Cart.chosenItems.get(0).ingredientList.get(0).getIngredientName());                               //DEBUG

        tb.setChecked(false);                                        //change the toggle back to off since we can only have one bread selected
        Intent intent = new Intent(this, ChooseMeat.class);          //Jump to ChooseMeat Activity
        startActivity(intent);                                       //JK, now we can jump
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
        setContentView(R.layout.activity_choose_bread);


        Intent intent = getIntent();


    }
}
