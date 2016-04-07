package com.delta.abstraction;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Christopher on 4/6/2016.
 */
public class Switch {

    private List<Switchable> switchableItems = new ArrayList<Switchable>();

    public void wireUp(Switchable thing){
        switchableItems.add(thing);
    }

    public  void  unwire(Switchable thing){
        switchableItems.remove(thing);
    }
    public void flipSwitchUp(){
        for(Switchable thing: switchableItems){
            thing.turnOn();
        }
    }

    public void flipSwitchDown(){
        for(Switchable thing: switchableItems){
            thing.turnOff();
        }
    }

}
