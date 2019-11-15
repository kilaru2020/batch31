package jrout.tutorial.batch31.jdbc;
import java.lang.reflect.InvocationTargetException;
import java.sql.*;

public class ClassForNameExample {

    public static void main(String[] args) {
        /*try {
            Class.forName("jrout.tutorial.batch31.jdbc.Flute") ;//.getDeclaredConstructor().newInstance();
//            Class.forName("jrout.tutorial.batch31.jdbc.Flute").getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        new Flute();
    }
}
