package github2b2b.razz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class OrderExit extends AppCompatActivity {

    public void exitApp(View v){

        //TODO: Add a picture of someone or something funny here. jhdkfjhaskdf
        Log.i("TEST", "test");

        //checkout and go back to first screen
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
