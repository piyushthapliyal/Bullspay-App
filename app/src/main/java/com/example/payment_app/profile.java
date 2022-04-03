package com.example.payment_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }

    public void back(View view) {
        Intent intent=new Intent(profile.this, home.class);
        startActivity(intent);
        finish();
    }

    public void ulu(View view) {
        Intent intent=new Intent(profile.this, contacts.class);
        startActivity(intent);
        finish();
    }
    @Override
    public void onBackPressed() {
        Intent intent=new Intent(profile.this, home.class);
        startActivity(intent);
        finish();
    }
}