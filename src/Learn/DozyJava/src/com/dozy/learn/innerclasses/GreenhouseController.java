//: innerclasses/GreenhouseController.java
package com.dozy.learn.innerclasses;

// Configure and execute the greenhouse system.
// {Args: 5000}
import com.dozy.learn.innerclasses.controller.*;

public class GreenhouseController {
    public static void main(String[] args) {
        GreenhouseControls gc = new GreenhouseControls();
        // Instead of hard-wiring, you could parse
        // configuration information from a text file here:
        gc.addEvent(gc.new Bell(900));
        Event[] eventList = { gc.new ThermostatNight(0), gc.new LightOn(200),
                gc.new LightOff(400), gc.new WaterOn(600),
                gc.new WaterOff(800), gc.new ThermostatDay(1400) };
        gc.addEvent(gc.new Restart(2000, eventList));
        gc.addEvent(new GreenhouseControls.Terminate(new Integer(1000)));
        gc.run();
    }
} /* Output:
Bing!
Thermostat on night setting
Light is on
Light is off
Greenhouse water is on
Greenhouse water is off
Thermostat on day setting
Restarting system
Terminating
*///:~
