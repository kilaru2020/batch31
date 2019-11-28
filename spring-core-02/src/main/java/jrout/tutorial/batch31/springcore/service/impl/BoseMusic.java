package jrout.tutorial.batch31.springcore.service.impl;

import jrout.tutorial.batch31.springcore.service.IMusic;

public class BoseMusic implements IMusic {
    @Override
    public void play() {
        System.out.println("Play Bose Music....");
    }
}
