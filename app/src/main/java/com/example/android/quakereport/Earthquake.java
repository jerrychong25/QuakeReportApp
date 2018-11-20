package com.example.android.quakereport;

public class Earthquake {

    // Magnitude of the earthquake
    private String mMagnitude;

    // Location of the earthquake
    private String mLocation;

    // Time of the earthquake
    private long mTimeInMilliseconds;

    // Construct a new Earthquake object
    public Earthquake(String magnitude, String location, long timeInMilliseconds) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
    }

    // Returns the magnitude of the earthquake
    public String getMagnitude() { return mMagnitude; }

    // Returns the location of the earthquake
    public String getLocation() { return mLocation; }

    // Returns the time of the earthquake
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
}
