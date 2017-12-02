package com.cinebank.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.cinebank.R;

/**
 * Created by Android Dev on 8/8/2017.
 */

public class Filter extends Fragment implements AdapterView.OnItemSelectedListener{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.filter,container,false);

        Spinner filter = (Spinner)view.findViewById(R.id.filter);
        ArrayAdapter<CharSequence> typeadapter = ArrayAdapter.createFromResource(getActivity(),
                R.array.filter, android.R.layout.simple_spinner_item);
        typeadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        filter.setAdapter(typeadapter);
        String text=filter.getSelectedItem().toString();
        Toast.makeText(getActivity(), text, Toast.LENGTH_SHORT).show();
        return view;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

       // Toast.makeText(getActivity(),"Hello" , Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
