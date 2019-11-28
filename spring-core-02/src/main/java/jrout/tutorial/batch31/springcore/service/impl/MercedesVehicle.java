package jrout.tutorial.batch31.springcore.service.impl;

import jrout.tutorial.batch31.springcore.service.IVehicle;

public class MercedesVehicle implements IVehicle {
    public void washMirror() {
        System.out.println("Washing Mercedes Mirrors");
    }

    public void washTires() {
        System.out.println("Washing Mercedes Tires....");
    }

    public void doOiling() {

    }
}
