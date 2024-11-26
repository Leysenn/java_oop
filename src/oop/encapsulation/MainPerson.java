package oop.encapsulation;

public class MainPerson {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setId(1);
        person1.setName("Dara");
        person1.setAge("19");
        System.out.println("=============== Encapsulation =============");
        System.out.println(" Id of person  :" +person1.getId());
        System.out.println(" Name of person:" +person1.getName());
        System.out.println("Age of person :" +person1.getAge());
        System.out.println("===========================================");
    }
}
