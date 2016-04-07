package com.delta.abstraction;

/**
 * Created by Christopher on 4/6/2016.
 */
public class Switch {

    public void turnOnSwitchable(Switchable thing){
        thing.turnOn();
    }

    public void turnOffSwitchable(Switchable thing){
        thing.turnOff();
    }

}
