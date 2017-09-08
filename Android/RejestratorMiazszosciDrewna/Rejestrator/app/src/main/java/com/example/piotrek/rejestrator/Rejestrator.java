package com.example.piotrek.rejestrator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Rejestrator extends AppCompatActivity {

    EditText defaultWorker;
    EditText defaultPlace;
    EditText defaultDate;
    EditText defaultType;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rejestrator);

        defaultWorker = (EditText) findViewById(R.id.defaultWorker);
        defaultPlace = (EditText) findViewById(R.id.defaultPlace);
        defaultDate = (EditText) findViewById(R.id.defaultDate);
        defaultType = (EditText) findViewById(R.id.defaultType);


    }
}
