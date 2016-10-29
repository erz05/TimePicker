package com.erz.timepicker;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.erz.timepicker_library.TimePicker;

/**
 * Created by edgarramirez on 2/27/15.
 */
public class MyFragment extends Fragment {

    int layoutID;

    public static MyFragment newInstance(int layoutID) {
        MyFragment fragment = new MyFragment();
        fragment.layoutID = layoutID;
        return fragment;
    }

    @Override
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("layoutID", layoutID);
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null && bundle.containsKey("layoutID")) {
            layoutID = bundle.getInt("layoutID");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup group, Bundle bundle) {
        View V = inflater.inflate(layoutID, group, false);

        RadioGroup myRadioGroup = (RadioGroup) V.findViewById(R.id.myRadioGroup);
        if (myRadioGroup != null) {
            myRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int i) {
                    View view = getView();
                    if (view == null) return;
                    RadioButton twelve = (RadioButton) view.findViewById(R.id.twelve);
                    RadioButton twentyFour = (RadioButton) view.findViewById(R.id.twentyFour);
                    TimePicker timePicker = (TimePicker) view.findViewById(R.id.timePicker);
                    switch (i) {
                        case R.id.twelve:
                            twelve.setTextColor(Color.BLACK);
                            twelve.setBackgroundColor(Color.WHITE);
                            twentyFour.setTextColor(Color.WHITE);
                            twentyFour.setBackgroundColor(Color.BLACK);
                            timePicker.enableTwentyFourHour(false);
                            break;
                        case R.id.twentyFour:
                            twelve.setTextColor(Color.WHITE);
                            twelve.setBackgroundColor(Color.BLACK);
                            twentyFour.setTextColor(Color.BLACK);
                            twentyFour.setBackgroundColor(Color.WHITE);
                            timePicker.enableTwentyFourHour(true);
                            break;
                    }
                }
            });
        }

        return V;
    }
}
