package com.example.beef.cs407hw1;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class frag2 extends Fragment {

    private static final String ARG_SCORE = "score";
    CheckBox myBox;
    private int score;

    public frag2() {
        // Required empty public constructor
    }

    public static frag2 newInstance(int score) {
        frag2 fragment = new frag2();
        Bundle args = new Bundle();
        args.putInt(ARG_SCORE, score);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            score = getArguments().getInt(ARG_SCORE);
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_frag2, container, false);

        final CheckBox cb = (CheckBox) v.findViewById(R.id.CB1);
        cb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });


        Button finish = (Button) v.findViewById(R.id.sub2);

        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                myBox = (CheckBox)v.findViewById(R.id.CB1);

                //boolean b = ((CheckBox)v.findViewById(R.id.CB1)).isChecked();

                if ((cb.isChecked()))
                {
                    score++;
                }

                ((MainActivity)getActivity()).quiz(2, score);
                //

            }
        });
        return v;
    }
}
