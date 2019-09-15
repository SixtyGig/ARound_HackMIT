package com.example.around;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.amadeus.Amadeus;
import com.amadeus.Params;
import com.amadeus.resources.*;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvHotels;
    EditText etSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvHotels = (ListView) findViewById(R.id.lvHotels);
        etSearch = (EditText) findViewById(R.id.etSearch);
        HotelAdapter hotelAdapter = new HotelAdapter();
        lvHotels.setAdapter(hotelAdapter);
    }

    class HotelAdapter extends BaseAdapter
    {
        @Override
        public int getCount()
        {
            return lvHotels.getCount();
        }

        public Hotels getItem(int position)
        {
            return lvHotels.get(position);
        }

        public long getItemId(int position)
        {
            return 0;
        }

        public View getView(int position, View convertView, ViewGroup parent)
        {
            View itemView = getLayoutInflater().inflate(R.layout.listofhotels, parent, false);

            //TextView tv test = itemView.findViewById(R.id.tvTest);
            return itemView;
        }
    }
    public void amadeusCall() throws ResponseException {
        Amadeus amadeus = Amadeus
                .builder("tJtxA16mqQnXlPIFfArHDCanuzS9wCFA", "rWLNeo3DAvwzM3u8")
                .build();
        ArrayList<String> hotelIds = new ArrayList<>();
        HotelOffer[] hotels = amadeus.shopping.hotelOffers.get(Params
                .with("cityCode", "PAR"));
        for (int i = 0; i < hotels.length; i++) {
            String hotel_id = hotels[i].getHotel().getHotelId();
            hotelIds.add(hotel_id);
        }
        ArrayList<HotelOffer.RoomDetails> rooms = new ArrayList<>();
        for (int i = 0; i < hotelIds.size(); i++) {
            HotelOffer hotelByHotel = amadeus.shopping.hotelOffersByHotel.get(Params
                    .with("hotelId", hotelIds.get(i)));
            Offer[] allOffers = hotelByHotel.getOffers();
            for (int j = 0; j < allOffers.length; j++) {
                HotelOffer.RoomDetails room = allOffers[i].getRoom();
                rooms.add(room);
            }
        }
    }

    public void searchButton(View view)
    {
        Intent myIntent = new Intent(MainActivity.this, listofhotels.class);
        myIntent.putExtra("key", value); //Optional parameters
        MainActivity.this.startActivity(myIntent);
    }

}
