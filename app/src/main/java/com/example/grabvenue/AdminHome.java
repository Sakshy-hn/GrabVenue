package com.example.grabvenue;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class AdminHome extends AppCompatActivity {

    ImageButton addVenue, updateVenue, listallvenue, home, aHistory, aSetting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_home);


        ActionBar actionBar;
        actionBar = getSupportActionBar();
        actionBar.setTitle("Admin Home");
        ColorDrawable colorDrawable
                = new ColorDrawable(Color.parseColor("#736767"));

        actionBar.setBackgroundDrawable(colorDrawable);


//        Code redirect from Home page to Add Venue page
        addVenue = (ImageButton) findViewById(R.id.addVenue);
        addVenue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent addVenueIntent = new Intent(AdminHome.this, AddVenue.class);
                startActivity(addVenueIntent);
            }
        });
//        Code redirect from Home page to Update Venue page
        updateVenue = (ImageButton) findViewById(R.id.updateVenue);
        updateVenue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent updateVenueIntent = new Intent(AdminHome.this,UpdateVenue.class);
                startActivity(updateVenueIntent);
            }
        });
//        Code redirect from Home page to list all Venue page
        listallvenue = (ImageButton) findViewById(R.id.listVenues);
        listallvenue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent listVenuesIntent = new Intent(AdminHome.this,AdminAllVenue.class);
                startActivity(listVenuesIntent);
            }
        });

//        Code for Home page button
//        home = (ImageButton) findViewById(R.id.adminHome);
//        home.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(AdminHome.this, "You are viewing this page", Toast.LENGTH_SHORT).show();
//            }
//        });

//        Code for Book History of admin application
//        aHistory = (ImageButton) findViewById(R.id.adminBooking);
//        aHistory.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent histIntent = new Intent(AdminHome.this, AdminBookingHistory.class);
//                startActivity(histIntent);
//            }
//        });

//       redirecting to Admin setting page
//        aSetting = (ImageButton) findViewById(R.id.adminSettings);
//        aSetting.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent settingIntent = new Intent(AdminHome.this,AdminSettings.class);
//                startActivity(settingIntent);
//            }
//        });

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.adminHome:
                Toast.makeText(getApplicationContext(), "You are already in Home.", Toast.LENGTH_SHORT).show();
                return  true;
            case R.id.adminBooking:
                Intent intentData = new Intent(getApplicationContext(), AdminBookingHistory.class);
                startActivity(intentData);
                AdminHome.this.finish();
                return true;
            case R.id.adminSettings:
                Intent i = new Intent(getApplicationContext(), AdminSettings.class);
                startActivity(i);
                AdminHome.this.finish();
                return true;
        }
        return false;
    }

}