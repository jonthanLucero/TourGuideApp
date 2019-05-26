package com.jlucero.tourguideapp;

import android.content.Context;

import java.util.ArrayList;

public class PlaceList
{
    public static ArrayList<Place> getCultureList(Context context)
    {
        // Add to an array new objects with the data
        Place placeItem;
        ArrayList<Place> cultureList = new ArrayList<>();

        placeItem = new Place(convertIntToString(context,R.string.faneuil_hall_in_boston),
                R.drawable.faneuil_hall,convertIntToString(context,R.string.faneuil_hall_in_boston_description),
                convertIntToString(context,R.string.faneuil_hall_in_boston_location));
        cultureList.add(placeItem);

        placeItem = new Place(convertIntToString(context,R.string.river_walk_in_san_antonio),
                R.drawable.san_antonio_river_walk,convertIntToString(context,R.string.river_walk_in_san_antonio_description),
                convertIntToString(context,R.string.river_walk_in_san_antonio_location));
        cultureList.add(placeItem);

        placeItem = new Place(convertIntToString(context,R.string.white_house_in_washington),
                R.drawable.white_house,convertIntToString(context,R.string.white_house_in_washington_description),
                convertIntToString(context,R.string.white_house_in_washington_location));
        cultureList.add(placeItem);

        placeItem = new Place(convertIntToString(context,R.string.walt_disney_world_in_orlando),
                R.drawable.walt_disney_world,convertIntToString(context,R.string.walt_disney_world_in_orlando_description),
                convertIntToString(context,R.string.walt_disney_world_in_orlando_location));
        cultureList.add(placeItem);

        placeItem = new Place(convertIntToString(context,R.string.french_quarter_in_new_orleans),
                R.drawable.french_quarter,convertIntToString(context,R.string.french_quarter_in_new_orleans_description),
                convertIntToString(context,R.string.french_quarter_in_new_orleans_location));
        cultureList.add(placeItem);
        return cultureList;
    }

    public static ArrayList<Place> getMonumentList(Context context)
    {
        // Add to an array new objects with the data
        Place placeItem;
        ArrayList<Place> monumentList = new ArrayList<>();

        placeItem = new Place(convertIntToString(context,R.string.mount_rushmore),
                R.drawable.mount_rushmore,convertIntToString(context,R.string.mount_rushmore_description),
                convertIntToString(context,R.string.mount_rushmore_location));
        monumentList.add(placeItem);

        placeItem = new Place(convertIntToString(context,R.string.national_world_war_ii_Memorial),
                R.drawable.national_world_war_ii_memorial,convertIntToString(context,R.string.national_world_war_ii_Memorial_description),
                convertIntToString(context,R.string.national_world_war_ii_Memorial_location));
        monumentList.add(placeItem);

        placeItem = new Place(convertIntToString(context,R.string.castle_clinton_national_park),
                R.drawable.castle_clinton_national_park,convertIntToString(context,R.string.castle_clinton_national_park_description),
                convertIntToString(context,R.string.castle_clinton_national_park_location));
        monumentList.add(placeItem);

        placeItem = new Place(convertIntToString(context,R.string.lincoln_memorial),
                R.drawable.lincoln_memorial,convertIntToString(context,R.string.lincoln_memorial_description),
                convertIntToString(context,R.string.lincoln_memorial_location));
        monumentList.add(placeItem);

        placeItem = new Place(convertIntToString(context,R.string.george_washington_memorial_parkway),
                R.drawable.george_washington_memorial_parkway,convertIntToString(context,R.string.george_washington_memorial_parkway_description),
                convertIntToString(context,R.string.george_washington_memorial_parkway_location));
        monumentList.add(placeItem);
        return monumentList;
    }

    public static ArrayList<Place> getParkList(Context context)
    {
        // Add to an array new objects with the data
        Place placeItem;
        ArrayList<Place> parkList = new ArrayList<>();

        placeItem = new Place(convertIntToString(context,R.string.mesa_verde),
                R.drawable.mesa_verde,convertIntToString(context,R.string.mesa_verde_description),
                convertIntToString(context,R.string.mesa_verde_location));
        parkList.add(placeItem);

        placeItem = new Place(convertIntToString(context,R.string.navy_pier_in_chicago),
                R.drawable.navy_pier,convertIntToString(context,R.string.navy_pier_in_chicago_description),
                convertIntToString(context,R.string.navy_pier_in_chicago_location));
        parkList.add(placeItem);

        placeItem = new Place(convertIntToString(context,R.string.great_smoky_mountains_national_park),
                R.drawable.great_smoky_mountains_national_park,convertIntToString(context,R.string.great_smoky_mountains_national_park_description),
                convertIntToString(context,R.string.great_smoky_mountains_national_park_location));
        parkList.add(placeItem);

        placeItem = new Place(convertIntToString(context,R.string.bryce_canyon_national_park),
                R.drawable.bryce_canyon_national_park,convertIntToString(context,R.string.bryce_canyon_national_park_description),
                convertIntToString(context,R.string.bryce_canyon_national_park_location));
        parkList.add(placeItem);

        placeItem = new Place(convertIntToString(context,R.string.sedona_red_rock_country),
                R.drawable.sedona_red_rock_country,convertIntToString(context,R.string.sedona_red_rock_country_description),
                convertIntToString(context,R.string.sedona_red_rock_country_location));
        parkList.add(placeItem);
        return parkList;
    }

    public static ArrayList<Place> getShoppingList(Context context)
    {
        // Add to an array new objects with the data
        Place placeItem;
        ArrayList<Place> shoppingList = new ArrayList<>();

        placeItem = new Place(convertIntToString(context,R.string.mall_of_america),
                R.drawable.mall_of_america,convertIntToString(context,R.string.mall_of_america_description),
                convertIntToString(context,R.string.mall_of_america_location));
        shoppingList.add(placeItem);

        placeItem = new Place(convertIntToString(context,R.string.aventura_mall),
                R.drawable.mall_aventura,convertIntToString(context,R.string.aventura_mall_description),
                convertIntToString(context,R.string.aventura_mall_location));
        shoppingList.add(placeItem);

        placeItem = new Place(convertIntToString(context,R.string.del_amo_fashion_center),
                R.drawable.mall_del_amo,convertIntToString(context,R.string.del_amo_fashion_center_description),
                convertIntToString(context,R.string.del_amo_fashion_center_location));
        shoppingList.add(placeItem);

        placeItem = new Place(convertIntToString(context,R.string.woodfield_mall),
                R.drawable.mall_woodfield,convertIntToString(context,R.string.woodfield_mall_description),
                convertIntToString(context,R.string.woodfield_mall_location));
        shoppingList.add(placeItem);

        placeItem = new Place(convertIntToString(context,R.string.sawgrass_mills),
                R.drawable.malls_sawgrass,convertIntToString(context,R.string.sawgrass_mills_description),
                convertIntToString(context,R.string.sawgrass_mills_location));
        shoppingList.add(placeItem);
        return shoppingList;
    }

    public static String convertIntToString(Context context, int value)
    {
        return context.getString(value);
    }
}
