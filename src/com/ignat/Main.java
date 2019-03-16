package com.ignat;

class Car {

    private String name;
    private boolean engine;
    private int horsePower;
    private int wheels;
    private String fuelType;

    public Car(String name, int horsePower, String fuelType) {
        this.name = name;
        this.engine = true;
        this.horsePower = horsePower;
        this.wheels = 4;
        this.fuelType = fuelType;
    }

    public String getName() {
        return name;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void startEngine() {
        System.out.println("Engine started...");
    }

    public void accelerate () {
        System.out.println("Accelerating..");
    }

    public void brake() {
        System.out.println("Braking..");
    }
}

class Mazda extends Car {
    public Mazda() {
        super("Mazda", 120,"Gasoline");
    }
    public void startEngine() {
        System.out.println("Mazda starting engine!");
    }
    public void accelerate() {
        System.out.println("Mazda is accelerating!");
    }
    public void brake() {
        System.out.println("Mazda is breaking!");
    }
}

class Ford extends Car {
    public Ford() {
        super("Ford",100,"Diesel");
    }

    @Override
    public void startEngine() {
        System.out.println("Ford starts engine!");
    }

    @Override
    public void accelerate() {
        System.out.println("Ford is accelerating!");
    }
}

class Ferrari extends Car {
    public Ferrari() {
        super("Ferrari", 350, "Gasoline");
    }

    @Override
    public void accelerate() {
        System.out.println("Ferrari is starting to fly!");
    }
}

class Dacia extends Car {
    public Dacia() {
        super("Dacia", 50, "Water");
    }

    @Override
    public void startEngine() {
        System.out.println("Trying to start the engine..................... Succes");
    }

    @Override
    public void brake() {
        System.out.println("Error 404: Brakes not found!!!");
    }
}

public class Main {

    public static void main(String[] args) {

        for(int i = 1; i<=10;i++) {
            Car car=randomCar();
            System.out.println("Car #" + i + " is a "
                    + car.getName() + ". It is a "
                    + car.getFuelType()
                    + " powered vehicle with "
                    + car.getHorsePower() + " horsepower!");
            car.startEngine();
            car.accelerate();
            car.brake();
        }

    }

    public static Car randomCar() {
        int randomNumber = (int) (Math.random()*4+1);
        System.out.println("Random number generated is: " + randomNumber);
        switch (randomNumber) {
            case 1: return new Mazda();
            case 2: return new Ford();
            case 3: return new Ferrari();
            case 4: return new Dacia();
        }
        return null;
    }
}
