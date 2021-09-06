package com.example.letslearninjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tv_receivedData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tv_receivedData = findViewById(R.id.tv_receiveData);

        Intent intent = getIntent();
        DataClass sentClass = (DataClass) intent.getSerializableExtra("Serializable");
        tv_receivedData.setText("We got a class with the variable " + sentClass.getI());
    }
}