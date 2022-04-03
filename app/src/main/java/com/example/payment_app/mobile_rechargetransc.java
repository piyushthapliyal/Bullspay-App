package com.example.payment_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class mobile_rechargetransc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile_rechargetransc);
    }
    @Override
    public void onBackPressed() {
        Intent intent=new Intent(mobile_rechargetransc.this, plans.class);
        startActivity(intent);
        finish();
    }

    public void go(View view) {
        Intent intent=new Intent(mobile_rechargetransc.this, plans.class);
        startActivity(intent);
        finish();
    }
}