package com.example.android.quakereport;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.widget.ArrayAdapter;

import java.util.Date;

public class Earthquake_detail {
    private String mEarthqfrequency;
    private String mcityname;
    private String mEarthqdate;


    public Earthquake_detail(String Earthqfrequency, String cityname, String Earthqdate) {
        mEarthqfrequency = Earthqfrequency;
        mcityname = cityname;
        mEarthqdate = Earthqdate;
    }

    public String getmEarthqfrequency() {
        return mEarthqfrequency;
    }

    public String getMcityname() {
        return mcityname;
    }

    public String getmEarthqdate() {
        return mEarthqdate;
    }

}
