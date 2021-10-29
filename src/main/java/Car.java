import java.util.Objects;

public class Car {
    private String brand;
    private int number;

    public Car (String brand, int number) {
        this.brand = brand;
        this.number = number;
    }

    public void setNumber (int number){
        this.number = number;
    }

    public String getBrand () {
        return brand;
    }

    public int getNumber () {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return number == car.number && Objects.equals(brand, car.brand);
    }

    @Override
    public int hashCode() {
        int result = 21;
        result = 31 * result + number;
        result = 31 * result + (brand == null ? 0 : brand.hashCode());
        return result;
    }


    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", number=" + number +
                '}';
    }
}
