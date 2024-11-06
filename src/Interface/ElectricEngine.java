package Interface;

public class ElectricEngine implements Engine, Music{
    @Override
    public void start() {
        System.out.println("I start Like Electric Engine");
    }

    @Override
    public void stop() {
        System.out.println("I stop like Electric Engine");
    }

    @Override
    public void acc() {
        System.out.println("I accelerate like electric Engine");
    }


}
