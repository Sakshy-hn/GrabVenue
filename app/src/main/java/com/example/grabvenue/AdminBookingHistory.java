package com.example.grabvenue;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

public class AdminBookingHistory extends AppCompatActivity {

    ImageButton home,aHistory,aSetting;
    Spinner sort;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_booking_history);


        ActionBar actionBar;
        actionBar = getSupportActionBar();
        actionBar.setTitle("Booking History");
        ColorDrawable colorDrawable
                = new ColorDrawable(Color.parseColor("#736767"));

        actionBar.setBackgroundDrawable(colorDrawable);

        String[] arraySpinner = new String[] {
                "Last 10", "Last 50", "All"
        };
        Spinner s = (Spinner) findViewById(R.id.sort);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter);

        //        Code for Home page button
        home = (ImageButton) findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent histIntent = new Intent(AdminBookingHistory.this, AdminHome.class);
                startActivity(histIntent);
            }
        });

//        Code for Book History of admin application
        aHistory = (ImageButton) findViewById(R.id.adminHistory);
        aHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(AdminBookingHistory.this, "You are viewing this page", Toast.LENGTH_SHORT).show();

            }
        });
//       redirecting to Admin setting page
        aSetting = (ImageButton) findViewById(R.id.adminSettings);
        aSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent settingIntent = new Intent(AdminBookingHistory.this,AdminSettings.class);
                startActivity(settingIntent);
            }
        });

    }
}