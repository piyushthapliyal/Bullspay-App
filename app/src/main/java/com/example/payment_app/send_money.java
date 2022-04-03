package com.example.payment_app;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class send_money extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_money);
    }

    @Override
    public void onBackPressed() {
        Intent intent=new Intent(send_money.this, chat.class);
        startActivity(intent);
        finish();
    }

    public void bcc(View view) {
        Intent intent=new Intent(send_money.this, chat.class);
        startActivity(intent);
        finish();
    }

    public void e(View view) {
        Intent intent=new Intent(send_money.this, send_confirm.class);
        startActivity(intent);
        finish();
    }
}