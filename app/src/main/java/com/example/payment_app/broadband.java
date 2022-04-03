package com.example.payment_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class broadband extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broadband);
    }
    @Override
    public void onBackPressed() {
        Intent intent=new Intent(broadband.this,home.class);
        startActivity(intent);
        finish();
    }

    public void retu(View view) {
        Intent intent=new Intent(broadband.this, home.class);
        startActivity(intent);
        finish();
    }

    public void braod(View view) {
            Intent intent=new Intent(broadband.this,landline.class);
            startActivity(intent);
            finish();

    }
}