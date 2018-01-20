package com.example.android.quakereport;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Shubham on 1/20/2018.
 */

public class EarthquakeListingAdapter extends ArrayAdapter<EarthquakeListing> {

    public EarthquakeListingAdapter(Activity context, ArrayList<EarthquakeListing> earthquakeListings) {
        super(context, 0, earthquakeListings);
    }


    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_view, parent, false);
        }

        EarthquakeListing earthquakeListing = getItem(position);

        TextView earthquakeMag = (TextView) listItemView.findViewById(R.id.magnitude);
        earthquakeMag.setText(earthquakeListing.getmEarthquakeMag());

        TextView earthquakeLOC = (TextView) listItemView.findViewById(R.id.earthLocation);
        earthquakeLOC.setText(earthquakeListing.getmLocationName());

        TextView earthDate = (TextView) listItemView.findViewById(R.id.quakeDate);
        earthDate.setText(earthquakeListing.getmEarthQuakeDate());

        return listItemView;
    }
}
