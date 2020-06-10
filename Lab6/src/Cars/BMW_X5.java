package Cars;

public class BMW_X5 extends Car {
    private static final String name = "BMW X5";

    public BMW_X5(int year, double state) {
        super(year, state, 250, 8.3, 92000);
    }

    public String getName() {
        return name;
    }
}
