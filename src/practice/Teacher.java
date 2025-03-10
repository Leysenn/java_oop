package practice;

public class Teacher extends Student{
   int  age;

    public Teacher(int id, String name, int age) {
        super(id, name);
        this.age = age;
    }

    public void displayTeacher(){
        display();
        System.out.println("age"+age);
    }


}
