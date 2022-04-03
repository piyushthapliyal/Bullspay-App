package com.example.payment_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class electricity extends AppCompatActivity {
    boolean isToggledRadio1 = false;
    RadioButton radiobutton1,radioButton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electricity);
        radiobutton1 = findViewById(R.id.radiobutton1);
        radiobutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isToggledRadio1 = !isToggledRadio1; //Switch boolean value
                RadioButton rb = (RadioButton)v;
                rb.setChecked( isToggledRadio1 );
            }
        });
        radioButton2 = findViewById(R.id.radiobutton2);
        radioButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isToggledRadio1 = !isToggledRadio1; //Switch boolean value
                RadioButton rb = (RadioButton)view;
                rb.setChecked( isToggledRadio1 );
            }
        });
    }
    @Override
    public void onBackPressed() {
        Intent intent=new Intent(electricity.this, home.class);
        startActivity(intent);
        finish();
    }
    public void homee(View view) {
        Intent intent=new Intent(electricity.this, home.class);
        startActivity(intent);
        finish();
    }

    public void aprt(View view) {
        Intent intent=new Intent(electricity.this, apartment_payment.class);
        startActivity(intent);
        finish();
    }

    public void plan(View view) {
        Intent intent=new Intent(electricity.this, automatic_payments.class);
        startActivity(intent);
        finish();
    }
}