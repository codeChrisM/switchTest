package com.delta.abstraction;

import android.util.Log;

/**
 * Created by Christopher on 4/6/2016.
 */
public class Light extends Device {

    public Light() {
        setDeviceName("Light");
    }

    @Override
    public void breakDevice() {
        Log.e(getDeviceName(), "glass is broke");
    }
}
