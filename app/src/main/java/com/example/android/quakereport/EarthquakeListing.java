package com.example.android.quakereport;

/**
 * Created by Shubham on 1/20/2018.
 */

public class EarthquakeListing {

    private String mEarthquakeMag;
    private String mLocationName;
    private String mEarthQuakeDate;

    public EarthquakeListing(String eQuakeMag,String locationName,String eQuakeDate){

        mEarthquakeMag = eQuakeMag;
        mLocationName = locationName;
        mEarthQuakeDate = eQuakeDate;
    }

    /**
     * Get the magnitude of the Earthquake
     * */
    public String getmEarthquakeMag(){
        return mEarthquakeMag;
    }
    /**
     * Get the location Name where the Earthquake occured
     * */
    public String getmLocationName(){
        return mLocationName;
    }
    /**
     * Get the Date of Earthquake
     */
    public String getmEarthQuakeDate(){
        return mEarthQuakeDate;
    }


}
