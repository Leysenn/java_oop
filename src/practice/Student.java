package practice;

public class Student {
   int id;
   String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public void  display(){
        System.out.println("ID"+id);
        System.out.println("Name"+name);
    }
}
