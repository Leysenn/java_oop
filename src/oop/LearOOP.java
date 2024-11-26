package oop;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class Student{
    int id ;
    String name;
    String gender;
    List<String> phoneNumbers;

    @Override
    public String toString() {
        return "Student" + '\n' +
                "Input Your ID of student:" + id + '\n' +
                "Input Your Name of student:" + name + '\n' +
                "Input Your Gender of student:" + gender + '\n' +
                "Input Your PhoneNumber of student" + phoneNumbers
                ;
    }
}

class Teacher{
    int id;
    String name;
    String gender;
    List<String> subject = new ArrayList<>(
            List.of("Math", "Physic","Geography","Khmer")
    );
    List<Student > students= new ArrayList<>();

    @Override
    public String toString() {
        return "Teacher" +
                "Input  ID of Teacher:" + id + '\n' +
                "Input  Name  of Teacher:" + name + '\n' +
                "Input  Gender of Teacher:" + gender + '\n' +
                "Input Your Subject " + subject + '\n' +
                "Subject :" + '\n' + students
                ;
    }
}


public class LearOOP {


    public static void main(String[] args) {
        Student student1 = new Student();
        student1.id=1;
        System.out.print("Input Your name:");
        student1.name=new Scanner(System.in).next();
        System.out.print("Input Your gender:");
        student1.gender=new Scanner(System.in).next();
        student1.phoneNumbers= new ArrayList<>(
                List.of("098765621","087755147")
        );


        Teacher teacher= new Teacher();
        teacher.id=new Random().nextInt(9999);
        System.out.print("Input Your Teacher name:");
        teacher.name=new Scanner(System.in).next();
        System.out.print("Input Your Teacher gender: ");
        teacher.gender=new Scanner(System.in).next();
        teacher.students.add(student1);
        System.out.println(teacher);

//        System.out.println("Input your ID   :" +student1.id);
//        System.out.println("Input your Name :" + student1.name);
//        System.out.println("Input your Gender:" + student1.gender);
//        System.out.println("Input Your phone Numbers :"+student1.phoneNumbers);
    }
}
