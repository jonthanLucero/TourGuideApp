package com.jlucero.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ShoppingFragment extends Fragment {

    public static String NAME_PLACE = "name_place";
    public static String DESCRIPTION_PLACE = "description_place";
    public static String LOCATION_PLACE = "location_place";
    public static String IMAGE_PLACE = "image_place";

    public ShoppingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Create an array of places
        ArrayList<Place> places = PlaceList.getShoppingList(getContext());

        // Inflate current View object in places_list.xml
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        // Create PlaceAdapter object in current activity for data from places array
        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), places);

        // Create ListView object in places_list.xml and set the PlaceAdapter object to it
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(placeAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Place currentItem = (Place) adapterView.getItemAtPosition(position);

                String namePlace = currentItem.getPlaceName();
                String descriptionPlace = currentItem.getPlaceDescrition();
                String locationPlace = currentItem.getPlaceLocationCoordinates();

                Log.d("LOG","name="+namePlace+",description="+descriptionPlace+",location="+locationPlace);

                int imageResourcePlace = currentItem.getImageResourceID();

                Intent intent = new Intent(getActivity().getApplicationContext(), PlaceActivity.class);
                intent.putExtra(NAME_PLACE,namePlace);
                intent.putExtra(DESCRIPTION_PLACE,descriptionPlace);
                intent.putExtra(LOCATION_PLACE,locationPlace);
                intent.putExtra(IMAGE_PLACE,imageResourcePlace);
                startActivity(intent);
            }
        });

        // Return current View object with the data
        return rootView;
    }
}
