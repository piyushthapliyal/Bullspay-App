package com.example.payment_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class contact_list extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_list);
    }
    @Override
    public void onBackPressed() {
        Intent intent=new Intent(contact_list.this, recharge.class);
        startActivity(intent);
        finish();
    }

    public void retu(View view) {
        Intent intent = new Intent(contact_list.this, recharge.class);
        startActivity(intent);
        finish();
    }

    public void go(View view) {
        Intent intent = new Intent(contact_list.this, plans.class);
        startActivity(intent);
        finish();
    }
}