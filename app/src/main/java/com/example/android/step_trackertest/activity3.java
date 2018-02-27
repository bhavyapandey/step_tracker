package com.example.android.step_trackertest;
//Developed by Bhavya Pandey, Shashank Sahoo, Abhishek kumar
import android.os.Bundle;
import android.widget.TextView;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Calendar;

//---------------------WEEKLY REVIEW------------------------------//

        public class activity3 extends MainActivity {
            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity3);
                int m;

                Calendar calendar = Calendar.getInstance();

                int day = calendar.get(Calendar.DAY_OF_WEEK);
                //-----------------MONDAY-------------------
                if (day == calendar.MONDAY)
                {
                    final int READ_BLOCK_SIZE = 100;
                    int charRead;
                    int charRead2;
                    int charRead3;
                    TextView monday = (TextView) findViewById(R.id.monstep);
                    TextView moncal = (TextView) findViewById(R.id.moncal);
                    TextView mondist = (TextView) findViewById(R.id.mondis);
                    String s3 = "";
                    String c3 = "";
                    String d3 = "";
                    try {
                        FileInputStream fileIn = openFileInput("stepsNow.txt");
                        InputStreamReader InputRead = new InputStreamReader(fileIn);
                        char[] inputBuffer = new char[READ_BLOCK_SIZE];
                        while ((charRead = InputRead.read(inputBuffer)) > 0) {
                            // char to string conversion
                            String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                            s3 += readstring;
                        }
                        InputRead.close();
                        FileInputStream fileIn2 = openFileInput("caloriesNow.txt");
                        InputStreamReader InputRead2 = new InputStreamReader(fileIn2);
                        char[] inputBuffer2 = new char[READ_BLOCK_SIZE];
                        while ((charRead2 = InputRead2.read(inputBuffer2)) > 0) {
                            // char to string conversion
                            String readstring = String.copyValueOf(inputBuffer2, 0, charRead2);
                            c3 += readstring;
                        }
                        InputRead2.close();
                        FileInputStream fileIn3 = openFileInput("distanceNow.txt");
                        InputStreamReader InputRead3 = new InputStreamReader(fileIn3);
                        char[] inputBuffer3 = new char[READ_BLOCK_SIZE];
                        while ((charRead3 = InputRead3.read(inputBuffer3)) > 0) {
                            // char to string conversion
                            String readstring = String.copyValueOf(inputBuffer3, 0, charRead3);
                            d3 += readstring;
                        }
                        InputRead3.close();
                        FileOutputStream fileout = openFileOutput("monsteps.txt", MODE_PRIVATE);
                        OutputStreamWriter outputWriter = new OutputStreamWriter(fileout);
                        outputWriter.write(s3);
                        outputWriter.close();
                        FileOutputStream fileout2 = openFileOutput("moncal.txt", MODE_PRIVATE);
                        OutputStreamWriter outputWriter2 = new OutputStreamWriter(fileout2);
                        outputWriter2.write(c3);
                        outputWriter2.close();
                         FileOutputStream fileout3 = openFileOutput("mondist.txt", MODE_PRIVATE);
                        OutputStreamWriter outputWriter3 = new OutputStreamWriter(fileout3);
                        outputWriter3.write(d3);
                        outputWriter3.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    monday.setText(s3);
                    moncal.setText(c3);
                    mondist.setText(d3);
                }
                else {
                    final int READ_BLOCK_SIZE3 = 100;
                    int charRead01;
                    int charRead02;
                    int charRead03;
                    TextView monday = (TextView) findViewById(R.id.monstep);
                    TextView moncal = (TextView) findViewById(R.id.moncal);
                    TextView mondist = (TextView) findViewById(R.id.mondis);
                    String s03 = "";
                    String c03 = "";
                    String d03 = "";
                    try {
                        FileInputStream fileInwed = openFileInput("monsteps.txt");
                        InputStreamReader InputReadwed = new InputStreamReader(fileInwed);
                        char[] inputBufferwed = new char[READ_BLOCK_SIZE3];
                        while ((charRead01 = InputReadwed.read(inputBufferwed)) > 0) {
                            // char to string conversion
                            String readstring = String.copyValueOf(inputBufferwed, 0, charRead01);
                            s03 += readstring;
                        }
                        InputReadwed.close();
                        FileInputStream fileInwed2 = openFileInput("moncal.txt");
                        InputStreamReader InputReadwed2 = new InputStreamReader(fileInwed2);
                        char[] inputBufferwed2 = new char[READ_BLOCK_SIZE3];
                        while ((charRead02 = InputReadwed2.read(inputBufferwed2)) > 0) {
                            // char to string conversion
                            String readstring = String.copyValueOf(inputBufferwed2, 0, charRead02);
                            c03 += readstring;
                        }
                        InputReadwed2.close();
                        FileInputStream fileInwed3 = openFileInput("mondist.txt");
                        InputStreamReader InputRead3 = new InputStreamReader(fileInwed3);
                        char[] inputBuffer3 = new char[READ_BLOCK_SIZE3];
                        while ((charRead03 = InputRead3.read(inputBuffer3)) > 0) {
                            // char to string conversion
                            String readstring = String.copyValueOf(inputBuffer3, 0, charRead03);
                            d03 += readstring;
                        }
                        InputRead3.close();
                    }
                    catch (Exception e) {
                        e.printStackTrace();
                    }
                    monday.setText(s03);
                    moncal.setText(c03);
                    mondist.setText(d03);
                }
                //-----------------TUESDAY-----------
                if (day == calendar.TUESDAY)
                {
                    final int READ_BLOCK_SIZE = 100;
                    int charRead;
                    int charRead2;
                    int charRead3;
                    TextView tueday = (TextView) findViewById(R.id.tuestep);
                    TextView tuecal = (TextView) findViewById(R.id.tuescal);
                    TextView tuedist = (TextView) findViewById(R.id.tuedis);
                    String s3 = "";
                    String c3 = "";
                    String d3 = "";
                    try {
                        FileInputStream fileIn = openFileInput("stepsNow.txt");
                        InputStreamReader InputRead = new InputStreamReader(fileIn);
                        char[] inputBuffer = new char[READ_BLOCK_SIZE];
                        while ((charRead = InputRead.read(inputBuffer)) > 0) {
                            // char to string conversion
                            String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                            s3 += readstring;
                        }
                        InputRead.close();
                        FileInputStream fileIn2 = openFileInput("caloriesNow.txt");
                        InputStreamReader InputRead2 = new InputStreamReader(fileIn2);
                        char[] inputBuffer2 = new char[READ_BLOCK_SIZE];
                        while ((charRead2 = InputRead2.read(inputBuffer2)) > 0) {
                            // char to string conversion
                            String readstring = String.copyValueOf(inputBuffer2, 0, charRead2);
                            c3 += readstring;
                        }
                        InputRead2.close();
                        FileInputStream fileIn3 = openFileInput("distanceNow.txt");
                        InputStreamReader InputRead3 = new InputStreamReader(fileIn3);
                        char[] inputBuffer3 = new char[READ_BLOCK_SIZE];
                        while ((charRead3 = InputRead3.read(inputBuffer3)) > 0) {
                            // char to string conversion
                            String readstring = String.copyValueOf(inputBuffer3, 0, charRead3);
                            d3 += readstring;
                        }
                        InputRead3.close();
                        FileOutputStream fileout = openFileOutput("tuesteps.txt", MODE_PRIVATE);
                        OutputStreamWriter outputWriter = new OutputStreamWriter(fileout);
                        outputWriter.write(s3);
                        outputWriter.close();
                        FileOutputStream fileout2 = openFileOutput("tuecal.txt", MODE_PRIVATE);
                        OutputStreamWriter outputWriter2 = new OutputStreamWriter(fileout2);
                        outputWriter2.write(c3);
                        outputWriter2.close();
                        FileOutputStream fileout3 = openFileOutput("tuedist.txt", MODE_PRIVATE);
                        OutputStreamWriter outputWriter3 = new OutputStreamWriter(fileout3);
                        outputWriter3.write(d3);
                        outputWriter3.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    tueday.setText(s3);
                    tuecal.setText(c3);
                    tuedist.setText(d3);
                }
                else {
                    final int READ_BLOCK_SIZE3 = 100;
                    int charRead01;
                    int charRead02;
                    int charRead03;
                    TextView tueday = (TextView) findViewById(R.id.tuestep);
                    TextView tuecal = (TextView) findViewById(R.id.tuescal);
                    TextView tuedist = (TextView) findViewById(R.id.tuedis);
                    String s03 = "";
                    String c03 = "";
                    String d03 = "";
                    try {
                        FileInputStream fileInwed = openFileInput("tuesteps.txt");
                        InputStreamReader InputReadwed = new InputStreamReader(fileInwed);
                        char[] inputBufferwed = new char[READ_BLOCK_SIZE3];
                        while ((charRead01 = InputReadwed.read(inputBufferwed)) > 0) {
                            // char to string conversion
                            String readstring = String.copyValueOf(inputBufferwed, 0, charRead01);
                            s03 += readstring;
                        }
                        InputReadwed.close();
                        FileInputStream fileInwed2 = openFileInput("tuecal.txt");
                        InputStreamReader InputReadwed2 = new InputStreamReader(fileInwed2);
                        char[] inputBufferwed2 = new char[READ_BLOCK_SIZE3];
                        while ((charRead02 = InputReadwed2.read(inputBufferwed2)) > 0) {
                            // char to string conversion
                            String readstring = String.copyValueOf(inputBufferwed2, 0, charRead02);
                            c03 += readstring;
                        }
                        InputReadwed2.close();
                        FileInputStream fileInwed3 = openFileInput("tuedist.txt");
                        InputStreamReader InputRead3 = new InputStreamReader(fileInwed3);
                        char[] inputBuffer3 = new char[READ_BLOCK_SIZE3];
                        while ((charRead03 = InputRead3.read(inputBuffer3)) > 0) {
                            // char to string conversion
                            String readstring = String.copyValueOf(inputBuffer3, 0, charRead03);
                            d03 += readstring;
                        }
                        InputRead3.close();
                    }
                    catch (Exception e) {
                        e.printStackTrace();
                    }
                    tueday.setText(s03);
                    tuecal.setText(c03);
                    tuedist.setText(d03);
                }
                //----------------WEDNESDAY-----------------
                if (day == calendar.WEDNESDAY)
                {
                    final int READ_BLOCK_SIZE = 100;
                    int charRead;
                    int charRead2;
                    int charRead3;
                    TextView wday = (TextView) findViewById(R.id.wedstep);
                    TextView wcal = (TextView) findViewById(R.id.wedcal);
                    TextView wdist = (TextView) findViewById(R.id.weddis);
                    String s3 = "";
                    String c3 = "";
                    String d3 = "";
                    try {
                        FileInputStream fileIn = openFileInput("stepsNow.txt");
                        InputStreamReader InputRead = new InputStreamReader(fileIn);
                        char[] inputBuffer = new char[READ_BLOCK_SIZE];
                        while ((charRead = InputRead.read(inputBuffer)) > 0) {
                            // char to string conversion
                            String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                            s3 += readstring;
                        }
                        InputRead.close();
                        FileInputStream fileIn2 = openFileInput("caloriesNow.txt");
                        InputStreamReader InputRead2 = new InputStreamReader(fileIn2);
                        char[] inputBuffer2 = new char[READ_BLOCK_SIZE];
                        while ((charRead2 = InputRead2.read(inputBuffer2)) > 0) {
                            // char to string conversion
                            String readstring = String.copyValueOf(inputBuffer2, 0, charRead2);
                            c3 += readstring;
                        }
                        InputRead2.close();
                        FileInputStream fileIn3 = openFileInput("distanceNow.txt");
                        InputStreamReader InputRead3 = new InputStreamReader(fileIn3);
                        char[] inputBuffer3 = new char[READ_BLOCK_SIZE];
                        while ((charRead3 = InputRead3.read(inputBuffer3)) > 0) {
                            // char to string conversion
                            String readstring = String.copyValueOf(inputBuffer3, 0, charRead3);
                            d3 += readstring;
                        }
                        InputRead3.close();
                        FileOutputStream fileout = openFileOutput("wedsteps.txt", MODE_PRIVATE);
                        OutputStreamWriter outputWriter = new OutputStreamWriter(fileout);
                        outputWriter.write(s3);
                        outputWriter.close();
                        FileOutputStream fileout2 = openFileOutput("wedcal.txt", MODE_PRIVATE);
                        OutputStreamWriter outputWriter2 = new OutputStreamWriter(fileout2);
                        outputWriter2.write(c3);
                        outputWriter2.close();
                        FileOutputStream fileout3 = openFileOutput("weddist.txt", MODE_PRIVATE);
                        OutputStreamWriter outputWriter3 = new OutputStreamWriter(fileout3);
                        outputWriter3.write(d3);
                        outputWriter3.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    wday.setText(s3);
                    wcal.setText(c3);
                    wdist.setText(d3);
                }
                else {
                    final int READ_BLOCK_SIZE3 = 100;
                    int charRead01;
                    int charRead02;
                    int charRead03;
                    TextView wday = (TextView) findViewById(R.id.wedstep);
                    TextView wcal = (TextView) findViewById(R.id.wedcal);
                    TextView wdist = (TextView) findViewById(R.id.weddis);
                    String s03 = "";
                    String c03 = "";
                    String d03 = "";
                    try {
                        FileInputStream fileInwed = openFileInput("wedsteps.txt");
                        InputStreamReader InputReadwed = new InputStreamReader(fileInwed);
                        char[] inputBufferwed = new char[READ_BLOCK_SIZE3];
                        while ((charRead01 = InputReadwed.read(inputBufferwed)) > 0) {
                            // char to string conversion
                            String readstring = String.copyValueOf(inputBufferwed, 0, charRead01);
                            s03 += readstring;
                        }
                        InputReadwed.close();
                        FileInputStream fileInwed2 = openFileInput("wedcal.txt");
                        InputStreamReader InputReadwed2 = new InputStreamReader(fileInwed2);
                        char[] inputBufferwed2 = new char[READ_BLOCK_SIZE3];
                        while ((charRead02 = InputReadwed2.read(inputBufferwed2)) > 0) {
                            // char to string conversion
                            String readstring = String.copyValueOf(inputBufferwed2, 0, charRead02);
                            c03 += readstring;
                        }
                        InputReadwed2.close();
                        FileInputStream fileInwed3 = openFileInput("weddist.txt");
                        InputStreamReader InputRead3 = new InputStreamReader(fileInwed3);
                        char[] inputBuffer3 = new char[READ_BLOCK_SIZE3];
                        while ((charRead03 = InputRead3.read(inputBuffer3)) > 0) {
                            // char to string conversion
                            String readstring = String.copyValueOf(inputBuffer3, 0, charRead03);
                            d03 += readstring;
                        }
                        InputRead3.close();
                    }
                        catch (Exception e) {
                            e.printStackTrace();
                        }
                    wday.setText(s03);
                    wcal.setText(c03);
                    wdist.setText(d03);
                }
                //---------THURSDAY___________
                if (day == calendar.THURSDAY)
                {
                    final int READ_BLOCK_SIZE = 100;
                    int charRead;
                    int charRead2;
                    int charRead3;
                    TextView thstep = (TextView) findViewById(R.id.thurstep);
                    TextView thcal = (TextView) findViewById(R.id.thurcal);
                    TextView thdist = (TextView) findViewById(R.id.thurdis);
                    String s4 = "";
                    String c4 = "";
                    String d4 = "";
                    try {
                        FileInputStream fileIn = openFileInput("stepsNow.txt");
                        InputStreamReader InputRead = new InputStreamReader(fileIn);
                        char[] inputBuffer = new char[READ_BLOCK_SIZE];
                        while ((charRead = InputRead.read(inputBuffer)) > 0) {
                            // char to string conversion
                            String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                            s4 += readstring;
                        }
                        InputRead.close();
                        FileInputStream fileIn2 = openFileInput("caloriesNow.txt");
                        InputStreamReader InputRead2 = new InputStreamReader(fileIn2);
                        char[] inputBuffer2 = new char[READ_BLOCK_SIZE];
                        while ((charRead2 = InputRead2.read(inputBuffer2)) > 0) {
                            // char to string conversion
                            String readstring = String.copyValueOf(inputBuffer2, 0, charRead2);
                            c4 += readstring;
                        }
                        InputRead2.close();
                        FileInputStream fileIn3 = openFileInput("distanceNow.txt");
                        InputStreamReader InputRead3 = new InputStreamReader(fileIn3);

                        char[] inputBuffer3 = new char[READ_BLOCK_SIZE];


                        while ((charRead3 = InputRead3.read(inputBuffer3)) > 0) {
                            // char to string conversion
                            String readstring = String.copyValueOf(inputBuffer3, 0, charRead3);
                            d4 += readstring;
                        }
                        InputRead3.close();
                        FileOutputStream fileout = openFileOutput("thsteps.txt", MODE_PRIVATE);
                        OutputStreamWriter outputWriter = new OutputStreamWriter(fileout);
                        outputWriter.write(s4);
                        outputWriter.close();
                        FileOutputStream fileout2 = openFileOutput("thcal.txt", MODE_PRIVATE);
                        OutputStreamWriter outputWriter2 = new OutputStreamWriter(fileout2);
                        outputWriter2.write(c4);
                        outputWriter2.close();
                        FileOutputStream fileout3 = openFileOutput("thdist.txt", MODE_PRIVATE);
                        OutputStreamWriter outputWriter3 = new OutputStreamWriter(fileout3);
                        outputWriter3.write(d4);
                        outputWriter3.close();
                   } catch (Exception e) {
                        e.printStackTrace();
                    }
                    thstep.setText(s4);
                    thcal.setText(c4);
                    thdist.setText(d4);
                }
                else {
                    final int READ_BLOCK_SIZE3 = 100;
                    int charRead01;
                    int charRead02;
                    int charRead03;
                    TextView thstep = (TextView) findViewById(R.id.thurstep);
                    TextView thcal = (TextView) findViewById(R.id.thurcal);
                    TextView thdist = (TextView) findViewById(R.id.thurdis);
                    String s04 = "";
                    String c04 = "";
                    String d04 = "";
                    try {
                        FileInputStream fileInwed = openFileInput("thsteps.txt");
                        InputStreamReader InputReadwed = new InputStreamReader(fileInwed);
                        char[] inputBufferwed = new char[READ_BLOCK_SIZE3];
                        while ((charRead01 = InputReadwed.read(inputBufferwed)) > 0) {
                            // char to string conversion
                            String readstring = String.copyValueOf(inputBufferwed, 0, charRead01);
                            s04 += readstring;
                        }
                        InputReadwed.close();
                        FileInputStream fileInwed2 = openFileInput("thcal.txt");
                        InputStreamReader InputReadwed2 = new InputStreamReader(fileInwed2);
                        char[] inputBufferwed2 = new char[READ_BLOCK_SIZE3];
                        while ((charRead02 = InputReadwed2.read(inputBufferwed2)) > 0) {
                            // char to string conversion
                            String readstring = String.copyValueOf(inputBufferwed2, 0, charRead02);
                            c04 += readstring;
                        }
                        InputReadwed2.close();
                        FileInputStream fileInwed3 = openFileInput("thdist.txt");
                        InputStreamReader InputRead3 = new InputStreamReader(fileInwed3);
                        char[] inputBuffer3 = new char[READ_BLOCK_SIZE3];
                        while ((charRead03 = InputRead3.read(inputBuffer3)) > 0) {
                            // char to string conversion
                            String readstring = String.copyValueOf(inputBuffer3, 0, charRead03);
                            d04 += readstring;
                        }
                        InputRead3.close();
                    }
                    catch (Exception e) {
                        e.printStackTrace();
                    }
                    thstep.setText(s04);
                    thcal.setText(c04);
                    thdist.setText(d04);
               }

                //--------------------FRIDAY----------------------

                if (day == calendar.FRIDAY)
                {
                    final int READ_BLOCK_SIZE = 100;
                    int charRead;
                    int charRead2;
                    int charRead3;
                    TextView fstep = (TextView) findViewById(R.id.fristep);
                    TextView fcal = (TextView) findViewById(R.id.frical);
                    TextView fdist = (TextView) findViewById(R.id.fridist);
                    String s5 = "";
                    String c5 = "";
                    String d5 = "";
                    try {
                        FileInputStream fileIn = openFileInput("stepsNow.txt");
                        InputStreamReader InputRead = new InputStreamReader(fileIn);
                        char[] inputBuffer = new char[READ_BLOCK_SIZE];
                        while ((charRead = InputRead.read(inputBuffer)) > 0) {
                            // char to string conversion
                            String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                            s5 += readstring;
                        }
                        InputRead.close();
                        FileInputStream fileIn2 = openFileInput("caloriesNow.txt");
                        InputStreamReader InputRead2 = new InputStreamReader(fileIn2);
                        char[] inputBuffer2 = new char[READ_BLOCK_SIZE];
                        while ((charRead2 = InputRead2.read(inputBuffer2)) > 0) {
                            // char to string conversion
                            String readstring = String.copyValueOf(inputBuffer2, 0, charRead2);
                            c5 += readstring;
                        }
                        InputRead2.close();
                        FileInputStream fileIn3 = openFileInput("distanceNow.txt");
                        InputStreamReader InputRead3 = new InputStreamReader(fileIn3);
                        char[] inputBuffer3 = new char[READ_BLOCK_SIZE];
                        while ((charRead3 = InputRead3.read(inputBuffer3)) > 0) {
                            // char to string conversion
                            String readstring = String.copyValueOf(inputBuffer3, 0, charRead3);
                            d5 += readstring;
                        }
                        InputRead3.close();
                        FileOutputStream fileout = openFileOutput("fsteps.txt", MODE_PRIVATE);
                        OutputStreamWriter outputWriter = new OutputStreamWriter(fileout);
                        outputWriter.write(s5);
                        outputWriter.close();
                        FileOutputStream fileout2 = openFileOutput("fcal.txt", MODE_PRIVATE);
                        OutputStreamWriter outputWriter2 = new OutputStreamWriter(fileout2);
                        outputWriter2.write(c5);
                        outputWriter2.close();
                        FileOutputStream fileout3 = openFileOutput("fdist.txt", MODE_PRIVATE);
                        OutputStreamWriter outputWriter3 = new OutputStreamWriter(fileout3);
                        outputWriter3.write(d5);
                        outputWriter3.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    fstep.setText(s5);
                    fcal.setText(c5);
                    fdist.setText(d5);
                }
                else {
                    final int READ_BLOCK_SIZE3 = 100;
                    int charRead01;
                    int charRead02;
                    int charRead03;
                    TextView fstep = (TextView) findViewById(R.id.fristep);
                    TextView fcal = (TextView) findViewById(R.id.frical);
                    TextView fdist = (TextView) findViewById(R.id.fridist);
                    String s05 = "";
                    String c05 = "";
                    String d05 = "";
                    try {
                        FileInputStream fileInwed = openFileInput("fsteps.txt");
                        InputStreamReader InputReadwed = new InputStreamReader(fileInwed);
                        char[] inputBufferwed = new char[READ_BLOCK_SIZE3];
                        while ((charRead01 = InputReadwed.read(inputBufferwed)) > 0) {
                            // char to string conversion
                            String readstring = String.copyValueOf(inputBufferwed, 0, charRead01);
                            s05 += readstring;
                        }
                        InputReadwed.close();
                        FileInputStream fileInwed2 = openFileInput("fcal.txt");
                        InputStreamReader InputReadwed2 = new InputStreamReader(fileInwed2);
                        char[] inputBufferwed2 = new char[READ_BLOCK_SIZE3];
                        while ((charRead02 = InputReadwed2.read(inputBufferwed2)) > 0) {
                            // char to string conversion
                            String readstring = String.copyValueOf(inputBufferwed2, 0, charRead02);
                            c05 += readstring;
                        }
                        InputReadwed2.close();
                        FileInputStream fileInwed3 = openFileInput("fdist.txt");
                        InputStreamReader InputRead3 = new InputStreamReader(fileInwed3);
                        char[] inputBuffer3 = new char[READ_BLOCK_SIZE3];
                        while ((charRead03 = InputRead3.read(inputBuffer3)) > 0) {
                            // char to string conversion
                            String readstring = String.copyValueOf(inputBuffer3, 0, charRead03);
                            d05 += readstring;
                        }
                        InputRead3.close();
                    }
                    catch (Exception e) {
                        e.printStackTrace();
                    }
                    fstep.setText(s05);
                    fcal.setText(c05);
                    fdist.setText(d05);
                }

                //---------------SATURDAY--------------

                if (day == calendar.SATURDAY)
                {
                    final int READ_BLOCK_SIZE = 100;
                    int charRead;
                    int charRead2;
                    int charRead3;
                    TextView satstep = (TextView) findViewById(R.id.satstep);
                    TextView satcal = (TextView) findViewById(R.id.satcal);
                    TextView satdist = (TextView) findViewById(R.id.satdis);
                    String s5 = "";
                    String c5 = "";
                    String d5 = "";
                    try {
                        FileInputStream fileIn = openFileInput("stepsNow.txt");
                        InputStreamReader InputRead = new InputStreamReader(fileIn);
                        char[] inputBuffer = new char[READ_BLOCK_SIZE];
                        while ((charRead = InputRead.read(inputBuffer)) > 0) {
                            // char to string conversion
                            String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                            s5 += readstring;
                        }
                        InputRead.close();
                        FileInputStream fileIn2 = openFileInput("caloriesNow.txt");
                        InputStreamReader InputRead2 = new InputStreamReader(fileIn2);
                        char[] inputBuffer2 = new char[READ_BLOCK_SIZE];
                        while ((charRead2 = InputRead2.read(inputBuffer2)) > 0) {
                            // char to string conversion
                            String readstring = String.copyValueOf(inputBuffer2, 0, charRead2);
                            c5 += readstring;
                        }
                        InputRead2.close();
                        FileInputStream fileIn3 = openFileInput("distanceNow.txt");
                        InputStreamReader InputRead3 = new InputStreamReader(fileIn3);
                        char[] inputBuffer3 = new char[READ_BLOCK_SIZE];
                        while ((charRead3 = InputRead3.read(inputBuffer3)) > 0) {
                            // char to string conversion
                            String readstring = String.copyValueOf(inputBuffer3, 0, charRead3);
                            d5 += readstring;
                        }
                        InputRead3.close();
                        FileOutputStream fileout = openFileOutput("satsteps.txt", MODE_PRIVATE);
                        OutputStreamWriter outputWriter = new OutputStreamWriter(fileout);
                        outputWriter.write(s5);
                        outputWriter.close();
                        FileOutputStream fileout2 = openFileOutput("satcal.txt", MODE_PRIVATE);
                        OutputStreamWriter outputWriter2 = new OutputStreamWriter(fileout2);
                        outputWriter2.write(c5);
                        outputWriter2.close();
                        FileOutputStream fileout3 = openFileOutput("satdist.txt", MODE_PRIVATE);
                        OutputStreamWriter outputWriter3 = new OutputStreamWriter(fileout3);
                        outputWriter3.write(d5);
                        outputWriter3.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    satstep.setText(s5);
                    satcal.setText(c5);
                    satdist.setText(d5);
                    }
                    else {
                    final int READ_BLOCK_SIZE3 = 100;
                    int charRead01;
                    int charRead02;
                    int charRead03;
                    TextView satstep = (TextView) findViewById(R.id.satstep);
                    TextView satcal = (TextView) findViewById(R.id.satcal);
                    TextView satdist = (TextView) findViewById(R.id.satdis);
                    String s05 = "";
                    String c05 = "";
                    String d05 = "";
                    try {
                        FileInputStream fileInwed = openFileInput("satsteps.txt");
                        InputStreamReader InputReadwed = new InputStreamReader(fileInwed);
                        char[] inputBufferwed = new char[READ_BLOCK_SIZE3];
                        while ((charRead01 = InputReadwed.read(inputBufferwed)) > 0) {
                            // char to string conversion
                            String readstring = String.copyValueOf(inputBufferwed, 0, charRead01);
                            s05 += readstring;
                        }
                        InputReadwed.close();
                        FileInputStream fileInwed2 = openFileInput("satcal.txt");
                        InputStreamReader InputReadwed2 = new InputStreamReader(fileInwed2);
                        char[] inputBufferwed2 = new char[READ_BLOCK_SIZE3];
                        while ((charRead02 = InputReadwed2.read(inputBufferwed2)) > 0) {
                            // char to string conversion
                            String readstring = String.copyValueOf(inputBufferwed2, 0, charRead02);
                            c05 += readstring;
                        }
                        InputReadwed2.close();
                        FileInputStream fileInwed3 = openFileInput("satdist.txt");
                        InputStreamReader InputRead3 = new InputStreamReader(fileInwed3);
                        char[] inputBuffer3 = new char[READ_BLOCK_SIZE3];
                        while ((charRead03 = InputRead3.read(inputBuffer3)) > 0) {
                            // char to string conversion
                            String readstring = String.copyValueOf(inputBuffer3, 0, charRead03);
                            d05 += readstring;
                        }
                        InputRead3.close();
                    }
                    catch (Exception e) {
                        e.printStackTrace();
                    }
                    satstep.setText(s05);
                    satcal.setText(c05);
                    satdist.setText(d05);

                }
                //-----------------SUNDAY-------------------
                if (day == calendar.SUNDAY)
                {
                    final int READ_BLOCK_SIZE = 100;
                    int charRead;
                    int charRead2;
                    int charRead3;
                    TextView sunstep = (TextView) findViewById(R.id.sunstep);
                    TextView suncal = (TextView) findViewById(R.id.suncal);
                    TextView sundist = (TextView) findViewById(R.id.sundis);
                    String s5 = "";
                    String c5 = "";
                    String d5 = "";
                    try {
                        FileInputStream fileIn = openFileInput("stepsNow.txt");
                        InputStreamReader InputRead = new InputStreamReader(fileIn);
                        char[] inputBuffer = new char[READ_BLOCK_SIZE];
                        while ((charRead = InputRead.read(inputBuffer)) > 0) {
                            // char to string conversion
                            String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                            s5 += readstring;
                        }
                        InputRead.close();
                        FileInputStream fileIn2 = openFileInput("caloriesNow.txt");
                        InputStreamReader InputRead2 = new InputStreamReader(fileIn2);
                        char[] inputBuffer2 = new char[READ_BLOCK_SIZE];
                        while ((charRead2 = InputRead2.read(inputBuffer2)) > 0) {
                            // char to string conversion
                            String readstring = String.copyValueOf(inputBuffer2, 0, charRead2);
                            c5 += readstring;
                        }
                        InputRead2.close();
                        FileInputStream fileIn3 = openFileInput("distanceNow.txt");
                        InputStreamReader InputRead3 = new InputStreamReader(fileIn3);
                        char[] inputBuffer3 = new char[READ_BLOCK_SIZE];
                        while ((charRead3 = InputRead3.read(inputBuffer3)) > 0) {
                            // char to string conversion
                            String readstring = String.copyValueOf(inputBuffer3, 0, charRead3);
                            d5 += readstring;
                        }
                        InputRead3.close();
                        FileOutputStream fileout = openFileOutput("sunsteps.txt", MODE_PRIVATE);
                        OutputStreamWriter outputWriter = new OutputStreamWriter(fileout);
                        outputWriter.write(s5);
                        outputWriter.close();
                        FileOutputStream fileout2 = openFileOutput("suncal.txt", MODE_PRIVATE);
                        OutputStreamWriter outputWriter2 = new OutputStreamWriter(fileout2);
                        outputWriter2.write(c5);
                        outputWriter2.close();
                        FileOutputStream fileout3 = openFileOutput("sundist.txt", MODE_PRIVATE);
                        OutputStreamWriter outputWriter3 = new OutputStreamWriter(fileout3);
                        outputWriter3.write(d5);
                        outputWriter3.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    sunstep.setText(s5);
                    suncal.setText(c5);
                    sundist.setText(d5);
                } else {
                    final int READ_BLOCK_SIZE3 = 100;
                    int charRead01;
                    int charRead02;
                    int charRead03;
                    TextView sunstep = (TextView) findViewById(R.id.sunstep);
                    TextView suncal = (TextView) findViewById(R.id.suncal);
                    TextView sundist = (TextView) findViewById(R.id.sundis);
                    String s05 = "";
                    String c05 = "";
                    String d05 = "";
                    try {
                        FileInputStream fileInwed = openFileInput("sunsteps.txt");
                        InputStreamReader InputReadwed = new InputStreamReader(fileInwed);
                        char[] inputBufferwed = new char[READ_BLOCK_SIZE3];
                        while ((charRead01 = InputReadwed.read(inputBufferwed)) > 0) {
                            // char to string conversion
                            String readstring = String.copyValueOf(inputBufferwed, 0, charRead01);
                            s05 += readstring;
                        }
                        InputReadwed.close();
                        FileInputStream fileInwed2 = openFileInput("suncal.txt");
                        InputStreamReader InputReadwed2 = new InputStreamReader(fileInwed2);
                        char[] inputBufferwed2 = new char[READ_BLOCK_SIZE3];
                        while ((charRead02 = InputReadwed2.read(inputBufferwed2)) > 0) {
                            // char to string conversion
                            String readstring = String.copyValueOf(inputBufferwed2, 0, charRead02);
                            c05 += readstring;
                        }
                        InputReadwed2.close();
                        FileInputStream fileInwed3 = openFileInput("sundist.txt");
                        InputStreamReader InputRead3 = new InputStreamReader(fileInwed3);
                        char[] inputBuffer3 = new char[READ_BLOCK_SIZE3];
                        while ((charRead03 = InputRead3.read(inputBuffer3)) > 0) {
                            // char to string conversion
                            String readstring = String.copyValueOf(inputBuffer3, 0, charRead03);
                            d05 += readstring;
                        }
                        InputRead3.close();
                    }
                    catch (Exception e) {
                        e.printStackTrace();
                    }
                    sunstep.setText(s05);
                    suncal.setText(c05);
                    sundist.setText(d05);
                }

            } // - on/create
        }






