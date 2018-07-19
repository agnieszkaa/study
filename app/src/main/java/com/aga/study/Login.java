package com.aga.study;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Login extends AppCompatActivity {
    EditText loginNameInput = (EditText) findViewById(R.id.loginInput);
    EditText passwordInput = (EditText) findViewById(R.id.passwordInput);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }
    public void login(View view)
    {
        String loginNameText = loginNameInput.getText().toString();
        String passwordText = passwordInput.getText().toString();
    }
}
