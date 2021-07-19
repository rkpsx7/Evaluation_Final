package com.example.evaluation_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private EditText mEtEmail, mEtPassword;
    private CheckBox mChkBoxRemember;
    private Button mBtnLogin;
    private String emailVerificationCode = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();

        SharedPreferences sp = getSharedPreferences("database", MODE_PRIVATE);
        SharedPreferences.Editor ed = sp.edit();
        if (sp.contains("Email") && sp.contains("Password")) {
            Intent PreIntent = new Intent(MainActivity.this, HomeActivity.class);
            startActivity(PreIntent);
        }

        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (emailVerification() && passwordVerification()) {
                    if (mChkBoxRemember.isChecked()) {
                        ed.putString("Email", mEtEmail.getText().toString());
                        ed.putString("Password", mEtPassword.getText().toString().trim());
                        ed.apply();
                    }
                    Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                    startActivity(intent);
                }


            }
        });


    }


    private boolean passwordVerification() {
        if (mEtPassword.getText().toString().trim().length() >= 6)
            return true;
        else {
            mEtPassword.setError("Password is very short");
            return false;
        }
    }

    private boolean emailVerification() {
        if (mEtEmail.getText().toString().matches(emailVerificationCode))
            return true;
        else {
            mEtEmail.setError("Invalid Email");
            return false;
        }
    }

    private void initViews() {
        mBtnLogin = findViewById(R.id.btnLogin);
        mChkBoxRemember = findViewById(R.id.chkBoxRememberMe);
        mEtEmail = findViewById(R.id.etUserEmail);
        mEtPassword = findViewById(R.id.etPassword);
    }
}