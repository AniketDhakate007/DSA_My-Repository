package OOP;

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
class Car extends Vehicle {
    Car(String name,int weight,String engine, int hp){
        this.name =name;
        this.EngineType=engine;
        this.weight=weight;
        this.hp=hp;
    }
}

class Bike extends Vehicle{
    Bike(String name,int weight,String engine, int hp){
        this.name =name;
        this.EngineType=engine;
        this.weight=weight;
        this.hp=hp;
    }
}
class Test{
    public static void main(String[] args) {
        Bike b1=new Bike("RE_GT650",250,"Petrol",56);
        b1.DisplayInfo();
        System.out.println();
        Car c=new Car("BMW_M5_CS650",2000,"Petrol",750);
        c.DisplayInfo();
    }
}
