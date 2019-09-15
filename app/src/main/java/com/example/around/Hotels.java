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
    HttpGet httpget = new HttpGet("/shopping/hotel-offers/by-hotels");
    HttpResponse response = {
            "data": {
    "type": "hotel-offers",
            "hotel": {
        "type": "hotel",
                "hotelId": "BGMILBGB",
                "chainCode": "BG",
                "dupeId": "700025106",
                "name": "BULGARI HOTELS RESORTS MILANO",
                "rating": "5",
                "cityCode": "MIL",
                "latitude": 45.47253,
                "longitude": 9.18805,
                "address": {
            "lines": [
            "VIA PRIVATA FRATELLI GABBA 7B"
        ],
            "postalCode": "20121",
                    "cityName": "MILAN",
                    "countryCode": "IT"
        },
        "contact": {
            "phone": "39-02-8058051",
                    "fax": "39-02-805805222"
        },
        "amenities": [
        "CONVENTION_CTR",
                "MEETING_ROOMS",
                "ICE_MACHINES",
                "RESTAURANT",
                "HANDICAP_FAC",
                "ACC_TOILETS",
                "DIS_PARKG",
                "BABY-SITTING",
                "BEAUTY_PARLOUR",
                "CAR_RENTAL",
                "ELEVATOR",
                "EXCHANGE_FAC",
                "WIFI",
                "LAUNDRY_SVC",
                "SPA",
                "VALET_PARKING",
                "HAIRDRESSER",
                "SWIMMING_POOL",
                "AIR_CONDITIONING",
                "HAIR_DRYER",
                "MINIBAR",
                "MOVIE_CHANNELS",
                "ROOM_SERVICE",
                "TELEVISION",
                "SAFE_DEP_BOX",
                "FITNESS_CENTER"
      ],
        "media": [
        {
            "uri": "http://pdt.multimediarepository.testing.amadeus.com/cmr/retrieve/hotel/B6AA0C7920214C49AAFBCFFF32A15300",
                "category": "EXTERIOR"
        },
        {
            "uri": "http://pdt.multimediarepository.testing.amadeus.com/cmr/retrieve/hotel/0B9245555964410B97E958128EB3DE52",
                "category": "LOBBY"
        },
        {
            "uri": "http://pdt.multimediarepository.testing.amadeus.com/cmr/retrieve/hotel/DDFD5AD22B134110BCDBE64186FE860A",
                "category": "SUITE"
        }
      ]
    },
    "available": true,
            "offers": [
    {
        "id": "8BB1F89D377409FEFACB3E73654A5D765CD812920802E5976BFBB060BAF23AD7",
            "rateCode": "RAC",
            "rateFamilyEstimated": {
        "code": "RAC",
                "type": "P"
    },
        "room": {
        "type": "REG",
                "typeEstimated": {
            "category": "SUPERIOR_ROOM",
                    "beds": 1,
                    "bedType": "KING"
        },
        "description": {
            "lang": "EN",
                    "text": "Regular Rate\nSuperior Room garden or patio view, large bathr\noom, 1 King, 35sqm/377sqft, Wireless internet,"
        }
    },
        "guests": {
        "adults": 2
    },
        "price": {
        "currency": "EUR",
                "total": "857.00"
    },
        "self": "https://test.api.amadeus.com/v2/shopping/hotel-offers/8BB1F89D377409FEFACB3E73654A5D765CD812920802E5976BFBB060BAF23AD7"
    },
    {
        "id": "2E5650829E01B8BD88085B597266F15EF03E6E23BC8DB1A470A6D03F8E2BA1A8",
            "rateCode": "RAC",
            "rateFamilyEstimated": {
        "code": "RAC",
                "type": "P"
    },
        "room": {
        "type": "REG",
                "typeEstimated": {
            "category": "DELUXE_ROOM"
        },
        "description": {
            "lang": "EN",
                    "text": "Regular Rate\nDeluxe Room garden or patio view, walk-in close\nt, large bathroom, 1 King or 2 Queen, 40sqm/430"
        }
    },
        "guests": {
        "adults": 2
    },
        "price": {
        "currency": "EUR",
                "total": "912.00"
    },
        "self": "https://test.api.amadeus.com/v2/shopping/hotel-offers/2E5650829E01B8BD88085B597266F15EF03E6E23BC8DB1A470A6D03F8E2BA1A8"
    }
    ]
}
}; //httpclient.execute(httpget);

    if(response.getStatusLine().getStatusCode() == 200){
        String server_response = EntityUtils.toString(response.getEntity());
        Log.i("Server response", server_response );
    } else {
    Log.i("Server response", "Failed to get server response" );
}

    public static ArrayList<Hotels> hotelListSetup = new ArrayList<>();

}
