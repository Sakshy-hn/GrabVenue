package com.example.grabvenue;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class venueitemlist extends AppCompatActivity {

    Button mDialogButton;
    TextView okay_text, cancel_text;

//    LinearLayout card1, venueDetails;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venueitemlist);

//        card1 = findViewById(R.id.card1);
//        venueDetails = findViewById(R.id.venueDetails);
//
//        venueDetails.setVisibility(View.GONE);
//
//        card1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                venueDetails.setVisibility(View.VISIBLE);
//            }
//        });

        mDialogButton = findViewById(R.id.bookBtn);
        Dialog dialog = new Dialog(venueitemlist.this);

        mDialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog.setContentView(R.layout.booking_dialog);
                dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                dialog.setCancelable(false);
                dialog.getWindow().getAttributes().windowAnimations = R.style.animation;

                okay_text = dialog.findViewById(R.id.okay_text);
                cancel_text = dialog.findViewById(R.id.cancel_text);

                okay_text.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                        Toast.makeText(venueitemlist.this, "okay clicked", Toast.LENGTH_SHORT).show();
                    }
                });

                cancel_text.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                        Toast.makeText(venueitemlist.this, "Cancel clicked", Toast.LENGTH_SHORT).show();
                    }
                });

                dialog.show();

            }
        });


    }
}