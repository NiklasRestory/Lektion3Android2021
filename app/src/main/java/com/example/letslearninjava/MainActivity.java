package com.example.letslearninjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn_toSecond;
    Button btn_radio;
    Button btn_scroll;
    TextView tv_radioResponse;

    RadioGroup rg_radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.v("MainActitity", "This is a verbose message");
        Log.d("MainActitity", "This is a debug message");
        Log.i("MainActitity", "This is an info message");
        Log.w("MainActitity", "This is a warn message");
        Log.e("MainActitity", "This is an error message (not actually, but)");

        btn_radio = findViewById(R.id.btn_radio);
        btn_scroll = findViewById(R.id.btn_scroll);
        rg_radioGroup = findViewById(R.id.rg_radiogroup);
        tv_radioResponse = findViewById(R.id.tv_radioResponse);

        btn_radio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioButton checkedButton = findViewById(rg_radioGroup.getCheckedRadioButtonId());
                tv_radioResponse.setText("You selected " + checkedButton.getText() + "!");
            }
        });

        btn_toSecond = findViewById(R.id.btn_toSecond);

        Log.d("MainActivity","Hello, debug!");
        Log.i("MainActivity","Hello, info!");

        DataClass sendClass = new DataClass(5);

        btn_toSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("Serializable", sendClass);
                startActivity(intent);
            }
        });

        btn_scroll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ScrollActivity.class);
                startActivity(intent);
            }
        });
    }
}