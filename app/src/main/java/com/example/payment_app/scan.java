package com.example.payment_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class scan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan);
    }

    public void back(View view) {
        Intent intent=new Intent(scan.this, home.class);
        startActivity(intent);
        finish();
    }

    public void Con(View view) {
        Intent intent=new Intent(scan.this, contacts.class);
        startActivity(intent);
        finish();
    }

    public void to(View view) {
        Intent intent=new Intent(scan.this, contacts.class);
        startActivity(intent);
        finish();
    }


    @Override
    public void onBackPressed() {
        Intent intent=new Intent(scan.this, home.class);
        startActivity(intent);
        finish();
    }

    public void nam(View view) {

        Intent intent=new Intent(scan.this, chat.class);
        startActivity(intent);
        finish();
    }
}