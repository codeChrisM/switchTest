package com.delta.abstraction;

import android.util.Log;

/**
 * Created by Christopher on 4/6/2016.
 */
public class Light extends Device implements Switchable{

    public Light() {
        setDeviceName("Light");
    }

    @Override
    public void breakDevice() {
        Log.e(getDeviceName(), "glass is broke");
    }

    public void turnOn(){
        Log.e(getDeviceName(),"let there be light");
    }

    public void turnOff(){
        Log.e(getDeviceName(),"and it's dark");
    }
}
