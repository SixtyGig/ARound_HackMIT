import java.lang.reflect.Array;

public class hotel {
    hotel(){
        System.out.println("Hotel Constructor");
    }

}
class hotelID extends hotel{
    int hotelID;
    hotelID(){
        System.out.println("HotelID Constructor");
    }
}
class chainCode extends hotel{
    int chainCode;
    chainCode(){
        System.out.println("chainCode Constructor");
    }
}
class dupeID extends hotel{
    int dupeID;
    dupeID(){
        System.out.println("dupeID Constructor");
    }
}
class name extends hotel{
    String name;
    name(){
        System.out.println("name Constructor");
    }
}
class latitude extends hotel{
    float latitude;
    latitude(){
        System.out.println("latitude Constructor");
    }
}
class longitude extends hotel{
    float longitude;
    longitude(){
        System.out.println("longitude Constructor");
    }
}
class address extends hotel{
    String address;
    address(){
        System.out.println("address Constructor");
    }
}
class postalCode extends hotel{
    float postalCode;
    postalCode(){
        System.out.println("address Constructor");
    }
}
class cityname extends hotel{
    String cityname;
    cityname(){
        System.out.println("cityname Constructor");
    }
}
class countryCode extends hotel{
    String countryCode;
    countryCode(){
        System.out.println("countryCode Constructor");
    }
}
class amenities extends hotel{
    Array amenities[] = {};
    amenities(){
        System.out.println("amenities Constructor");
    }
}
class offers extends hotel{
    Array offers[] = {};
    offers(){
        System.out.println("offers Constructor");
    }
}
class offertype extends offers{
    Array offerlist[]={};
    offertype(){
        System.out.println("offertype Constructor");
    }
}

class Test
{
    public static void main(String[] args)
    {

    }
}
