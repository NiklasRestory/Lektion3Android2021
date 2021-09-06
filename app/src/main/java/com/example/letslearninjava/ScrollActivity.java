package com.example.letslearninjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class ScrollActivity extends AppCompatActivity {

    RadioGroup rg_drinkGroup;
    Button btn_getDrink;
    TextView tv_gotDrink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll);

        rg_drinkGroup = findViewById(R.id.rg_drinkGroup);
        btn_getDrink = findViewById(R.id.btn_chooseDrink);
        tv_gotDrink = findViewById(R.id.tv_returnDrink);

        btn_getDrink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RadioButton rb_choice = findViewById(rg_drinkGroup.getCheckedRadioButtonId());
                tv_gotDrink.setText("Here's your " + rb_choice.getText());
            }
        });

    }
}