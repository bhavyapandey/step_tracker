package com.example.android.step_trackertest;
//Developed by Bhavya Pandey, Shashank Sahoo, Abhishek kumar//
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;

public class activity1 extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1);
    }

    public void pedo(View view)
    {
        Intent intent= new Intent(activity1.this,activity2.class);
        startActivity(intent);
    }
    public void fit(View view)
    {
        Intent intent= new Intent(activity1.this,naviActivity.class);
        startActivity(intent);
    }
    public void weekly(View view)
    {
        Intent intent= new Intent(activity1.this,activity3.class);
        startActivity(intent);
    }
    public void music(View view)
    {
        Intent i = new Intent(Intent.ACTION_MAIN);
        PackageManager managerclock = getPackageManager();
        i = managerclock.getLaunchIntentForPackage("com.google.android.music");
        i.addCategory(Intent.CATEGORY_LAUNCHER);
        startActivity(i);
    }
}