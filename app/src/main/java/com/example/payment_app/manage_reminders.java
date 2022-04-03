package com.example.payment_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class manage_reminders extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_reminders);
    }

    public void homee(View view) {
        Intent intent=new Intent(manage_reminders.this, credit_card.class);
        startActivity(intent);
        finish();
    }
    @Override
    public void onBackPressed(){
        Intent intent=new Intent(manage_reminders.this, credit_card.class);
        startActivity(intent);
        finish();
    }
}