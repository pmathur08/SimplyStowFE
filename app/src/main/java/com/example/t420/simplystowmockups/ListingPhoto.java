package com.example.t420.simplystowmockups;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class ListingPhoto extends AppCompatActivity {

    static final int REQUEST_IMAGE_CAPTURE = 1;
    int photocount = 0;
    Button n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listing_photo);
    }

    public void takePhoto(View v) {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            photocount += 1;
            if(photocount>0){
                n = (Button) findViewById(R.id.next);
                n.setVisibility(View.VISIBLE);
            }
            Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap) extras.get("data");
            switch (photocount) {
                case 1:
                    ImageView mImageView = (ImageView) findViewById(R.id.stashpic1);
                    mImageView.setImageBitmap(imageBitmap);
                    break;

                case 2:
                    ImageView m2 = (ImageView) findViewById(R.id.stashpic2);
                    m2.setImageBitmap(imageBitmap);
                    break;

                case 3:
                    ImageView m3 = (ImageView) findViewById(R.id.stashpic3);
                    m3.setImageBitmap(imageBitmap);
                    break;

                case 4:
                    ImageView m4 = (ImageView) findViewById(R.id.stashpic4);
                    m4.setImageBitmap(imageBitmap);
                    break;

                default:
                    Toast.makeText(this, "Five photos should be enough", Toast.LENGTH_SHORT).show();

            }
        }
    }

    public void setPrice(View v){
        Intent i = new Intent(this, ListPrice.class);
        startActivity(i);
    }

    public void goBack(View v){
        Intent i = new Intent(this, listInfo.class);
        startActivity(i);
    }
}
