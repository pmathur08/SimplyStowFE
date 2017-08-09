package com.example.t420.simplystowmockups;

/**
 * Created by T420 on 8/4/2017.
 */

/* This creates the framework for the Listing */

public class Listing {

    public int verificationStatus; //If the listing is verified or not
    public int zipcode;
    public int locationbool; //0 for indoor , 1 for outdoor listing
    public String title; //Listing title
    public int locationtype; //0 for bedroom, 1 for bedroom, 2 for garage, 3 for driveway, 4 for Loft, 5 for Other
    public float dim1; //Dimension 1
    public float dim2; //Dimension 2
    public int access; //0 for 24/7, 1 for On-request, 2 for Weekends, 3 for none, 4 for other
    public int price;
    public int base; //0 for monthly, 1 for weekly, 2 for daily
    public boolean pet,smoke,lock,cctv,climate;


    //Mutators
    public void setVerificationStatus(int vs){
        verificationStatus = vs;
    }

    public void setZipcode(int z){
        zipcode = z;
    }

    public void setLocationbool(int lb){
        locationbool = lb;
    }

    public void setTitle(String s){
        title = s;
    }

    public void setLocationtype(int lt){
        locationtype = lt;
    }

    public void setDims(float d1, float d2){
        dim1 = d1;
        dim2 = d2;
    }

    public void setAccess(int a){
        access = a;
    }

    public void setPrice(int p){
        price = p;
    }

    public void setBase(int b){
        base = b;
    }

    public void setPet(boolean p){
         pet = p;
    }

    public void setSmoke(boolean s){
        smoke = s;
    }

    public void setLock(boolean l){
        lock = l;
    }

    public void setCctv(boolean c){
        cctv = c;
    }

    public void setClimate(boolean c){
        climate = c;
    }

    //End of Mutators

}
