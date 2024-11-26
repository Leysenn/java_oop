package model;


import java.util.ArrayList;
import java.util.List;

public class Test {
    public int id;
    public String name;
    public String email;

    public Test(int uId,String uName,String uEmail){
        id= uId;
        name=uName;
        email=uEmail;
    }
    List<Test> tests = new ArrayList<>();


    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
