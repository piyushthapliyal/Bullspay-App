package com.example.payment_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class wallet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallet);
    }

    public void bcc(View view) {
        Intent intent = new Intent(wallet.this, home.class);
        startActivity(intent);
        finish();
    }
    @Override
    public void onBackPressed() {
        Intent intent=new Intent(wallet.this, home.class);
        startActivity(intent);
        finish();
    }

    public void next(View view) {
        Intent intent = new Intent(wallet.this, recharge_payment.class);
        startActivity(intent);
        finish();
    }
}