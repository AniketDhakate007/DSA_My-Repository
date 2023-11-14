package OOP;

import java.awt.*;
//INHERITANCE
public class Vehicle {
    String name;
    float weight;
    String EngineType;
    int hp;
    void DisplayInfo(){
        System.out.println("Name of Vehicle: "+name+"\n"+"Weight in kilograms: "+weight+"\n"+"Engine: "+EngineType+"\n"+"max Horsepower: "+hp);
    }

}
class Bike extends Vehicle{
    public static void main(String[] args) {
        Bike REHimalyan=new Bike();
        REHimalyan.name="ROYAl Enfield: Himalyan";
        REHimalyan.weight=200;
        REHimalyan.EngineType="Petrol";
        REHimalyan.hp=25;

        REHimalyan.DisplayInfo();
//        .
//        ,
//        ,
//        ,
//
//        new object bike n
    }
}

class Car extends Vehicle{
    public static void main(String[] args) {
        Car BMWM5Comp;

        BMWM5Comp = new Car();
        BMWM5Comp.name="BMW M5 Competition";
        BMWM5Comp.weight=2000;
        BMWM5Comp.EngineType="petrol";
        BMWM5Comp.hp=650;

        BMWM5Comp.DisplayInfo();
//        .
//        .
//        ..
//        . n cars
    }
}

//similiarly trucks and busses etc,