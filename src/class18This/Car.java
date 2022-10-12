package class18;

public class Car {
    // COMMON Class has different name like:ParentClass, SuperClass, BaseClass
    String model;
    String make;
    int year;
    String color;
    int topSpeed;
    double price;

    //if a field or methods has private access modifier in parent class, child class can't use it
    private String engineType;

    void printCarDetails() {
        System.out.println("Model " + model + " Make " + make + " color " + color);


    }
}

// these are DerivedClass or ChildClass

    class BMW extends Car {
        double engineCC;


        // String model;
        // String make;
        // int year;
        //  String color;
        // int topSpeed;
        //  double price;

    }

    class Tesla extends Car {
        //  String model;
        //   String make;
        //   int year;
        //   String color;
        //   int topSpeed;
        //   double price;


    }

    class Toyota extends Car {
        //  String model;
        // String make;
        // int year;
        // String color;
        // int topSpeed;
        // double price;
        double engineCC;
        // we need to use inheritance, that's why we call it a parent class => Car,
        // we do NOT NEED then the to repeat for each class the
    }

    class CarTester {
        public static void main(String[] args) {
            BMW bmw = new BMW();
            bmw.make="BMW";
            bmw.color = "Black";
            bmw.model = "x8";
            bmw.engineCC=200;
            bmw.printCarDetails();
        }
    }



