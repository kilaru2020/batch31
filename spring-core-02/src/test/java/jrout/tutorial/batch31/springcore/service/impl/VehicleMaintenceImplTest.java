package jrout.tutorial.batch31.springcore.service.impl;

import jrout.tutorial.batch31.springcore.AppConfig;
import jrout.tutorial.batch31.springcore.service.IVehicleMaintenance;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AppConfig.class })
public class VehicleMaintenceImplTest {

    @Autowired
    private IVehicleMaintenance iVehicleMaintenance;


    /*@Test
    public void washHonda_old() {
        iVehicleMaintenance = new VehicleMaintenceImpl();
        iVehicleMaintenance.setVehicle(new HondaVehicle());
        iVehicleMaintenance.wash();
    }*/


    @Test
    public void washHonda() {
        iVehicleMaintenance.wash();
    }


    /*@Test
    public void washMercedes() {
        VehicleMaintenceImpl vehicleMaintence = new VehicleMaintenceImpl();
        MercedesVehicle vehicle = new MercedesVehicle();
        vehicleMaintence.setVehicle(vehicle);

        vehicleMaintence.wash();
    }*/
}