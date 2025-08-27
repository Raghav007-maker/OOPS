package Interfaces;

public class main {
    public static void main(String[] args) {
        Car car=new Car();
        // car.start();
        // car.stop();
        // car.acc();

        Engine obj=new Car();
        obj.stop();
        System.out.println(obj.a);

        media obj2=new Car();
        obj2.stop();//I Stop Like A Normal Car
        // Here is the Problem that stop() must work differently for Engine and media so What to doo here ...
        // here we can create separate class for each Section and override accordingly
        
        
        NiceCar obj3=new NiceCar();
        obj3.start();
        obj3.startmusic();
        obj3.ChangeEngine();
        obj3.start();
    }
}
