package Interfaces;

public class ElectricalEngine implements Engine {
    
    @Override
    public void stop(){
        System.out.println("ElectricalEngine stops");
    }

    @Override
    public void start() {
        System.out.println("ElectricalEngine Starts");
    }

    @Override
    public void acc() {
        System.out.println("ElectricalEngine Acc");
    }
    
}
