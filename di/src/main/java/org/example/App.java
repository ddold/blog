package org.example;

public class App {
    public static void main(String[] args) {
        Engine petrolEngine = new PetrolEngine();
        Engine dieselEngine = new DieselEngine();

        Car petrolCar = new Car(petrolEngine);
        Car dieselCar = new Car(dieselEngine);

        System.out.println(petrolCar);
        System.out.println(dieselCar);
    }
}
