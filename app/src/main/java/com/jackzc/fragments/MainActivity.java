package com.jackzc.fragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity
        implements TopSectionFragment.TopSectionListener {

    // This gets called by the Top Fragment when the user clicks the button
    @Override
    public void createMeme(String top, String bottom) {
        BottomSectionFragment bottomFragment = (BottomSectionFragment) getSupportFragmentManager().findFragmentById(R.id.fragment2);
        bottomFragment.setMemeText(top, bottom);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
