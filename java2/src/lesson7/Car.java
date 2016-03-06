package lesson7;


//import javax.annotation.PostConstruct;

import lesson7.di.Auto;

public class Car {

    @Auto(isRequired = true)
    private Engine engine;

    private Gear gear;


    public Car() {
    }

    public void init() {
        System.out.println("Post Init");
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", gear=" + gear +
                '}';
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Gear getGear() {
        return gear;
    }

    public void setGear(Gear gear) {
        this.gear = gear;
    }
}
