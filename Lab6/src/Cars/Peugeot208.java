package Cars;

public class Peugeot208 extends Car {
    private static final String name = "Peugeot 208";

    public Peugeot208(int year, double state) {
        super(year, state, 175, 4.7, 15000);
    }

    public String getName() {
        return name;
    }

}
