package com.example.around;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Hotels> hotels = Hotels.getHotels(); //getHotels is the database query
    ListView lvHotels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvHotels = findViewById(R.id.lvHotels);
        HotelAdapter hotelAdapter = new HotelAdapter();
        lvHotels.setAdapter(hotelAdapter);
    }

    class HotelAdapter extends BaseAdapter
    {
        @Override
        public int getCount()
        {
            return hotels.size();
        }

        public Hotels getItem(int position)
        {
            return hotels.get(position);
        }

        public long getItemId(int position)
        {
            return 0;
        }

        public View getView(int position, View convertView, ViewGroup parent)
        {
            View itemView = getLayoutInflater().inflate(R.layout.list_item_hotel, parent, false);

            EditText tvName = (EditText) itemView.findViewById(R.id.etName);
            //TextView tv test = itemView.findViewById(R.id.tvTest);
            etName.setText(getItem(position).getName());
            tvTest.setText(getItem(position).getTest());
            return itemView;
        }



    }

}
