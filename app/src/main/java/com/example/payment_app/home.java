package com.example.payment_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void user(View view) {
        Intent intent=new Intent(home.this, profile.class);
        startActivity(intent);
        finish();
    }

    public void q(View view) {
        Intent intent=new Intent(home.this, scan.class);
        startActivity(intent);
        finish();
    }

    public void acc(View view) {
        Intent intent=new Intent(home.this, send.class);
        startActivity(intent);
        finish();
    }

    public void up(View view) {
        Intent intent=new Intent(home.this, upi_transfer.class);
        startActivity(intent);
        finish();
    }
    @Override
    public void onBackPressed() {
        Intent intent=new Intent(home.this, login.class);
        startActivity(intent);
        finish();
    }

    public void blnce(View view) {
        Intent intent=new Intent(home.this, balance_history.class);
        startActivity(intent);
        finish();
    }

    public void phone(View view) {
        Intent intent=new Intent(home.this, recharge.class);
        startActivity(intent);
        finish();
    }

    public void plus(View view) {
        Intent intent=new Intent(home.this, wallet.class);
        startActivity(intent);
        finish();
    }

    public void cr(View view) {
        Intent intent=new Intent(home.this, credit_card.class);
        startActivity(intent);
        finish();
    }

    public void bizli(View view) {
        Intent intent=new Intent(home.this, electricity.class);
        startActivity(intent);
        finish();
    }

    public void net(View view) {
        Intent intent = new Intent(home.this, broadband.class);
        startActivity(intent);
        finish();
    }

    public void plan(View view) {
        Intent intent = new Intent(home.this, Gas.class);
        startActivity(intent);
        finish();
    }
}