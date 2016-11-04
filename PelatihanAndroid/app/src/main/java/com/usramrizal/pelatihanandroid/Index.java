package com.usramrizal.pelatihanandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

public class Index extends AppCompatActivity {

    private static final String LOG_TAG = Index.class.getCanonicalName();
    private int number;
    private TextView counterNumber;
    private Button plus;
    private Button min;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.index);
        counterNumber = (TextView) findViewById(R.id.txtviewcount);
        plus = (Button) findViewById(R.id.plus);
        min = (Button) findViewById(R.id.min);
        number = Integer.parseInt(String.valueOf(counterNumber.getText()));

        Log.v(LOG_TAG, "Angka Sekarang Nilainya : " + number);
    }

    //Dibawah ini merupakan method manual bukan ListenListener
    public void increment(View view) {
        number++;
        counterNumber.setText("" + number);
    }

    public void decrement(View view) {
        number--;
        counterNumber.setText("" + number);
    }
}
