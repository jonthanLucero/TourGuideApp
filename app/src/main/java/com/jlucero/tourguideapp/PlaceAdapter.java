package com.jlucero.tourguideapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class PlaceAdapter extends ArrayAdapter<Place> {

    public PlaceAdapter(Context context, ArrayList<Place> object) {
        super(context, 0, object);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get the Place object located at this position in the list
        Place currentPlace = (Place) getItem(position);

        // Find the TextView in the list_item.xml and set to it the place name from Place object
        TextView placeTextView = convertView.findViewById(R.id.place_text_view);
        placeTextView.setText(currentPlace.getPlaceName());

        // Find the ImageView in the list_item.xml and display the provided photo from Place object
        ImageView itemImageView = convertView.findViewById(R.id.item_image);
        itemImageView.setImageResource(currentPlace.getImageResourceID());

        return convertView;
    }
}
