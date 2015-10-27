package github2b2b.razz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class OrderExit extends AppCompatActivity {

    /** @author -  Shane Demskie, 10/09.  John Sheehan 10/26
     * When a view is passed  ( when clicked ), we call static checkOut method and then we return
     * to the first page  ( MainActivity )
     *
     * @param v - Takes in a view as a parameter.
     */
    public void exitApp(View v){
        //TODO: Add a picture of someone or something funny here.
        Cart.checkOut();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_exit);

        Intent intent = getIntent();
    }
}
