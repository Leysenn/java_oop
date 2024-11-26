package oop.inheritance;

public class Teacher extends Person{
    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id + '\n'+
                "name='" + name + '\n' +
                " email='" + email + '\n' +
                '}';
    }

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.id= 1;
        teacher.name= "Dara";
//        teacher.email= "Dara123@gmail.com";
        teacher.getName();
        teacher.getId();
        System.out.println(teacher);

    }
}
