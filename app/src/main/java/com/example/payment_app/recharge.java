package com.example.payment_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class recharge extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recharge);
    }
    @Override
    public void onBackPressed() {
        Intent intent=new Intent(recharge.this, home.class);
        startActivity(intent);
        finish();
    }
    public void retu(View view) {
        Intent intent = new Intent(recharge.this, scan.class);
        startActivity(intent);
        finish();
    }

    public void book(View view) {
        Intent intent = new Intent(recharge.this, contact_list.class);
        startActivity(intent);
        finish();
    }

    public void plan(View view) {
        Intent intent = new Intent(recharge.this, chat.class);
        startActivity(intent);
        finish();
    }

    public void go(View view) {
        Intent intent = new Intent(recharge.this, contact_list.class);
        startActivity(intent);
        finish();
    }
}