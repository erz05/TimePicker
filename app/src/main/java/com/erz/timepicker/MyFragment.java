package com.erz.timepicker;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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
    public void onCreate(Bundle bundle){
        super.onCreate(bundle);
        if(bundle != null && bundle.containsKey("layoutID")){
            layoutID = bundle.getInt("layoutID");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup group, Bundle bundle){
        return inflater.inflate(layoutID, group, false);
    }
}
