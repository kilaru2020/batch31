package jrout.tutorial.batch31.jdbc;

public class Flute {
    static {
        System.out.println("I am Flute...");
    }
    public Flute() {
        System.out.println("I am loaded");
    }

    public static void main(String[] args) throws Exception {
//        new Flute();
//        Class.forName("jrout.tutorial.batch31.jdbc.Flute").newInstance();
        Class.forName("jrout.tutorial.batch31.jdbc.Flute").getDeclaredConstructor().newInstance();
        Class.forName("jrout.tutorial.batch31.jdbc.Flute").getDeclaredConstructor().newInstance();
    }
}
