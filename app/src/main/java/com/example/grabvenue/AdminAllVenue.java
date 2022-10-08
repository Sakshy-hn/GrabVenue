package com.example.grabvenue;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

public class AdminAllVenue extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_all_venue);

        ActionBar actionBar;
        actionBar = getSupportActionBar();
        actionBar.setTitle("All Venues");
        ColorDrawable colorDrawable
                = new ColorDrawable(Color.parseColor("#736767"));

        actionBar.setBackgroundDrawable(colorDrawable);

    }
}