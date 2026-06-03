package org.example;

public class Vehicle {
    protected String colour;
   public void  sound (){
       System.out.println("Vehicle sound");
    }

    Vehicle (){
        System.out.println("Vehicl class constructer");
    }

}
class Car extends Vehicle {

    Car (){
        super();
        System.out.println("Car Class constructer");
    }
    int model ;
    public void  sound (){
        super.colour = "Blue";

        System.out.println(super.colour);
        System.out.println("car sound");
        super.sound();
    }
    public static void main() {
      //  Vehicle vehicle = new Vehicle();
        Car car = new Car();
//        car.model = 2022;
//        car.colour  = "Red";
//        System.out.println(car.colour);
//        System.out.println(car.model);
        car.sound();
        //vehicle.sound();

    }

}


// if we don't want to inherit the parent claas then use Modifier Final