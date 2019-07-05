package com.example.android.quakereport;

public class Earthquake {

    // Magnitude of the earthquake
    private double mEarthquakeMagnitude;

    // Location of the earthquake
    private String mEarthquakeLocation;

    // Time of the earthquake
    private Long mEarthquakeTime;

    // url of the website
    private String mEarthquakeUrl;

    /* Create a new Earthquake object
     * @param vMagnitude is the magnitude of the earthquake (e.g. 7.2)
     * @param vLocation is the location of the earthquake (e.g. patna)
     * @param vTime is the time of occurrence of the earthquake (e.g. 04/07/2019 at 9:00 am)
     **/
    public Earthquake(double vMagnitude, String vLocation, Long vTime, String vUrl){

        mEarthquakeMagnitude = vMagnitude;
        mEarthquakeLocation = vLocation;
        mEarthquakeTime = vTime;
        mEarthquakeUrl = vUrl;
    }

    /*
     * get the magnitude of the earthquake
     */

    public double getEarthquakeMagnitude(){
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

    public Long getEarthquakeTime(){
        return mEarthquakeTime;
    }

    /*
     * get the date of occurrence of the earthquake
     */

    public String getEarthquakeUrl(){
        return mEarthquakeUrl;
    }
}