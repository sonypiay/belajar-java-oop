package programmer.zaman.now.application;

import programmer.zaman.now.data.City;
import programmer.zaman.now.data.Location;

public class LocationApp {
    public static void main(String[] args) {
//        Location location = new Location(); error
        City city = new City();
        city.name = "Jakarta";

        System.out.println(city.name);
    }
}
