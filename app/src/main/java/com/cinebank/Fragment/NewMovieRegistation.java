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

import com.cinebank.R;

/**
 * Created by Android Dev on 7/29/2017.
 */

public class NewMovieRegistation extends Fragment implements AdapterView.OnItemSelectedListener{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.new_movie_registation,container,false);



        Spinner spinner = (Spinner)view.findViewById(R.id.planets_spinner);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity(),
                R.array.planets_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);



        Spinner type = (Spinner)view.findViewById(R.id.type_spinner);
        ArrayAdapter<CharSequence> typeadapter = ArrayAdapter.createFromResource(getActivity(),
                R.array.type_array, android.R.layout.simple_spinner_item);
        typeadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        type.setAdapter(typeadapter);


        Spinner userview = (Spinner)view.findViewById(R.id.userview_spinner);
        ArrayAdapter<CharSequence> userviewadapter = ArrayAdapter.createFromResource(getActivity(),
                R.array.userview_array, android.R.layout.simple_spinner_item);
        userviewadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        userview.setAdapter(userviewadapter);

        Spinner comment = (Spinner)view.findViewById(R.id.comment_spinner);
        ArrayAdapter<CharSequence> commentadapter = ArrayAdapter.createFromResource(getActivity(),
                R.array.comment_array, android.R.layout.simple_spinner_item);
        commentadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        comment.setAdapter(commentadapter);



        return view;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
