package com.example.beef.cs407hw1;

import android.app.AlertDialog;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;


import com.example.beef.cs407hw1.frag1;


public class MainActivity extends AppCompatActivity {

    public void quiz(int option, int score){
        //quiz
        Fragment frag;
        int q1Score;

        if(option==0){
            FragmentManager fragman = getFragmentManager();
            FragmentTransaction fragtrans = fragman.beginTransaction();
            fragtrans.replace(R.id.fragPlace, frag1.newInstance()).commit();
        }
        if(option==1){
            FragmentManager fragman = getFragmentManager();
            FragmentTransaction fragtrans = fragman.beginTransaction();
            fragtrans.replace(R.id.fragPlace, frag2.newInstance(score)).commit();
        }
/*
        if(option==2){
            FragmentManager fragman = getFragmentManager();
            FragmentTransaction fragtrans = fragman.beginTransaction();
            fragtrans.replace(R.id.fragPlace, frag3.newInstance(score)).commit();

        }
        */


       // /*
        if(option==2){
            new AlertDialog.Builder(this)
                    .setTitle("Score: " + score + "/2")
                    .setMessage("Play again?")
                    .setPositiveButton("again", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            quiz(0, 0);
                        }
                    })
                    .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);
                        }
                    })
                    .setIcon(android.R.drawable.ic_dialog_alert)
                    .show();
        }
        //*/
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
                v.setVisibility(View.INVISIBLE);
                quiz(0, 0);
                //what happens when button is clicked
                //in our case, the game starts. (go to fragment)
            }
        });


    }
}
