package com.example.grabvenue;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class HomePage extends AppCompatActivity {

    ImageButton btn_outdoor;
    ImageButton settingsbtn;
    ImageButton historyBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        ActionBar actionBar;
        actionBar = getSupportActionBar();
        actionBar.setTitle("Home");
        ColorDrawable colorDrawable
                = new ColorDrawable(Color.parseColor("#736767"));

        actionBar.setBackgroundDrawable(colorDrawable);

        btn_outdoor = findViewById(R.id.btn_outdoor);
        settingsbtn = findViewById(R.id.settingsbtn);

        btn_outdoor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomePage.this, UserAllVenue.class);
                startActivity(i);
            }
        });

        settingsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomePage.this, UserSettings.class);
                startActivity(i);
            }
        });

//        historyBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(HomePage.this, UserBookingHistory.class);
//                startActivity(i);
//            }
//        });

    }
}