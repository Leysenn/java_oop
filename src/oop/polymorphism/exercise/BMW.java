package oop.polymorphism.exercise;

public class BMW extends Car{
    @Override
    public void speedUp() {
        System.out.println("BMW speedUp");
    }

    @Override
    public void slowDown() {
        System.out.println("BMW slowDown");
    }
}
