class Vehicle{
    private String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public String getBrand(){
        return brand;
    }

    public void drive(){
        System.out.println("The vehicle is moving");
    }
}

class Car extends Vehicle {
    private int doors;

    public Car(String brand, int doors){
        super(brand);
        this.doors = doors;
    }

    @Override
    public void drive(){
        System.out.println(getBrand()+"car with"+ doors+"doors is driving");

    }
}

public class Example2{
    public static void main(String[] args) {
        Vehicle myCar = new Car("Toyota", 4);
        myCar.drive();
    }
}
