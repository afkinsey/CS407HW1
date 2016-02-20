package com.example.beef.cs407hw1;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

import java.util.zip.Inflater;

public class frag1 extends Fragment {


    public static frag1 newInstance() {
        frag1 f = new frag1();
        Bundle args = new Bundle();
        f.setArguments(args);
        return f;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //this should maybe go in the frag1.java
        View v = inflater.inflate(R.layout.fragment_frag1, container, false);

        final EditText whatColour = (EditText) v.findViewById(R.id.blueAnswer);
        TextView textQ = (TextView) v.findViewById(R.id.blueSquare);
        Button nextQ = (Button) v.findViewById(R.id.submitButton);

        nextQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ans = whatColour.getText().toString();
                boolean b;

                b = (ans.equalsIgnoreCase("blue"));

                int score = 0;
                if (b)
                {
                    score++;
                }


                ((MainActivity)getActivity()).quiz(1, score);
                //

            }
        });


        return v;
    }

}
