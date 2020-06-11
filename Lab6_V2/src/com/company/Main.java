package com.company;

import java.util.concurrent.Flow;

public class Main {
    public static void main(String[] args) {

        Flower rose = new Rose(9, 30, 2);
        Flower tulip = new Tulip(60, 1);
        Flower tulip2 = new Tulip(55, 4);
        Flower chrysanthemum = new Chrysanthemum(80, 0);

        Bouquet bouquet = new Bouquet(new BouquetComponent[]{rose, tulip, tulip2, chrysanthemum});

        bouquet.sortByFreshness();

        System.out.println("Done!");
    }
}
