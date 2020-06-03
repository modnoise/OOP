import com.company.Car;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Car[] obj = new Car[3];

        obj[0] = new Car("Toyota", "RAV-4", 4, 280, "Japan");
        obj[1] = new Car("Reno", "Duster", 4, 290, "France");
        obj[2] = new Car("Tesla", "Energy", 2, 1421, "USA");

        Arrays.sort(obj, Car.dofComparator);
        System.out.println(Arrays.asList(obj) + "\n");

        Arrays.sort(obj, Car.stdComparator);
        System.out.println(Arrays.asList(obj));
    }
}
