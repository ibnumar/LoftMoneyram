package com.example.loftmoneyram;

import android.os.Bundle;
import android.util.Log;

import com.google.android.material.tabs.TabLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private ViewPager pager;
    private TabLayout tabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate");

        MainPagesAdapter adapter = new MainPagesAdapter(getSupportFragmentManager(), this);

        pager = findViewById(R.id.pager);
        tabs = findViewById(R.id.tabs);

        tabs.setupWithViewPager(pager);

        pager.setAdapter(adapter);

    }

}

