package oop.encapsulation;



public class User {
    private int id;
    private String name;
    private String email;
    private String password;

    public void setId(int id){
        this.id= id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email){
        this.email= email;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }

    @Override
    public String toString() {
        return  "==============Encapsulation==========="+ '\n'+
                "User of Id   :" + id + '\n'+
                "User of name :'" + name + '\n' +
                "User of email:'" +email + '\n' +
                "User password:'" + password + '\n'+
                "======================================="
                ;
    }

    public static void main(String[] args) {
        User user= new User();
        user.setId(1);
        user.setName("Bona");
        user.setEmail("Bona123@gmail.com");
        user.setPassword("12345678");
//        System.out.println(user.getId());
//        System.out.println(user.getName());
//        System.out.println(user.getEmail());
//        System.out.println(user.getPassword());
        System.out.println(user);

    }
}
