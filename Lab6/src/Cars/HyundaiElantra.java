package Cars;

public class HyundaiElantra extends Car {
    private static final String name = "Hyundai Elantra";

    public HyundaiElantra(int year, double state) {
        super(year, state, 200, 6.6, 24500);
        //System.out.println(this.maxSpeed);
    }
    public String getName() {
        return name;
    }
}
