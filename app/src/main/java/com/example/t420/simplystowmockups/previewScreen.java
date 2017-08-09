package com.example.t420.simplystowmockups;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class previewScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview_screen);
    }

    public void goListing(View v){
        Intent i = new Intent(this, MainActivity.class);
        Toast.makeText(this, "Submitted listing for verification!", Toast.LENGTH_LONG).show();
        startActivity(i);
    }
}
