package com.example.payment_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class apartment_payment extends AppCompatActivity {
    boolean isToggledRadio1 = false;
    RadioButton radiobutton1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apartment_payment);
        radiobutton1 = findViewById(R.id.radiobutton1);
        radiobutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isToggledRadio1 = !isToggledRadio1; //Switch boolean value
                RadioButton rb = (RadioButton)v;
                rb.setChecked( isToggledRadio1 );
            }
        });
    }

    public void homee(View view) {
        Intent intent=new Intent(apartment_payment.this, electricity.class);
        startActivity(intent);
        finish();
    }
    @Override
    public void onBackPressed() {
        Intent intent=new Intent(apartment_payment.this, electricity.class);
        startActivity(intent);
        finish();
    }

    public void apart(View view) {
        Intent intent=new Intent(apartment_payment.this, apartment_transaction.class);
        startActivity(intent);
        finish();
    }
}