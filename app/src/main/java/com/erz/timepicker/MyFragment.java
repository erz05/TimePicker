package com.erz.timepicker;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.erz.timepicker_library.TimePicker;

/**
 * Created by edgarramirez on 2/27/15.
 */
public class MyFragment extends Fragment {

    int layoutID;

    public static MyFragment newInstance(int layoutID){
        MyFragment fragment = new MyFragment();
        fragment.layoutID = layoutID;
        return fragment;
    }

    @Override
    public void onSaveInstanceState(Bundle bundle){
        super.onSaveInstanceState(bundle);
        bundle.putInt("layoutID", layoutID);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup group, Bundle bundle){
        View view = inflater.inflate(layoutID, group, false);

        if(bundle != null && bundle.containsKey("layoutID")){
            layoutID = bundle.getInt("layoutID");
        }

        if(layoutID == R.layout.color_clocks) {
            TimePicker picker1 = (TimePicker) view.findViewById(R.id.picker1);
            TimePicker picker2 = (TimePicker) view.findViewById(R.id.picker2);
            TimePicker picker3 = (TimePicker) view.findViewById(R.id.picker3);
            TimePicker picker4 = (TimePicker) view.findViewById(R.id.picker4);

            picker1.setClockColor(Color.GREEN);
            picker2.setClockColor(Color.parseColor("#FFA500"));
            picker2.setTextColor(Color.WHITE);
            picker2.setDialColor(Color.WHITE);
            picker3.setClockColor(Color.MAGENTA);
            picker3.setTextColor(Color.WHITE);
            picker3.setDialColor(Color.WHITE);
            picker4.setClockColor(Color.BLUE);
        }

        return view;
    }
}
