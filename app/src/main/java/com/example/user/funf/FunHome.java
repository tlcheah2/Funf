package com.example.user.funf;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class FunHome extends Activity {

    public static final String TAG = FunHome.class.getSimpleName();

    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_home);
        //Declare View Variable
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        final Button showFactButton = (Button) findViewById(R.id.showFactButton);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    String fact = mFactBook.getFact();
                    int color = mColorWheel.getColor();
                    //Update the label fact with the random fact
                    factLabel.setText(fact);
                    relativeLayout.setBackgroundColor(color);
                    showFactButton.setTextColor(color);
                }
        };
        showFactButton.setOnClickListener(listener);

        //Once of the Debugging Method (Toast) by showing a simple text message when running the app
        //Toast.makeText(this, "All done!", Toast.LENGTH_LONG).show();
        //2nd way of debugging, using different level of log and Log will displayed in logcat
        //Log.d(TAG, "The activity is created");
    }
}
