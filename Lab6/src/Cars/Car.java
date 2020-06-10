package Cars;

public class Car {

    public static int wheelsQ = 4;
    private String name;
    private int priceNew;
    private int year;
    private double state;
    private double priceK;
    private double price;
    private double maxSpeed;
    private double fuelCons;
    private boolean err = false;


    public Car(int year, double state, int maxSpeed, double fuelCons, int priceNew){
        this.priceNew = priceNew;
        this.year = year;
        this.state = state;
        this.priceK = (float) this.year/2019 * (float) this.year/2019 * state;
        this.maxSpeed = maxSpeed * Math.pow(state, 0.2);
        this.fuelCons = fuelCons / Math.pow(state, 0.15);
        if(priceK != 0) {
            this.price = priceNew * priceK;
        }
        else {
            this.price = priceNew * 0.05;
        }
    }

    public Car(int i){
        if(i == 0) {this.err = true;}
    }

    public double getPrice() {
        return this.price;
    }

    public int getYear() {
        return this.year;
    }

    public double getState() {
        return this.state;
    }

    public double getMaxSpeed() {
        return this.maxSpeed;
    }

    public String getName() {
        return this.name;
    }

    public double getFuelCons(){
        return this.fuelCons;
    }
}
