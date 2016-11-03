package com.jackzc.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class TopSectionFragment extends Fragment {

    private static EditText t1;
    private static EditText t2;

    TopSectionListener activityCommander;

    public interface TopSectionListener {
        void createMeme(String top, String bottom);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        try {
            activityCommander = (TopSectionListener) context;
        } catch (ClassCastException exception) {
            throw new ClassCastException(exception.getMessage());
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.top_section_fragment, container, false);

        t1 = (EditText) v.findViewById(R.id.txt_top);
        t2 = (EditText) v.findViewById(R.id.txt_bottom);
        final Button button = (Button) v.findViewById(R.id.btnFragment);

        button.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        buttonClicked(v);
                    }
                }
        );

        return v;
    }

    // Calls this method when the button is clicked
    private void buttonClicked(View v) {
        String top = t1.getText().toString();
        String bottom = t2.getText().toString();

        activityCommander.createMeme(top, bottom);
    }
}
