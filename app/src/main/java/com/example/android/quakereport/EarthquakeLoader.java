package com.example.android.quakereport;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

public class EarthquakeLoader extends AsyncTaskLoader<List<Earthquake>> {

    /**
     * Query URL
     */
    private String mUrl;

    EarthquakeLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<Earthquake> loadInBackground() {

        // Don't perform the request if there are no URLs, or the first URL is null.
        if (mUrl == null) {

            return null;
        }
        return QueryUtils.fetchEarthquakeData(mUrl);
    }
}
