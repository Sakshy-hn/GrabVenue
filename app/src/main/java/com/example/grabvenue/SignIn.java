package com.example.grabvenue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SignIn extends AppCompatActivity {
    private TextView signup;
    private Button signInBtn;
    EditText username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        // remove action bar
        getSupportActionBar().hide();

        signup = findViewById(R.id.signup);
        signInBtn = findViewById(R.id.signInBtn);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SignIn.this,SignUp.class));

            }
        });

        signInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("user") && password.getText().toString().equals("user")) {
                    Intent i = new Intent(SignIn.this, HomePage.class);
                    startActivity(i);
                } else if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                    Intent i = new Intent(SignIn.this, AdminHome.class);
                    startActivity(i);
                }
            }
        });
    }
}