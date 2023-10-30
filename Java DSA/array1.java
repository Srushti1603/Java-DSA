import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String name[] = new String[5];
        for(int i=0;i<name.length;i++)
        {
            System.out.println("Enter Your Name:");
            name[i] = scn.nextLine();
        }

        System.out.println("***************");
        System.out.println("Names in list are :");
        for(int i=0;i<name.length;i++)
        {
            System.out.println(name[i]);
        }
        scn.close();
    }
}
