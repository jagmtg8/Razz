package github2b2b.razz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    /** @author -  Shane Demskie, 10/09
     * When a view is passed  ( when clicked ), we continue to the next activity ( ChooseBread )
     *
     * @param v - Takes in a view as a parameter.
     */
    public void startButtonClick(View v){
        Intent intent = new Intent(this, ChooseBread.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        IngredientManager.fillALl();                //fill ingredient manager
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();


    }
}
