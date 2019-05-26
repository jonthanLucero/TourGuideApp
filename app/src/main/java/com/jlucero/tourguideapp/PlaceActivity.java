package com.jlucero.tourguideapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class PlaceActivity extends AppCompatActivity {

    public static String NAME_PLACE = "name_place";
    public static String DESCRIPTION_PLACE = "description_place";
    public static String LOCATION_PLACE = "location_place";
    public static String IMAGE_PLACE = "image_place";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place);
        setupToolBar();
        showing();
    }

    public void showing() {
        int imagePlace;
        String namePlace;
        String descriptionPlace;
        String locationPlace;


        if(getIntent().getStringExtra(NAME_PLACE)!= null)
        {
        /*if(getIntent().getStringExtra(NAME_PLACE) != null && getIntent().getStringExtra(DESCRIPTION_PLACE) != null &&
                getIntent().getStringExtra(LOCATION_PLACE) != null && getIntent().getIntExtra(IMAGE_PLACE,0) != 0)
        {*/
            // Get extras from Intent.
            namePlace        = getIntent().getStringExtra(NAME_PLACE);
            descriptionPlace = getIntent().getStringExtra(DESCRIPTION_PLACE);
            locationPlace    = getIntent().getStringExtra(LOCATION_PLACE);
            imagePlace       = getIntent().getIntExtra(IMAGE_PLACE,0);

            Log.d("LOG","RETURN name="+namePlace+",description="+descriptionPlace+",location="+locationPlace);

            TextView namePlaceTextView = findViewById(R.id.name_place);
            namePlaceTextView.setText(namePlace);

            TextView descriptionPlaceTextView = findViewById(R.id.description_place);
            descriptionPlaceTextView.setText(descriptionPlace);

            TextView locationPlaceTextView = findViewById(R.id.location_place);
            locationPlaceTextView.setText(locationPlace);

            ImageView imagePlaceImageView = findViewById(R.id.img_place);
            imagePlaceImageView.setImageResource(imagePlace);
        }
    }

    public void setupToolBar()
    {
        ActionBar ab = getSupportActionBar();
        ab.setTitle("Place");
        ab.setDisplayHomeAsUpEnabled(true);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        if(itemId == android.R.id.home) {
            onBackPressed();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
