package oop.polymorphism.exercise;

public class Main {

    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("=             SPeed of Car               =");
        System.out.println("==========================================");
        Car bmw = new BMW();
        Car ford = new Ford();
        bmw.speedUp();
        bmw.slowDown();
        ford.speedUp();
        ford.slowDown();
        System.out.println("===========================================");
    }
}
