package org.example;

/**
 * Car object class
 */
public class Car
{
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "I am a car with a " + engine.type() + " engine.";
    }
}
