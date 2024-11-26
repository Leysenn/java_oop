package JavaBasic.textblock;

import java.util.Scanner;


/***
 * <p>Hello</p>
 * <a href="https://google.com">Hello</a>
 * <img src="https://cdn.thewirecutter.com/wp-content/media/2024/07/laptopstopicpage-2048px-3685-2x1-1.jpg?width=2048&quality=75&crop=2:1&auto=webp"/>
 * */
public class TextBlock {
    public static void main(String[] args) {
        System.out.println(""" 
                
                1. Start 
                2. Stop 
                3. Search
                4. Sort
                5. Exit
                """);
        System.out.println("========".repeat(10));
        System.out.println("[+] Insert option :");
        int opt = new Scanner(System.in).nextInt();
        if(opt<0){
            System.out.println("[!] Invalid option");
        }else {
            switch (opt){
                case 1-> System.out.println("This is option 1");
                case 2-> System.out.println("This is option 2");
                case 3-> System.out.println("This is option 3");
                case 4-> System.out.println("This is option 4");
                default -> System.out.println("No option ");
            }

        }
    }
}
