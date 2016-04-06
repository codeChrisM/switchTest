package com.delta.abstraction;

import android.util.Log;

/**
 * Created by Christopher on 4/6/2016.
 */
public abstract class Device {

    protected String deviceName;
    protected boolean isOn;

    public abstract void breakDevice();

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }
}
