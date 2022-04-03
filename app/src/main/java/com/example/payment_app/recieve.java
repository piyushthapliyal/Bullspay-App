package com.example.payment_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class recieve extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recieve);
    }

    public void bcc(View view) {
        Intent intent=new Intent(recieve.this, chat.class);
        startActivity(intent);
        finish();
    }

    public void e(View view) {
        Intent intent=new Intent(recieve.this, recieve_confirm.class);
        startActivity(intent);
        finish();
    }
    @Override
    public void onBackPressed() {
        Intent intent=new Intent(recieve.this, chat.class);
        startActivity(intent);
        finish();
    }

}