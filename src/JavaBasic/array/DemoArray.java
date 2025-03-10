package JavaBasic.array;

public class DemoArray {
    public static void main(String[] args) {
        String[] stringArray = new  String[5];
         stringArray[0] = "Web";
         stringArray[1]="Mobile";
        stringArray[2] = "Flutter";
        stringArray[3]="Spring";
        stringArray[4] = "Front End";
        System.out.println("Input Array :");
        for(int i=0;i<stringArray.length;i++) {
            System.out.println(stringArray[i]);
        }

    }
}
