package AbstractClasses;


public abstract class Vehicle{
    int a=10; //We can create normal ionstances
    static int b=20; //We can create normal static ionstances

    public Vehicle(){
        System.out.println("Vehicle as parent");
    }//We can create constructors

    void message(){
        System.out.println("Nomral mesaage from Vehicle");
    }//We can create normal methods

    static void message2(){
        System.out.println("Nomral static mesaage from Vehicle");
    }
    abstract void start(); //Creating abstract methods and using it in child classes
    abstract void stop(); //Creating abstract methods and using it in child classes
}

abstract class bike extends Vehicle{
    abstract void bikers();
}

class Car extends bike{

    Car(){
        System.out.println("Constructor Chaining");
    }

    @Override
    void start() {
        System.out.println("Abstract Method");
    }

    @Override
    void stop() {
        System.out.println("Abstract Method");
    }
    
    @Override
    void bikers() {
        System.out.println("Abstract Method from extended class of Vehicle");
        
    }

    public static void main(String[] args) {
        Car car=new Car();
        // Vehicle vehicle=new Vehicle(); Cannot create abstract class object..
        car.start(); 
        car.stop();
        car.bikers();
        car.message(); 
        Vehicle.message2(); 
        Car.message2();
        bike.message2();
        System.out.println(car.a);
        System.out.println(Vehicle.b);
    }
} 