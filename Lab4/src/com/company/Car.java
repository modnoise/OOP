package com.company;

import java.util.Comparator;
import java.lang.String;

public class Car {
    private String name; // name of the car
    private String model; // model of the car
    private int aos; // amount of seets
    private int maxspeeed; // max speed
    private String origin; // country, where the car from

    public String GetName() { return name; }

    public String GetType() {
        return model;
    }

    public int GetAos() {
        return aos;
    }

    public int GetMaxS() {
        return maxspeeed;
    }

    public String GetOrigin() {
        return origin;
    }

    public Car(String name, String model, int aos, int maxspeeed, String origin) {
        this.name = name;
        this.model = model;
        this.aos = aos;
        this.maxspeeed = maxspeeed;
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "[name = " + this.name + " model = " + this.model + " amount of seets = " + this.aos + " max speed = " +
                this.maxspeeed + " origin = " + this.origin + "]";
    }

    public static Comparator<Car> dofComparator = new Comparator<Car>() {

        @Override
        public int compare(Car e1, Car e2) {
            return (int) (e2.GetAos() - e1.GetAos());
        }
    };

    public static Comparator<Car> stdComparator = new Comparator<Car>() {

        @Override
        public int compare(Car e1, Car e2) {
            return (int) (e1.GetMaxS() - e2.GetMaxS());
        }
    };
}

