package com.example.t420.simplystowmockups;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by T420 on 7/19/2017.
 */

public class CreateFragment extends android.support.v4.app.Fragment {
    public CreateFragment(){
    }

    private Button mButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_create, container, false);
        mButton = (Button) rootView.findViewById(R.id.create);
        mButton.setOnClickListener(new View.OnClickListener() {

            @Override
                    public void onClick(View v){
                        Intent i = new Intent(getActivity(), listInfo.class);
                        startActivity(i);

            }
        });
        return rootView;
    }

}
