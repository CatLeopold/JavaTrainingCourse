package com.tyshchenko.java.training.oop.lesson2.car;

/**
 * @author Alexander Tyshchenko.
 */
public class Engine {
    private double mileage;
    private boolean started;

    public Engine(double mileage) {
        this.mileage = mileage;
    }

    public double getMileage() {
        return mileage;
    }

    public void addMileage(double mileage) {
        if (started)
            this.mileage += mileage;
    }

    public boolean isStarted() {
        return started;
    }

    public void turnOn() {
        started = true;
    }

    public void turnOff() {
        started = false;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "mileage=" + mileage +
                ", started=" + started +
                '}';
    }
}
