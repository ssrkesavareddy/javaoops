package oops;

class Vehicle {
    String color;
    double mileage;
    double price;

    void display() {
        System.out.println("price: " + price);
        System.out.println("color: " + color);
        System.out.println("mileage: " + mileage);
    }
}

class Car extends Vehicle {
    String brand;
    boolean sunroof;
    String ftype;

    void show() {
        System.out.println("brand: " + brand);
        System.out.println("sunroof: " + sunroof);
        System.out.println("ftype: " + ftype);
    }
}

public class inhertance {
    public static void main(String[] args) {
        Vehicle obj = new Vehicle(); // Used to access obj of Vehicle
        Car obj2 = new Car(); // It can access both obj of Car and Vehicle due to inheritance
        Vehicle obj3 = new Car();

        if (obj3 instanceof Car) {
            Car carObj3 = (Car) obj3;
            carObj3.show();
        }
    }
}

