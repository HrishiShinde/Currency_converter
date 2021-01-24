package com.ConDev.convertorous;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void converter(View view){

        EditText amt = findViewById(R.id.doltext);
        TextView opAmt = findViewById(R.id.opTV);
        String dollars = amt.getText().toString();
        Double dubDollars = Double.parseDouble(dollars);
        Double inrAmt =  73 * dubDollars;
        String strAmt = inrAmt.toString() + "rs";
        opAmt.setText(strAmt);

    }
}