package com.example.payment_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class recharge_payment extends AppCompatActivity {
    boolean isToggledRadio1 = false;
RadioButton radiobutton1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recharge_payment);
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
    @Override
    public void onBackPressed() {
        Intent intent=new Intent(recharge_payment.this, wallet.class);
        startActivity(intent);
        finish();
    }

    public void homee(View view) {
        Intent intent = new Intent( recharge_payment.this,wallet.class);
        startActivity(intent);
        finish();
    }

    public void pay(View view) {
        Intent intent = new Intent( recharge_payment.this,recharge_transaction.class);
        startActivity(intent);
        finish();
    }
}