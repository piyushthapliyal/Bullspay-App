package com.example.payment_app;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.MotionEvent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class login extends AppCompatActivity {
    EditText Password;
    boolean isEmailValid, isPasswordValid, isPasswordVisible;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Password = (EditText) findViewById(R.id.password);

        Password.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                final int RIGHT = 2;
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    if (event.getRawX() >= (Password.getRight() - Password.getCompoundDrawables()[RIGHT].getBounds().width())) {
                        int selection = Password.getSelectionEnd();
                        if (isPasswordVisible) {
                            // set drawable image
                            Password.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.eyeoffsmall, 0);
                            // hide Password
                            Password.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            isPasswordVisible = false;
                        } else  {
                            // set drawable image
                            Password.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.eyesmall, 0);
                            // show Password
                            Password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                            isPasswordVisible = true;
                        }
                        Password.setSelection(selection);
                        return true;
                    }
                }
                return false;
            }
        });

    }

    public void f(View view) {
        Intent intent=new Intent(login.this, forgot_pass.class);
        startActivity(intent);
        finish();

    }

    @Override
    public void onBackPressed() {
        Intent intent=new Intent(login.this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void signup(View view) {
        Intent intent=new Intent(login.this, signup.class);
        startActivity(intent);
        finish();
    }

    public void log(View view) {
        Intent intent=new Intent(login.this, home.class);
        startActivity(intent);
        finish();
    }
}