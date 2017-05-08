package com.beebaby3.buttonlistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonFirst, buttonSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonFirst = (Button)findViewById(R.id.bFirst);
        buttonSecond = (Button)findViewById(R.id.bSecond);
        buttonFirst.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Log.d("Joyous", "First Button was clicked.");
            }
        });


        buttonSecond.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Log.d("Joyous", "Second button was clicked.");

            }
        });

    }


}
