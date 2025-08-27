package Interfaces;

public class NiceCar {
    private Engine engine;

    private media player=new CD_Player();

    public NiceCar(){
        engine=new ElectricalEngine();
    }

    public NiceCar(Engine engine){
        this.engine=engine;
    }

    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }

    public void startmusic(){
        player.start();     
           
    }
    public void stopmusic(){
        player.stop();        
    }
    public void ChangeEngine(){
        this.engine=new PowerEngine();
    }
}
