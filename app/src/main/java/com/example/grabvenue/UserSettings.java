package com.example.grabvenue;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class UserSettings extends AppCompatActivity {


    ImageButton profileEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_settings);


        ActionBar actionBar;
        actionBar = getSupportActionBar();
        actionBar.setTitle("Settings");
        ColorDrawable colorDrawable
                = new ColorDrawable(Color.parseColor("#736767"));

        actionBar.setBackgroundDrawable(colorDrawable);

        profileEdit = findViewById(R.id.profileEdit);
        profileEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(UserSettings.this, UserAccountSettings.class);
                startActivity(i);
            }
        });
    }
}