package JavaBasic.collectionFramework.list.Arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class arrayListString {
    public static void main(String[] args) {
//        ArrayList<String> userName = new ArrayList<>( List.of("Sok", "Dara","Bora","Tola"));
//
//
//        System.out.println("search name :");
//        String name= new Scanner(System.in).nextLine();
//        for (String n : userName) {
//            if (name.equalsIgnoreCase(n)) {
//                System.out.println(n);
//            }
//        }
//
//        System.out.println("Press enter to continue");
//        new Scanner(System.in).nextLine();
//        // update
//        int i=0;
//        for (String n : userName){
//            System.out.println(i+ ". " +n);
//            i++;
//        }
//        System.out.print("Insert User1 index");
//        int index = new Scanner(System.in).nextInt();
//        for (String n : userName){
//            if(index>userName.size()){
//                System.out.println("index must be less than list size");
//
//            }else {
//                System.out.println("Insert new name :");
//                String newName = new Scanner(System.in).nextLine();
//                userName.set(index,newName);
//            }
//            break;
//
//        }
////        arrayList.remove(index);
////        for (String n : arrayList) {
////            if (index>arrayList.size()) {
////                System.out.println("Remove index must be less than list size:");
////                break;
////            }else {
////                System.out.println("Remove Success");
////            }
////            break;
////        }
//
//
//        userName.forEach(e-> System.out.println(e));

                List<String> userNames = new ArrayList<>(
                        List.of("KoKo","Kaka","James","Pi")
                );
                System.out.print("[+] Insert name to search: ");
                String name = new Scanner(System.in).nextLine();
                for(String n: userNames){
                    if(name.equalsIgnoreCase(n)){
                        System.out.println(n);
                    }
                }
                System.out.print(">> Press enter to continue");
                new Scanner(System.in).nextLine();
                // update
                int i=0;
                for(String n: userNames){
                    System.out.println(i+ ". " + n);
                    i++;
                }
                System.out.print("[+] Insert username index: ");
                int index = new Scanner(System.in).nextInt();
                for(String n: userNames){
                    if(index>userNames.size()){
                        System.out.println("[+] Index must be less than list size");
                    }else {
                          System.out.println("[+] Insert new name: ");
                        String newName = new Scanner(System.in).nextLine();
                        userNames.set(index,newName);
                    }
                    break;
                }
                userNames.forEach(e-> System.out.println(e));


    }

}