package com.jackzc.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BottomSectionFragment extends Fragment {

    private static TextView label_top;
    private static TextView label_bottom;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.bottom_picture_fragment, container, false);

        label_top = (TextView) v.findViewById(R.id.lb_top);
        label_bottom = (TextView) v.findViewById(R.id.lb_bottom);

        return v;

    }

    public static void setMemeText(String top, String bottom) {
        label_top.setText(top);
        label_bottom.setText(bottom);
    }
}
