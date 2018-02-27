package com.example.android.step_trackertest;
//Developed by Bhavya Pandey, Shashank Sahoo, Abhishek kumar
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

//


public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startService(new Intent(this, MyIntentService.class));
    }
    public void next(View view)
    {
        Intent intent= new Intent(MainActivity.this,activity1.class);
        startActivity(intent);
    }

}