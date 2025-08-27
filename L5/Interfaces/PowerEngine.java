package Interfaces;

public class PowerEngine implements Engine {
    
    @Override
    public void stop(){
        System.out.println("PowerEngine Stops");
    }

    @Override
    public void start() {
        System.out.println("PowerEngine Starts");
    }

    @Override
    public void acc() {
        System.out.println("PowerEngine Acc");
    }
    
}