package com.erz.timepicker;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

import com.erz.timepicker_library.TimePicker;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TimePicker picker1 = (TimePicker) findViewById(R.id.picker1);
        TimePicker picker2 = (TimePicker) findViewById(R.id.picker2);
        TimePicker picker3 = (TimePicker) findViewById(R.id.picker3);
        TimePicker picker4 = (TimePicker) findViewById(R.id.picker4);

        picker1.setClockColor(Color.GREEN);
        picker2.setClockColor(Color.parseColor("#FFA500"));
        picker2.setTextColor(Color.WHITE);
        picker2.setDialColor(Color.WHITE);
        picker3.setClockColor(Color.MAGENTA);
        picker3.setTextColor(Color.WHITE);
        picker3.setDialColor(Color.WHITE);
        picker4.setClockColor(Color.BLUE);
    }
}
