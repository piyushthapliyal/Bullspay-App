package com.example.payment_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class landline extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landline);
    }

    public void homee(View view) {
        Intent intent = new Intent(landline.this, broadband.class);
                startActivity(intent);
    }
    @Override
    public void onBackPressed() {
        Intent intent=new Intent(landline.this,broadband.class);
        startActivity(intent);
        finish();
    }

    public void plan(View view) {
        Intent intent=new Intent(landline.this,broadband_bill.class);
        startActivity(intent);
        finish();
    }
}