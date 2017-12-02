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
 * Created by Android Dev on 8/8/2017.
 */

public class UpdateDatabase extends Fragment implements AdapterView.OnItemSelectedListener{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.update_database,container,false);

        Spinner category = (Spinner)view.findViewById(R.id.database_category_spinner);
        ArrayAdapter<CharSequence> categoryadapter = ArrayAdapter.createFromResource(getActivity(),
                R.array.planets_array, android.R.layout.simple_spinner_item);
        categoryadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        category.setAdapter(categoryadapter);

        Spinner movie = (Spinner)view.findViewById(R.id.database_movie_spinner);
        ArrayAdapter<CharSequence> movieadapter = ArrayAdapter.createFromResource(getActivity(),
                R.array.type_array, android.R.layout.simple_spinner_item);
        movieadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        movie.setAdapter(movieadapter);

        Spinner userview = (Spinner)view.findViewById(R.id.database_userview_spinner);
        ArrayAdapter<CharSequence> userviewadapter = ArrayAdapter.createFromResource(getActivity(),
                R.array.userview_array, android.R.layout.simple_spinner_item);
        userviewadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        userview.setAdapter(userviewadapter);

        Spinner comment = (Spinner)view.findViewById(R.id.database_comment_spinner);
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
