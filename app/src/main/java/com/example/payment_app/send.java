package com.example.payment_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class send extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send);
    }

    public void draw(View view) {
        Intent intent=new Intent(send.this, scan.class);
        startActivity(intent);
        finish();
    }

    public void bc(View view) {
        Intent intent=new Intent(send.this, home.class);
        startActivity(intent);
        finish();
    }

    public void bck(View view) {
        Intent intent=new Intent(send.this, send_confirm.class);
        startActivity(intent);
        finish();
    }
    @Override
    public void onBackPressed() {
        Intent intent=new Intent(send.this, home.class);
        startActivity(intent);
        finish();
    }
}