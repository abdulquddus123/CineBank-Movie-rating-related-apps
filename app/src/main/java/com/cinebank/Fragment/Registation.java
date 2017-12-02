package com.cinebank.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.cinebank.R;

/**
 * Created by Android Dev on 6/22/2017.
  */

public class Registation extends Fragment {
    Button submit;
    Spinner spBusinessType;
    String businessType[] = { "Action", "Horror", "Comedy", "Romantic"};
    ArrayAdapter<String> adapterBusinessType;

    // local members
    String sbusinesstype,scountry;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.registation,container,false);
        submit=(Button)view.findViewById(R.id.registation);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent myIntent = new Intent(getActivity(), DashboardActivity.class);
//                startActivity(myIntent);
//                Intent myIntent=new Intent(getActivity(),MostPopularMovie.class);
//                startActivity(myIntent);
//                NewMovieRegistation ne = new NewMovieRegistation();
//                FragmentTransaction ft = getFragmentManager().beginTransaction();
//                ft.replace(R.id.main_fragment, ne);
//
//                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
//                ft.addToBackStack(null);
//                ft.commit();
            }
        });
        spBusinessType = (Spinner) view.findViewById(R.id.spBussinessType);
        adapterBusinessType = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_spinner_item, businessType);
        adapterBusinessType.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spBusinessType.setAdapter(adapterBusinessType);
//        spBusinessType.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getActivity(), "Hello", Toast.LENGTH_SHORT).show();
//            }
//        });

        return view;

    }

//       spBusinessType.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//
//        @Override
//        public void onItemSelected(AdapterView<?> adapter, View v,
//        int position, long id) {
//            // On selecting a spinner item
//            sbusinesstype = adapter.getItemAtPosition(position).toString();
//
//            // Showing selected spinner item
//            Toast.makeText(getApplicationContext(),
//                    "Bussiness Type : " + sbusinesstype, Toast.LENGTH_SHORT).show();
//        }
//
//        @Override
//        public void onNothingSelected(AdapterView<?> arg0) {
//            // TODO Auto-generated method stub
//
//        }
//    });


}
