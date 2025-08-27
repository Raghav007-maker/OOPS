package Interfaces;

public class CD_Player implements media{

    @Override
    public void start() {
        System.out.println("Media Start");
    }

    @Override
    public void stop() {
        System.out.println("Media Stop");
    }
    
}
