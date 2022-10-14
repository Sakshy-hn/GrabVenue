package com.example.grabvenue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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
                SharedPreferences shrd = getSharedPreferences("GrabVenueData", MODE_PRIVATE);

                String uname = shrd.getString("username","noname");
                String pass = shrd.getString("password", "nopass");

                if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                    Toast.makeText(getApplicationContext(), "Admin Login Success!", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(SignIn.this,AdminHome.class));
                } else {
                    if (password.getText().toString().equals(pass) && username.getText().toString().equals(uname)) {
                        Toast.makeText(getApplicationContext(), "Login Success!", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(SignIn.this, HomePage.class));
                    } else {
                        Toast.makeText(getApplicationContext(), "User Not Found, Please Register.", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(SignIn.this, SignUp.class));
                    }
                }
            }
        });
    }
}