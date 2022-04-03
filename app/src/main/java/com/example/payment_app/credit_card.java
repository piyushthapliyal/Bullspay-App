package com.example.payment_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class credit_card extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credit_card);
    }

    public void homee(View view) {
        Intent intent=new Intent(credit_card.this, home.class);
        startActivity(intent);
        finish();
    }
    @Override
    public void onBackPressed() {
        Intent intent=new Intent(credit_card.this, home.class);
        startActivity(intent);
        finish();
    }

    public void plan(View view) {
        Intent intent=new Intent(credit_card.this, manage_reminders.class);
        startActivity(intent);
        finish();
    }
}