package Abstraction;

public abstract class Auto {
    String name;
    String model;

    public void startEngine(){
        System.out.println("The engine started");
    }

    public abstract void speedUp();


}
