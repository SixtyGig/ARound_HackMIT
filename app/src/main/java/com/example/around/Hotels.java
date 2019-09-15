package com.example.around;

import android.util.Log;

import java.util.ArrayList;

import static android.provider.ContactsContract.CommonDataKinds.Website.URL;

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
    HttpGet httpget= new HttpGet(URL);
    HttpResponse response = httpclient.execute(httpget);

    if(response.getStatusLine().getStatusCode() == 200){
        String server_response = EntityUtils.toString(response.getEntity());
        Log.i("Server response", server_response );
} else {
    Log.i("Server response", "Failed to get server response" );
}

    public static ArrayList<Hotels> hotelListSetup = new ArrayList<>();

}
