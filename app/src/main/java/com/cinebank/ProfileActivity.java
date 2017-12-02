package com.cinebank;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.cinebank.Fragment.Filter;
import com.cinebank.Fragment.NewMovieRegistation;
import com.cinebank.Fragment.Profile;
import com.cinebank.Fragment.UpdateDatabase;
import com.cinebank.Fragment.ViewRecord;
public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


        Profile nmr=new Profile();
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.profile_layout, nmr);
        transaction.commit();
    }

    public void Registatin(View view) {
        NewMovieRegistation nmr=new NewMovieRegistation();
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.profile_layout, nmr);
        transaction.commit();
    }

    public void ViewRecord(View view) {
        ViewRecord viewRecord=new ViewRecord();
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.profile_layout, viewRecord);
        transaction.commit();
    }

    public void Filter(View view) {
        Filter filter=new Filter();
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.profile_layout, filter);
        transaction.commit();
    }
    public void UpdateDatabase(View view) {
        UpdateDatabase updateDatabase=new UpdateDatabase();
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.profile_layout, updateDatabase);
        transaction.commit();
    }

}
