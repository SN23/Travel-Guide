package com.nahal.sukhjinder.the_real_mvp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sukhjinder on 3/4/18.
 */

public class CityListPresenter {

    private List<City> cities = new ArrayList<>();

    String newYorkCityDescription = "Situated on one of the world's largest natural harbors, New York City consists of five boroughs, each of which is a separate county of New York State. The five boroughs – Brooklyn, Queens, Manhattan, The Bronx, and Staten Island – were consolidated into a single city in 1898.";
    Site newYorkCitySite = new Site("Statue Of Liberty", R.drawable.statue_of_liberty, "The Statue of Liberty is a world-famous symbol of freedom, given in the 1880s by France to the United States in celebration of friendship. Nearby Ellis Island was the first stop for millions of immigrants to the U.S. in the late 19th and early 20th centuries.");
    Weather weather = new Weather("40 F", "20%", "Clear Sky", "4 Mph", R.drawable.art_clear);
    Restaurant newYorkCityRestaurant = new Restaurant("Grimaldi's", "Grimaldi's Pizzeria is one of the most popular pizzerias in New York City. In recent years, Zagat Survey rated Grimaldi's No. 1 Pizzeria in New York.", R.drawable.grimaldis);


    String defaultDescription = "Lorem ipsum dolor sit amet, dicat virtute quo no. Et per zril delicata. Simul vulputate in his. Ex ius dicam eloquentiam, usu te nostrud fabulas recusabo, luptatum instructior ea vis. Nec albucius sententiae ea, quo vide appetere invenire id. Nec soleat verear vocibus eu, et est ludus comprehensam.";


    public List<City> loadCities() {
        City newYorkCity = new City("New York City", R.drawable.new_york_city, newYorkCityDescription, newYorkCitySite, weather, newYorkCityRestaurant);

//      Reused details from new york city to simplify
        City boston = new City("Boston", R.drawable.boston, defaultDescription, newYorkCitySite, weather, newYorkCityRestaurant);
        City chicago = new City("Chicago", R.drawable.chicago, defaultDescription, newYorkCitySite, weather, newYorkCityRestaurant);
        City miami = new City("Miami", R.drawable.miami, defaultDescription, newYorkCitySite, weather, newYorkCityRestaurant);
        City dallas = new City("Dallas", R.drawable.dallas, defaultDescription, newYorkCitySite, weather, newYorkCityRestaurant);
        City honolulu = new City("Honolulu", R.drawable.honolulu, defaultDescription, newYorkCitySite, weather, newYorkCityRestaurant);
        City lasVegas = new City("Las Vegas", R.drawable.las_vegas, defaultDescription, newYorkCitySite, weather, newYorkCityRestaurant);
        City losAngeles = new City("Los Angeles", R.drawable.los_angeles, defaultDescription, newYorkCitySite, weather, newYorkCityRestaurant);
        City seattle = new City("Seattle", R.drawable.seattle, defaultDescription, newYorkCitySite, weather, newYorkCityRestaurant);
        City washington_dc = new City("Washington D.C.", R.drawable.washington_dc, defaultDescription, newYorkCitySite, weather, newYorkCityRestaurant);

        cities.add(newYorkCity);
        cities.add(boston);
        cities.add(chicago);
        cities.add(miami);
        cities.add(dallas);
        cities.add(honolulu);
        cities.add(lasVegas);
        cities.add(losAngeles);
        cities.add(seattle);
        cities.add(washington_dc);

        return cities;
    }
    
}
