package com.example.payment_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class recharge_pay extends AppCompatActivity {
    boolean isToggledRadio1 = false;
    RadioButton radiobutton1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recharge_pay);
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

    public void pay(View view) {
        Intent intent=new Intent(recharge_pay.this, mobile_rechargetransc.class);
        startActivity(intent);
        finish();
    }
    @Override
    public void onBackPressed() {
        Intent intent=new Intent(recharge_pay.this, plans.class);
        startActivity(intent);
        finish();
    }
    public void homee(View view) {
        Intent intent=new Intent(recharge_pay.this, plans.class);
        startActivity(intent);
        finish();
    }
}