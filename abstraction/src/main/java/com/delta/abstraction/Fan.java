package com.delta.abstraction;

import android.util.Log;

/**
 * Created by Christopher on 4/6/2016.
 */
public class Fan extends Device {

    public Fan(){
        setDeviceName("FAN");
    }

    public void breakDevice(){
        Log.e(getDeviceName(), " the sound of brokefan");
    }
}
