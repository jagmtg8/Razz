package github2b2b.razz;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class OrderExit extends AppCompatActivity
{

    /** @author -  Shane Demskie, 10/09.  John Sheehan 10/26
     * When a view is passed  ( when clicked ), we call static checkOut method and then we return
     * to the first page  ( MainActivity )
     *
     * @param v - Takes in a view as a parameter.
     */
    public void exitApp(View v)
    {
        //TODO: Add a picture of someone or something funny here.
        Cart.checkOut();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    /**
     * @author - John Sheehan 10/27
     * When this screen is created, it will automatically return to the Start screen after 7 seconds.
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_exit);

        Intent intent = getIntent();

        new CountDownTimer(7000, 1000)
        {

            public void onTick(long millisecondsUntilDone)
            {
                //(every second)
                //will leave this here in case we need it for some reason
            }


            public void onFinish()
            {
                //(after 7 seconds)
                Cart.checkOut();
                Intent intent = new Intent(OrderExit.this, MainActivity.class);
                startActivity(intent);

            }
        }.start();



    }


}
