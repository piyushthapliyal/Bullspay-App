package com.example.payment_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class broadband_bill extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broadband_bill);
    }

    public void homee(View view) {
        Intent intent = new Intent(broadband_bill.this, landline.class);
        startActivity(intent);
    }
    @Override
    public void onBackPressed() {
        Intent intent=new Intent(broadband_bill.this,landline.class);
        startActivity(intent);
        finish();
    }

    public void plan(View view) {
        Intent intent=new Intent(broadband_bill.this,broadbandbill_payment.class);
        startActivity(intent);
        finish();
    }
}