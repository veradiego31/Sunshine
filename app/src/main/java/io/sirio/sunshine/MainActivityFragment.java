package io.sirio.sunshine;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    ArrayAdapter<String> mAdapter;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view  =  inflater.inflate(R.layout.fragment_main, container, false);

        String[] dataset = {
                "Today - Sunny - 88/63",
                "Tomorrow - Foggy - 70/40",
                "Weds - Cloudy - 72/63",
                "Thurs - Asteroids - 78/45",
                "Fri - Heavy Rains - 65/56",
                "Sat - HELP TRAPPED IN WEATHERSTATION -60/51",
                "Sun - Sunny - 80/68"
        };

        List<String> forescatlistview= new ArrayList<>(Arrays.asList(dataset));

        mAdapter = new ArrayAdapter<String>(getActivity(),
                        R.layout.list_item_forescast,
                        R.id.list_item_forescast_textview,
                        forescatlistview);

        ListView listView = (ListView) view.findViewById(R.id.listview_forecast);

        listView.setAdapter(mAdapter);
        return view;
    }
}
