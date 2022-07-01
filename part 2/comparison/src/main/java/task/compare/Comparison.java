package task.compare;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Comparison {

	public static void main(String[] args) {
		Car car_1 = new Car(100, "Mitsubishi", "Petrov", 20000);
		Car car_2 = new Car(1, "Volvo", "Sidorov", 20010);

		if (car_1.equals(car_2)) {
			System.out.println("equals: OK");
		}

		if (car_1.hashCode() == car_2.hashCode()) {
			System.out.println("hashCode: OK");
		}

		if (car_1.compareTo(car_2) == 0) {
			System.out.println("compareTo: OK");
		}


		List<Car> cars = new ArrayList<>();
		cars.add(car_1);
		cars.add(car_2);
		System.out.println("before sort: \n" + cars);
		Collections.sort(cars, new Car.BrandComparator());
		System.out.println("arter sort: \n" + cars);
	}
}