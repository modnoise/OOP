package com.company;

import java.util.Objects;

public class Flower extends BouquetComponent {
    private int freshness;

    public Flower(int price, int freshness) {
        super(price); //посилання на батька
        this.freshness = freshness;
    }

    public int getFreshness() {
        return freshness;
    }

    @Override
    public String toString() {
        return "Flower is " + getClass().getSimpleName() + //конкретизуємо, що за квітка
                ", freshness=" + freshness;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return freshness == flower.freshness;
    }

    @Override
    public int hashCode() {
        return Objects.hash(freshness);
    } //Indicates whether some other object is "equal to" this one.
}