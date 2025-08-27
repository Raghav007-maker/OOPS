package Interfaces;

public class Car implements Engine, brake, media {


    @Override
    public void start() {
        System.out.println("I start like a normal Car");
    }
    // interface does not care that the one function is declared on how many classes it will just override it

    @Override
    public void stop() {
        System.out.println("I Stop Like A Normal Car");
    }

    @Override
    public void acc() {
        System.out.println("I accelarate Like a normal Car");
    }

    @Override
    public void brake() {
        System.out.println("brakes Applied ");
    }

}
    

