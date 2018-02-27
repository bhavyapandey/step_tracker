package com.example.android.step_trackertest;
//Developed by Bhavya Pandey, Shashank Sahoo, Abhishek kumar
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;


public class activity2 extends activity1 implements SensorEventListener, StepListener{

    private SimpleStepDetector simpleStepDetector;
    private SensorManager sensorManager;
    private Sensor accel;
    private int numSteps;
    private double dist = 0;
    double wloss;
    String weight="";
    String calories="";
    String distance="";
    String steps="";
    double cal = 0;
    private int addsteps;
    private double adddis;
    private double addcal;
    private static  int f;
    private static int s;
    private static double c;
    private static double d;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        startService(new Intent(this, MyIntentService.class));

        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        accel = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        simpleStepDetector = new SimpleStepDetector();
        simpleStepDetector.registerListener(this);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
    }

    @Override
    public void onResume() {
        super.onResume();
        numSteps = 0;
        display(numSteps);
        displaycal(numSteps);
        displaydist(numSteps);
        //textView.setText( numSteps);
        sensorManager.registerListener(this, accel, SensorManager.SENSOR_DELAY_UI);
    }

    @Override
    public void onPause() {
        super.onPause();
        sensorManager.unregisterListener(this);
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        if (event.sensor.getType() == Sensor.TYPE_ACCELEROMETER) {
            simpleStepDetector.updateAccel(
                    event.timestamp, event.values[0], event.values[1], event.values[2]);
        }
    }

    @Override
    public void step(long timeNs) {
        numSteps++;
        display(numSteps);
        displaycal(numSteps);
        displaydist(numSteps);
    }


    private void display(int number) {
        TextView stepstaken = (TextView) findViewById(
                R.id.stepsTaken);
        stepstaken.setText("" + number);

    }

    private void displaycal(int number) {
        TextView calres = (TextView) findViewById(
                R.id.calres);

        cal = number * 0.05;
        calres.setText(String.format("%.2f", cal));
        wloss= ((cal*0.12)*7);
        weight = String.format("%.2f", wloss);

    }

    private void displaydist(int number) {
        TextView disres = (TextView) findViewById(
                R.id.disres);

        if (number >= 18 && number % 18 == 0)
            dist = dist + 0.02;
        disres.setText(String.format("%.2f", dist) + "km");
    }

    public  void save(View v)
    {
        if(f==0)
        {

                steps = Integer.toString(numSteps);
                calories = String.format("%.2f", cal);
                distance = String.format("%.2f", dist);
                try {
                    FileOutputStream fileout = openFileOutput("stepsNow.txt", MODE_PRIVATE);
                    OutputStreamWriter outputWriter = new OutputStreamWriter(fileout);
                    outputWriter.write(steps );
                    outputWriter.close();
                    FileOutputStream fileout2 = openFileOutput("caloriesNow.txt", MODE_PRIVATE);
                    OutputStreamWriter outputWriter2 = new OutputStreamWriter(fileout2);
                    outputWriter2.write(calories);
                    outputWriter2.close();
                    FileOutputStream fileout3 = openFileOutput("distanceNow.txt", MODE_PRIVATE);
                    OutputStreamWriter outputWriter3 = new OutputStreamWriter(fileout3);
                    outputWriter3.write(distance + "km");
                    outputWriter3.close();
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
                f++;
                s=numSteps;
                c=cal;
                d=dist;
            }
            else
            {
                f=0;
                addsteps= numSteps + s ;
                steps = Integer.toString(addsteps);
                addcal= cal + c;
                calories = String.format("%.2f", addcal);
                adddis = dist + d;
                distance = Double.toString(adddis);
                try{
                    FileOutputStream fileout = openFileOutput("stepsNow.txt", MODE_PRIVATE);
                    OutputStreamWriter outputWriter = new OutputStreamWriter(fileout);
                    outputWriter.write(steps);
                    outputWriter.close();
                    FileOutputStream fileout2 = openFileOutput("caloriesNow.txt", MODE_PRIVATE);
                    OutputStreamWriter outputWriter2 = new OutputStreamWriter(fileout2);
                    outputWriter2.write(calories);
                    outputWriter2.close();
                    FileOutputStream fileout3 = openFileOutput("distanceNow.txt", MODE_PRIVATE);
                    OutputStreamWriter outputWriter3 = new OutputStreamWriter(fileout3);
                    outputWriter3.write(distance + "km");
                    outputWriter3.close();
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
                s=0;
                d=0;
                c=0;
            }

//------------------------For activity 4 -------------------

        //-------------To display results on next page----
        //-------Writing into new files-----
        TextView disnex;
        TextView stepsmsg;
        TextView calresu;
        stepsmsg = (TextView) findViewById(R.id.stepsTaken);
        calresu = (TextView) findViewById(R.id.calres);
        disnex = (TextView) findViewById(R.id.disres);
        try {
            FileOutputStream fileout = openFileOutput("IstepsNow.txt", MODE_PRIVATE);
            OutputStreamWriter outputWriter = new OutputStreamWriter(fileout);
            outputWriter.write(stepsmsg.getText().toString());
            outputWriter.close();
            FileOutputStream fileout2 = openFileOutput("IcaloriesNow.txt", MODE_PRIVATE);
            OutputStreamWriter outputWriter2 = new OutputStreamWriter(fileout2);
            outputWriter2.write(calresu.getText().toString());
            outputWriter2.close();
            FileOutputStream fileout3 = openFileOutput("IdistanceNow.txt", MODE_PRIVATE);
            OutputStreamWriter outputWriter3 = new OutputStreamWriter(fileout3);
            outputWriter3.write(disnex.getText().toString());
            outputWriter3.close();
            FileOutputStream fileout4 = openFileOutput("Iweightloss.txt", MODE_PRIVATE);
            OutputStreamWriter outputWriter4 = new OutputStreamWriter(fileout4);
            outputWriter4.write(weight);
            outputWriter4.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Intent intent = new Intent(this, activity4.class);
        startActivity(intent);
    }
//==================================================================//

    public void reset(View view) //Reset Button
    {
        Intent intent3 = new Intent(this, activity2.class);
        startActivity(intent3);
    }
    public void back(View view) //Back to main page button
    {
        Intent intent3 = new Intent(this, activity1.class);
        startActivity(intent3);
    }
}
