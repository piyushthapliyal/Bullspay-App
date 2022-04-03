package com.example.payment_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class chat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
    }
    @Override
    public void onBackPressed() {
        Intent intent=new Intent(chat.this, upi_transfer.class);
        startActivity(intent);
        finish();
    }

    public void bcc(View view) {
        Intent intent=new Intent(chat.this, home.class);
        startActivity(intent);
        finish();
    }

    public void ll(View view) {
        Intent intent=new Intent(chat.this, home.class);
        startActivity(intent);
        finish();
    }

    public void sen(View view) {
        Intent intent=new Intent(chat.this, send_money.class);
        startActivity(intent);
        finish();
    }

    public void rec(View view) {
        Intent intent=new Intent(chat.this, recieve.class);
        startActivity(intent);
        finish();
    }
}