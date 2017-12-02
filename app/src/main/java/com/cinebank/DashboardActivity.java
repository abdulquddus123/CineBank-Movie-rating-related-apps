package com.cinebank;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        String s = getIntent().getStringExtra("EXTRA_SESSION_ID");
    }
}
