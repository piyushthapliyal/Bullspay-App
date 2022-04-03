package com.example.payment_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class balance_history extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balance_history);
    }
    @Override
    public void onBackPressed() {
        Intent intent=new Intent(balance_history.this, home.class);
        startActivity(intent);
        finish();
    }

    public void homee(View view) {
        Intent intent=new Intent(balance_history.this, home.class);
        startActivity(intent);
        finish();
    }

    public void anime(View view) {
        Intent intent=new Intent(balance_history.this, transactions.class);
        startActivity(intent);
        finish();

    }
}