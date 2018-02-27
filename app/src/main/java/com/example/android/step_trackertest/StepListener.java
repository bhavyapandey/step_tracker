package com.example.android.step_trackertest;
//Developed by Bhavya Pandey, Shashank Sahoo, Abhishek kumar
public interface StepListener {

    /**
     * Called when a step has been detected.  Given the time in nanoseconds at
     * which the step was detected.
     */
    void step(long timeNs);

}