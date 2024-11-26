package oop.encapsulation;

public class Person {
    private  int id;
    private  String name;
    private  String age;

    public void setId(int id){
        this.id = id;
    }
    public void setName(String  name){
        this.name= name;
    }
    public void setAge(String age){
        this.age= age;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getAge(){
        return age;
    }

//    @Override
//    public String toString() {
//        return "Person{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", age='" + age + '\'' +
//                '}';
//    }


}
