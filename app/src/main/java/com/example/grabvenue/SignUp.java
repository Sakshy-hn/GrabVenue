package com.example.grabvenue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {
    private Button signup;

    EditText fullname, email, username, password, confpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        fullname = findViewById(R.id.fullname);
        email = findViewById(R.id.email);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        confpassword = findViewById(R.id.confpassword);

        // remove action bar
        getSupportActionBar().hide();

        signup=findViewById(R.id.signupbtn);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    SharedPreferences shrd = getSharedPreferences("GrabVenueData", MODE_PRIVATE);
                    SharedPreferences.Editor editor = shrd.edit();
                    editor.putString("fullname", fullname.getText().toString());
                    editor.putString("email", email.getText().toString());
                    editor.putString("username", username.getText().toString());
                    editor.putString("password", password.getText().toString());

                    editor.apply();

                    Toast.makeText(getApplicationContext(), "Account Created!", Toast.LENGTH_SHORT).show();

                    startActivity(new Intent(SignUp.this,SignIn.class));
            }
        });

    }
}