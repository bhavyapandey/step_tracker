package com.example.android.step_trackertest;
//Developed by Bhavya Pandey, Shashank Sahoo, Abhishek kumar
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class activity4 extends MainActivity{
    float num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity4);
        final int READ_BLOCK_SIZE = 100;
        TextView calories = (TextView) findViewById(R.id.calresult);
        TextView distance = (TextView) findViewById(R.id.distanceresult);
        TextView steps = (TextView) findViewById(R.id.stepsresult);
        TextView weightloss = (TextView) findViewById(R.id.weightloss);
        String s = "";
        String c = "";
        String d = "";
        String w = "";
        int charRead;
        try {
            FileInputStream fileIn = openFileInput("IstepsNow.txt");
            InputStreamReader InputRead = new InputStreamReader(fileIn);
            char[] inputBuffer = new char[READ_BLOCK_SIZE];
            while ((charRead = InputRead.read(inputBuffer)) > 0) {
                // char to string conversion
             String readstring = String.copyValueOf(inputBuffer, 0, charRead);
             s += readstring;
            }
            InputRead.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        steps.setText(s);

        int charRead2;
        try {
            FileInputStream fileIn2 = openFileInput("IcaloriesNow.txt");
            InputStreamReader InputRead2 = new InputStreamReader(fileIn2);
            char[] inputBuffer2 = new char[READ_BLOCK_SIZE];
            while ((charRead2 = InputRead2.read(inputBuffer2)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer2, 0, charRead2);
                c += readstring;
            }
            InputRead2.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        calories.setText(c);
       // Integer num1= Integer.parseInt(c);

        int charRead3;
        try {
            FileInputStream fileIn3 = openFileInput("IdistanceNow.txt");
            InputStreamReader InputRead3 = new InputStreamReader(fileIn3);
            char[] inputBuffer3 = new char[READ_BLOCK_SIZE];
            while ((charRead3 = InputRead3.read(inputBuffer3)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer3, 0, charRead3);
                d += readstring;
            }
            InputRead3.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        distance.setText(d);
        int charRead4;
        try {
            FileInputStream fileIn4 = openFileInput("Iweightloss.txt");
            InputStreamReader InputRead4 = new InputStreamReader(fileIn4);
            char[] inputBuffer4 = new char[READ_BLOCK_SIZE];
            while ((charRead4 = InputRead4.read(inputBuffer4)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer4, 0, charRead4);
                w += readstring;
            }
            InputRead4.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        weightloss.setText(w +"gm");
    }

    public void back(View view)
    {
        Intent intent3 = new Intent(this, activity1.class);
        startActivity(intent3);
    }
}
