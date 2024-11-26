package oop.polymorphism.exercise;

public class Ford extends Car{
    @Override
    public void speedUp() {
        System.out.println("Ford SpeedUp");
    }

    @Override
    public void slowDown() {
        System.out.println("Ford SlowDown");
    }
}
