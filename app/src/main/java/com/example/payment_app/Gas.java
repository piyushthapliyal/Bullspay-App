package com.example.payment_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Gas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gas);
    }
    @Override
    public void onBackPressed() {
        Intent intent=new Intent(Gas.this, home.class);
        startActivity(intent);
        finish();
    }

    public void homee(View view) {
        Intent intent=new Intent(Gas.this, home.class);
        startActivity(intent);
        finish();
    }
}