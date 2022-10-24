package Part1_Coding;public class Task003 {
    public static void main(String[] args) {
        Truck truck=new Truck(30000,1900);
        truck.calculateSalePrice(30000);
        Sedan sedan=new Sedan(50000,15);
        sedan.calculateSalePrice(50000);


    }
}
class Car {
    double carPrice;
    String color;

    public Car(double carPrice) {
        this.carPrice=carPrice;
    }

    public double calculateSalePrice() {

        return 0;
    }

}
class Truck extends Car {
    double weight;

    public Truck(double carPrice, double weight) {
        super(carPrice);
        this.weight = weight;
    }

    public double calculateSalePrice(double carPrice) {
        if (weight > 2000) {
            System.out.println(carPrice - (carPrice * 0.1));
        } else {
            System.out.println(carPrice - (carPrice * 0.2));

        }
        return carPrice;
    }
}


class Sedan extends Car {
    double length;

    public Sedan(double carPrice, double length) {
        super(carPrice);
        this.length = length;
    }

    public double calculateSalePrice(double carPrice) {

        if (length > 20) {
            System.out.println(carPrice - (carPrice * 0.05));
        } else {
            System.out.println(carPrice - (carPrice * 0.1));
        }
        return carPrice;
    }
}
