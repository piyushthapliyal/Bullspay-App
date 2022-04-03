package com.example.payment_app;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class upi_transfer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upi_transfer);
    }

    public void homee(View view) {
        Intent intent=new Intent(upi_transfer.this, home.class);
        startActivity(intent);
        finish();
    }

    public void draw(View view) {
        Intent intent=new Intent(upi_transfer.this, contacts.class);
        startActivity(intent);
        finish();
    }
    @Override
    public void onBackPressed() {
        Intent intent=new Intent(upi_transfer.this, home.class);
        startActivity(intent);
        finish();
    }

    public void con(View view) {
        Intent intent=new Intent(upi_transfer.this, chat.class);
        startActivity(intent);
        finish();
    }
}