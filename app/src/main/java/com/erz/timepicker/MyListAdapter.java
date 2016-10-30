package com.erz.timepicker;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.erz.timepicker_library.TimePicker;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

/**
 * Created by edgarramirez on 10/29/16.
 */

public class MyListAdapter extends RecyclerView.Adapter<MyListAdapter.MyViewHolder> {

    private long time;
    private Random random = new Random();
    private final ArrayList<Integer> colors = new ArrayList<Integer>() {{
        add(0xff607d8b);
        add(0xff9e9e9e);
        add(0xffff5722);
        add(0xffff9800);
        add(0xffffc107);
        add(0xffffeb3b);
        add(0xffcddc39);
        add(0xff8bc34a);
        add(0xff4caf50);
        add(0xff009688);
        add(0xff00bcd4);
        add(0xff03a9f4);
        add(0xff2196f3);
        add(0xff3f51b5);
        add(0xff673ab7);
        add(0xff9c27b0);
        add(0xffe91e63);
        add(0xfff44336);
    }};
    private ArrayList<Integer> tmpArray = new ArrayList<>();

    public MyListAdapter(long time) {
        this.time = time;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        TimePicker timePicker = new TimePicker(parent.getContext());
        timePicker.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));
        return new MyViewHolder(timePicker);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        changeColor(holder.timePicker);
        holder.timePicker.setTime(new Date(time));
    }

    @Override
    public int getItemCount() {
        return 500;
    }

    private void changeColor(TimePicker picker) {
        tmpArray.clear();
        tmpArray.addAll(colors);
        int next = random.nextInt(tmpArray.size());
        picker.setBackgroundColor(tmpArray.get(next));

        tmpArray.remove(next);
        next = random.nextInt(tmpArray.size());
        picker.setClockColor(tmpArray.get(next));

        tmpArray.remove(next);
        next = random.nextInt(tmpArray.size());
        picker.setDialColor(tmpArray.get(next));

        tmpArray.remove(next);
        next = random.nextInt(tmpArray.size());
        picker.setTextColor(tmpArray.get(next));
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        final TimePicker timePicker;

        public MyViewHolder(TimePicker itemView) {
            super(itemView);
            timePicker = itemView;
        }
    }

    public void setTime(long time) {
        this.time = time;
        notifyDataSetChanged();
    }
}