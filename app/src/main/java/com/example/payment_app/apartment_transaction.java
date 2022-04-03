package com.example.payment_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class apartment_transaction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apartment_transaction);
    }
    @Override
    public void onBackPressed() {
        Intent intent=new Intent(apartment_transaction.this, apartment_payment.class);
        startActivity(intent);
        finish();
    }

}