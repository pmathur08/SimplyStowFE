package com.example.t420.simplystowmockups;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class listInfo extends AppCompatActivity {

    Spinner proptype;
    Spinner classify;
    Spinner access;
    Listing l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_info);

        proptype = (Spinner) findViewById(R.id.proptype);
        String[] property = new String[]{" ","Indoor", "Outdoor"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, property);
        proptype.setAdapter(adapter);

        classify = (Spinner) findViewById(R.id.propclass);
        String[] propclass = new String[]{" ","Bedroom", "Basement", "Garage", "Driveway", "Loft", "Other"};
        ArrayAdapter<String> madapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, propclass);
        classify.setAdapter(madapter);

        access = (Spinner) findViewById(R.id.acc);
        String[] accstring = new String[]{" ","24/7", "On-Request", "Weekends Only", "None", "Other"};
        ArrayAdapter<String> nadapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, accstring);
        access.setAdapter(nadapter);

        /*
        l = new Listing(); //Created new listing

        //Get title
        EditText et = (EditText) findViewById(R.id.list_title);
        l.setTitle(et.getText().toString());

        //Get zip
        et = (EditText) findViewById(R.id.list_zip);
        l.setZipcode(Integer.parseInt(et.getText().toString()));

        Get Location Bool
        l.setLocationbool();
        proptype
        String text = mySpinner.getSelectedItem().toString();*/

    }

    public void takePhoto(View v){
        Intent i = new Intent(this, ListingPhoto.class);
        startActivity(i);
    }

    public void goBack(View v){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
