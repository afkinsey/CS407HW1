package com.example.beef.cs407hw1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public void startTheQuiz(View button){
        //start the quiz
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
                //what happens when button is clicked
                //in our case, the game starts. (go to fragment)
            }
        });


    }
}
