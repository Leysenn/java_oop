package JavaBasic.collectionFramework.map;


import java.util.*;

public class Exercise {
    static private  HashMap<Integer,String > usernames = new HashMap<>(

    );
    static void createUsername( String userNames){
//        int key = new Random().nextInt()
        new Random().nextInt();
        usernames.put(new Random().nextInt(),userNames);
    }
    static  void searchUsername(Integer key) {
        System.out.println("[+] Insert  number of key:");
        int n = new Scanner(System.in).nextInt();
        for (int i = 0; i < n; i++) {
           String na =  usernames.get(key);
            System.out.println(na);
        }

    }
    static void updateUsername(String  names) {
        System.out.println("[+] Insert number of key:");
        int key = new Scanner(System.in).nextInt();
        if (usernames.containsKey(key)) {
            System.out.println("[+] update number of key");
            String newUsername = new Scanner(System.in).nextLine();
            usernames.put(key, newUsername);
        }

    }
    static void deleteUserName( String name){
        System.out.println("[+] Insert key to delete:");
        int key = new Scanner(System.in).nextInt();
        usernames.remove(key);
        System.out.println("ALl elements after deleted in HashMap:");
        System.out.println(usernames);
    }

    public static void main(String[] args) {
        while (true){
            System.out.println("==========Application=========");
            System.out.println("""
                    1. Create UserName
                    2. Update UserName
                    3. Search UserName
                    4. Delete UserName
                    5. Exit
                    """);
            System.out.println("=".repeat(30));
            System.out.println("Choose option :");
            int number = new Scanner(System.in).nextInt();
            switch (number){
                case 1->{
                    System.out.println("Create Username :");
                    String name = new Scanner(System.in).nextLine();
                    createUsername(name);
                    break;
                }
                case 2->{
                    System.out.println("Update UserName of key :");
                    String oldKey = new Scanner(System.in).nextLine();
                    updateUsername(oldKey);
                    break;
                }
                case 3->{
                    System.out.println("[+] Search number of username:");
                    int n   =new Scanner(System.in).nextInt();
                    searchUsername(n);
                }
                case 4->{
                    System.out.println("[+] Delete number of username;");
                    String delete = new Scanner(System.in).nextLine();
                    deleteUserName(delete);
                }
                case 5->{
                    System.out.println("See you again:");
                    System.exit(0);
                }
            }

        }
    }
}
