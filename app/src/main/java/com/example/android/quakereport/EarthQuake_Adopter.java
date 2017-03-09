package com.example.android.quakereport;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class EarthQuake_Adopter extends ArrayAdapter<Earthquake_detail> {


 public EarthQuake_Adopter(Activity context , ArrayList<Earthquake_detail> Earthqukaes)
 {
     super(context,0,Earthqukaes);
 }

    @Override
    public View getView(int position,View convertView,ViewGroup parent)
    {
        View Earth_Q_View = convertView;
        if (Earth_Q_View == null)
        {
                Earth_Q_View= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        Earthquake_detail eqobj= getItem(position);

        TextView EQ_frequency = (TextView) Earth_Q_View.findViewById(R.id.Text_View_Frequncy);
        EQ_frequency.setText(eqobj.getmEarthqfrequency());

        TextView Eq_City = (TextView) Earth_Q_View.findViewById(R.id.Text_View_City);
        Eq_City.setText(eqobj.getMcityname());

        TextView Eq_DAte= (TextView) Earth_Q_View.findViewById(R.id.Text_View_Date);
        Eq_DAte.setText(eqobj.getmEarthqdate());

        return Earth_Q_View;
    }
}
