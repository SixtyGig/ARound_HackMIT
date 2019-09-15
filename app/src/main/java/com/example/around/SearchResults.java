package com.example.around;
import java.util.HashMap;
public class SearchResults {
    public HashMap<Hotels, Room> Bookings;
    public SearchResults(HashMap<Hotels, Room> Bookings, String CheckInDate, String CheckOutDate, String location) {
        Bookings.forEach((k,v) -> System.out.println("key: "+k+" value:"+v));
    }
}
// dynamic query
// takes in hashmap & takes in input
/*for each hotel, until # of hotels runs out, loop through hashmap, IF hotel is at location
* loop(look at it's rooms (values)) and IF they are between the two days
add to list/
// returns hashmap of choices-- then we can loop through for hotels and also
// loop through for rooms to find hotels first and then rooms: if hotel is chosen, then display it's rooms