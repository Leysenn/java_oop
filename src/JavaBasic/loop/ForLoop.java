package JavaBasic.loop;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        System.out.print("Insert number ");
        int a = new Scanner(System.in).nextInt();
        int sum = 0;
        for(int i=0;i<a;i++){
            System.out.print((i+1));
            if((i+1) !=a){
                System.out.print(" + ");
            }else {
                System.out.print(" = ");
            }
            sum = sum+ (i+1);
        }
        System.out.println(sum);
    }
}
