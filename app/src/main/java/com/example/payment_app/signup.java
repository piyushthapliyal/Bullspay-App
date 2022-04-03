package com.example.payment_app;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;

public class signup extends AppCompatActivity {
    EditText Password;
    boolean isEmailValid, isPasswordValid, isPasswordVisible;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
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

    @Override
    public void onBackPressed() {
        Intent intent=new Intent(signup.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
    public void logU(View view) {
        Intent intent=new Intent(signup.this, home.class);
        startActivity(intent);
        finish();
    }
    public void signin(View view) {
        Intent intent=new Intent(signup.this, login.class);
        startActivity(intent);
        finish();
    }
}