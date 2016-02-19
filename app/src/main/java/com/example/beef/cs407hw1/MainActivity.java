package com.example.beef.cs407hw1;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import layout.frag1;
import layout.frag2;

public class MainActivity extends AppCompatActivity {

    public void quiz(View v){
        //quiz
        Fragment frag;

        if(v==findViewById(R.id.stButton)){
            frag = new frag1();
            FragmentManager fragman = getFragmentManager();
            FragmentTransaction fragtrans = fragman.beginTransaction();
            fragtrans.replace(R.id.fragPlace, frag);
        }
        if(v==findViewById(R.id.sub1)){
            frag = new frag2();
            FragmentManager fragman = getFragmentManager();
            FragmentTransaction fragtrans = fragman.beginTransaction();
            fragtrans.replace(R.id.fragPlace, frag);
        }

        if(v==findViewById(R.id.sub2)){


        }
    }

    Button stbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stbtn = (Button)findViewById(R.id.stButton);
        stbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               quiz();
                //what happens when button is clicked
                //in our case, the game starts. (go to fragment)
            }
        });


    }
}
