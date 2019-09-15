package com.example.around;

import android.util.Log;

import java.util.ArrayList;

import static android.provider.ContactsContract.CommonDataKinds.Website.URL;
import org.apache.http.client.HttpClient;

public class Hotels
{
    String name;
    String location;
    String dateCheckIn;
    String dateCheckOut;
    String roomType;

    int numBeds;

    double price;

    public Hotels(String name, String location, String dateCheckIn, String dateCheckOut, String roomType, int numBeds, double price)
    {
        // Strings
        this.name = name;
        this.location = location;
        this.dateCheckIn = dateCheckIn;
        this.dateCheckOut = dateCheckOut;
        this.roomType = roomType;

        // ints
        this.numBeds = numBeds;

        // doubles
        this.price = price;

    }

    public String getName() { return name; }
    public String getLocation() { return location; }
    public String getDateCheckIn() { return dateCheckIn; }
    public String getDateCheckOut() { return dateCheckOut; }
    public String getRoomType() { return roomType; }
    public double getPrice() { return price; }

    HttpClient httpclient = new DefaultHttpClient();
    HttpGet httpget = new HttpGet("/shopping/hotel-offers/by-hotels");
    HttpResponse response = null;


    public ArrayList<Hotels> hotelListSetup = new ArrayList();
    {
        for(int i = 0; i <= 60; i++)
    {
        hotelListSetup.add(/* API CALL*/null);
    }
        
        
        
    }
    
      public void selectRoomButton(Hotels name)
    {
//         Intent myIntent = new Intent(MainActivity.this, listofhotels.class);
//         myIntent.putExtra("key", value); //Optional parameters
//         MainActivity.this.startActivity(myIntent);
          
          
          Intent intent = new Intent(Intent.ACTION_MAIN);
    intent.setComponent(new ComponentName(
                                "package_name","AnyWhereDoor.MainActivity"));
    startActivity(intent);
    }

}
