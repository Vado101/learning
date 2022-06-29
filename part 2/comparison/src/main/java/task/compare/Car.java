package task.compare;

public class Car implements Comparable<Car> {

	private final int id;
	private final String brand;
	private String owner;
	private int mileage;

	public Car(int id, String brand) {
		this.id = id;
		this.brand = brand;
	}

	public Car(int id, String brand, String owner, int mileage) {
		this(id, brand);
		setOwner(owner);
		setMileage(mileage);
	}

	public int getId() {
		return id;
	}

	public String getBrand() {
		return brand;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	@Override
	public int compareTo(Car anotherCar) {
		return this.id - anotherCar.id;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Car)) return false;

		Car car = (Car) o;

		if (this.id != car.id) return false;
		if (brand != null ? !brand.equals(car.brand) : car.brand != null) 
			return false;
		if (owner != null ? !owner.equals(car.owner) : car.owner != null) 
			return false;
		return mileage == car.mileage;
	}

	@Override
	public int hashCode() {
		int result = id;
		result = 31 * result + (brand != null ? brand.hashCode() : 0);
		result = 31 * result + (owner != null ? owner.hashCode() : 0);
		return 31 * result + mileage;
	}

	@Override
	public String toString() {
		return "Car {id=" + id +
		", brand=" + brand +
		", owner=" + owner +
		", mileage=" + mileage + "}";
	}
}