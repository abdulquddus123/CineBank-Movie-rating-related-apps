package com.cinebank.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.cinebank.R;

/**
 * Created by Android Dev on 8/6/2017.
 */

public class ViewRecord extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.view_record,container,false);

        Spinner viewRecord = (Spinner)view.findViewById(R.id.view_record);
        ArrayAdapter<CharSequence> viewadapter = ArrayAdapter.createFromResource(getActivity(),
                R.array.view_record, android.R.layout.simple_spinner_item);
        viewadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        viewRecord.setAdapter(viewadapter);

        return view;
    }
}
