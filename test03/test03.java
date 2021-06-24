import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> carList = new ArrayList<>();
        carList.add(new Car("Toyota", "Prius", 1997));
        carList.add(new Car("Volkswagen", "The Beetle", 2011));
        carList.add(new Car("Fiat", "Fiat 500X", 2015));

        Collections.sort(carList, new Comparator<Car>() {
            public int compare(Car carFirst, Car carSecond) {
                return Integer.compare(carFirst.getYear(),carSecond.getYear());
            }
    });
    System.out.println("Sorted list : " + carList);

    }
}