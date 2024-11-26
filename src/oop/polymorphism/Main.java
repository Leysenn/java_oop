package oop.polymorphism;

public class Main {
    public static void main(String[] args) {
        MathHelper mathHelper = new MathHelper();
        System.out.println("The result of Integer:"+mathHelper.sum(1,2));
        System.out.printf("The result of Double: %.2f",mathHelper.sum(2.3,3.4));
    }
}
