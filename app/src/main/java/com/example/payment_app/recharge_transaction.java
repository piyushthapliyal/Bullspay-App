package com.example.payment_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class recharge_transaction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recharge_transaction);
    }

    public void homee(View view) {
        Intent intent = new Intent( recharge_transaction.this,wallet.class);
        startActivity(intent);
        finish();
    }
    @Override
    public void onBackPressed() {
        Intent intent=new Intent(recharge_transaction.this, recharge_payment.class);
        startActivity(intent);
        finish();
    }
}