/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.quakereport;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import Utils.QueryUtils;

public class EarthquakeActivity extends AppCompatActivity {

    public static final String LOG_TAG = EarthquakeActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);

        // Create a fake list of earthquake locations.
        ArrayList<EarthquakeListing> earthquakeListings = QueryUtils.extractEarthquakes();
       /* earthquakeListings.add(new EarthquakeListing("4.3","San Francisco","May 3,2016"));
        earthquakeListings.add(new EarthquakeListing("5.0","London","Jan 3,2016"));
        earthquakeListings.add(new EarthquakeListing("8.2","Tokyo","Jul 17,2015"));
        earthquakeListings.add(new EarthquakeListing("1.7","Mexico City","Dec 9,2014"));
        earthquakeListings.add(new EarthquakeListing("3.9","Moscow","Feb 27,2014"));
        earthquakeListings.add(new EarthquakeListing("6.5","Rio de Janeiro","Mar 18,2011"));
        earthquakeListings.add(new EarthquakeListing("2.0","Paris","Feb 1,2009"));
*/

        // Find a reference to the {@link ListView} in the layout
        ListView earthquakeListView = (ListView) findViewById(R.id.list);

        // Create a new {@link ArrayAdapter} of earthquakes
        EarthquakeListingAdapter earthquakeListingAdapter = new EarthquakeListingAdapter(this,earthquakeListings);

        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        earthquakeListView.setAdapter(earthquakeListingAdapter);
    }
}
