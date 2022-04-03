package com.example.payment_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class plans extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plans);
    }
    @Override
    public void onBackPressed() {
        Intent intent=new Intent(plans.this, contact_list.class);
        startActivity(intent);
        finish();
    }

    public void bcc(View view) {
        Intent intent=new Intent(plans.this, contact_list.class);
        startActivity(intent);
        finish();
    }

    public void go(View view) {
        Intent intent=new Intent(plans.this, mobile_rechargetransc.class);
        startActivity(intent);
        finish();
    }

    public void plus(View view) {
        Intent intent=new Intent(plans.this, recharge_pay.class);
        startActivity(intent);
        finish();
    }
}