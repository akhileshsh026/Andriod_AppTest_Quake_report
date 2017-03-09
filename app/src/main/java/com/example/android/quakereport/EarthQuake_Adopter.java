package com.example.android.quakereport;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/**
 * Created by Akhileshsh026 on 09-03-2017.
 */

public class EarthQuake_Adopter extends ArrayAdapter<Earthquake_detail> {


    @Override
    public View getView(int position,View convertView,ViewGroup parent)
    {
        return super.getView(position, convertView, parent);
    }
}
