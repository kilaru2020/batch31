package jrout.tutorial.batch31.springcore.service.impl;

import jrout.tutorial.batch31.springcore.service.IVehicle;
import org.springframework.stereotype.Component;

@Component // new HondaVehicle()
public class HondaVehicle implements IVehicle {
    public void washMirror() {
        System.out.println("Washing Honda Mirrors");
    }

    public void washTires() {
        System.out.println("Washing Honda Tires....");
    }

    public void doOiling() {

    }
}
