package jrout.tutorial.batch31.springcore.service.impl;

import jrout.tutorial.batch31.springcore.service.IMusic;
import jrout.tutorial.batch31.springcore.service.IVehicle;
import jrout.tutorial.batch31.springcore.service.IVehicleMaintenance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleMaintenceImpl implements IVehicleMaintenance {

    @Autowired
    private IVehicle vehicle;

    @Autowired
    private IMusic music;

    public void wash() {
        vehicle.washMirror();
        vehicle.washTires();
        music.play();
    }



}
