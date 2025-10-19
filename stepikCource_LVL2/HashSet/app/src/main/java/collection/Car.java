package collection;

public class Car {
    int number;
    public Car() { number = 0; };
    public Car(int number) { this.number = number; };


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        return number == car.number;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(number);
    }
    public int getId() {
        return number;
    }

}
