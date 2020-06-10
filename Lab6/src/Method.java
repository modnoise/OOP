import Cars.*;

import java.util.Comparator;
import java.util.Random;
import java.util.Arrays;

public class Method {
    private Car[] park;
    private static final int brandQ = 3;

    public Method(int quantity, int avYear) {
        this.park = new Car[quantity];
        Random random = new Random();
        int num;
        for (int i = 0; i < quantity; i++) {
            num = random.nextInt(brandQ);
            park[i] = selCar(num, avYear);
            //System.out.println();
        }
    }

    public double getParkPrice(){
        double price = 0.0;
        for(int i = 0; i < park.length; i++){
            price = price + park[i].getPrice();
        }
        return price;
    }

    public void getCarsInSpeedRange(int down,int up) {
        int k = 0;
        String state = "";
        for(int i = 0; i < park.length; i++) {
            if(park[i].getMaxSpeed() > down & park[i].getMaxSpeed() < up) {
                if(park[i].getState() <= 0.25) {
                    state = "(very bad)";
                }
                else if(park[i].getState() <= 0.5) {
                    state = "(bad)";
                }
                else if(park[i].getState() <= 0.75){
                    state = "(satisfactory)";
                }
                else if(park[i].getState() < 1){
                    state = "(good)";
                }
                else {
                    state = "(perfect)";
                }
                System.out.println("Model is " + park[i].getName() + ", max speed = " + park[i].getMaxSpeed() +  ", year is " + park[i].getYear() + ", state is " + park[i].getState()*100 + "%" + state);
            }
        }
    }

    public void sort() {
        Arrays.sort(park, new sortByFuelCons());
    }

    public void display() {
        for(int i = 0; i < park.length; i++){
            System.out.println(park[i].getName() + " fuel consumption = " + park[i].getFuelCons() + "\n");
        }
    }


//-----------------------------------Service Methods----------------------------------

    public double genState(int year) {
        final Random random = new Random();
        int yearn = 2019;
        double state;
        double yeark = Math.pow((double)year/yearn, 5);
        double err = 0.15;

        state = random.nextInt(101);
        state = state/100;

        if(Math.abs(state-yeark) > err){
            for (int i = 0; i < 3; i++){
                state = random.nextInt(101);
                state = state/100;
                //System.out.println(state);
                if(Math.abs(state-yeark) <= err){
                    return state;
                }
            }
        }
        return state;
    }

    private int genYear(int x) {
        Random random = new Random();
        int lim = 2019;
        int year;
        int maxStep = 4;
        int step = random.nextInt(4) + 1;
        year = x + step;
        if(year > lim) {year = lim;}
        //System.out.println(year);
        return year;
    }

    private Car selCar(int num, int avYear) {
        Car car;
        int x = genYear(avYear);
        if(num == 0){
            car = new HyundaiElantra(x, genState(x));
        }
        else if (num == 1) {
            car = new BMW_X5(x, genState(x));
        }
        else if (num == 2) {
            car = new Peugeot208(x, genState(x));
        }
        else{
            car = new Car(0);
        }
        return car;
    }
}


class sortByFuelCons implements Comparator<Car> {
    public int compare(Car a, Car b) {
        if(a.getFuelCons() < b.getFuelCons()) return -1;
        if(a.getFuelCons() == b.getFuelCons()) return 0;
        else return  1;
    }
}
