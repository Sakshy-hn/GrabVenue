package com.example.grabvenue;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class VenueListAdapter extends BaseAdapter {

    Context context;
    String listVenue[];
    int listLogo[];
    LayoutInflater inflater;

    Button mDialogButton;
    TextView okay_text, cancel_text;

    public VenueListAdapter(Context ctx, String[] venueTitles, int[] venueLogos){
        this.context = ctx;
        this.listVenue = venueTitles;
        this.listLogo = venueLogos;
        inflater = LayoutInflater.from(ctx);
    }

    @Override
    public int getCount() {
        return listVenue.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View convertView = inflater.inflate(R.layout.activity_venueitemlist, null);
        TextView txtView = convertView.findViewById(R.id.venueTitle);
        ImageView venueLogo = convertView.findViewById(R.id.venueLogo);
        txtView.setText(listVenue[i]);
        venueLogo.setImageResource(listLogo[i]);



        View row = inflater.inflate(R.layout.activity_venueitemlist, viewGroup, false);
        Button bookBtn = (Button) row.findViewById(R.id.bookBtn);
        bookBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(context, "Booked", Toast.LENGTH_SHORT).show();
            }
        });


        return convertView;
    }
}
