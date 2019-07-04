package com.example.android.quakereport;

public class Earthquake {

    // Magnitude of the earthquake
    private String mEarthquakeMagnitude;

    // Location of the earthquake
    private String mEarthquakeLocation;

    // Time of the earthquake
    private String mEarthquakeTime;

    /* Create a new Earthquake object
     * @param vMagnitude is the magnitude of the earthquake (e.g. 7.2)
     * @param vLocation is the location of the earthquake (e.g. patna)
     * @param vDate is the date of occurrence of the earthquake (e.g. 04/07/2019)
     **/
    public Earthquake(String vMagnitude, String vLocation, String vTime){

        mEarthquakeMagnitude = vMagnitude;
        mEarthquakeLocation = vLocation;
        mEarthquakeTime = vTime;
    }

    /*
     * get the magnitude of the earthquake
     */

    public String getEarthquakeMagnitude(){
        return mEarthquakeMagnitude;
    }

    /*
     * get the location of the earthquake
     */

    public String getEarthquakeLocation(){
        return mEarthquakeLocation;
    }

    /*
     * get the date of occurrence of the earthquake
     */

    public String getEarthquakeTime(){
        return mEarthquakeTime;
    }
}