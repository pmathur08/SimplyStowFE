package com.example.t420.simplystowmockups;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class ListPrice extends AppCompatActivity {

    Spinner baseprice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_price);

        baseprice = (Spinner) findViewById(R.id.bptype);
        String[] base = new String[]{"Monthly","Weekly", "Daily"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, base);
        baseprice.setAdapter(adapter);
    }

    public void previewScreen(View v){
        Intent i = new Intent(this, previewScreen.class);
        startActivity(i);
    }

    public void goBack(View v){
        Intent i = new Intent(this, ListingPhoto.class);
        startActivity(i);
    }
}
