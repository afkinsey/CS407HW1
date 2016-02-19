package layout;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.beef.cs407hw1.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link frag1.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link frag1#newInstance} factory method to
 * create an instance of this fragment.
 *
 */
public class frag1 extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //this should maybe go in the frag1.java
        final EditText whatColour = (EditText)findViewById(R.id.blueAnswer);
        TextView textQ = (TextView)findViewById(R.id.blueSquare);
        Button nextQ = (Button)findViewById(R.id.submitButton);

        nextQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ans = whatColour.getText().toString();
                //

            }
        });


        return inflater.inflate(R.layout.fragment_frag1, container, false);
    }

}
