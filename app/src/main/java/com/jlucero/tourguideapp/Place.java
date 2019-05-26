package com.jlucero.tourguideapp;

public class Place {

    // Name of an attraction place
    private String mPlaceName;
    // Photo of an attraction place
    private int mImageResourceID;

    // Description of an attraction place
    private String mPlaceDescrition;

    //Coordinates of an attraction place
    private String mPlaceLoationCoordinates;

    public Place(String placeName, int imageResourceID, String placeDescription, String placeLocationCoordinates) {
        mPlaceName = placeName;
        mImageResourceID = imageResourceID;
        mPlaceDescrition = placeDescription;
        mPlaceLoationCoordinates = placeLocationCoordinates;
    }


    // Get the name of an attraction place
    public String getPlaceName() {
        return mPlaceName;
    }

    // Get the photo's ID of an attraction place
    public  int getImageResourceID() {
        return mImageResourceID;
    }

    //Get the description of the attraction place
    public String getPlaceDescrition() {
        return mPlaceDescrition;
    }

    // Get the location coordinates of an attraction place
    public  String getPlaceLocationCoordinates() {
        return mPlaceLoationCoordinates;
    }
}
