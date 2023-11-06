import java.util.Scanner;

public class strmethod {
    static void lbl(String name)
    {
        for(int i=0;i<name.length();i++)
        {
             System.out.println(name.charAt(i));
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Your Full Name");
        String name = scn.nextLine();
        System.out.println("******Various Methods On String******");
        System.out.println("Length is " +name.length());
        System.out.println("String in lower case " +name.toLowerCase());
        System.out.println("String in upper case " +name.toUpperCase());
        System.out.println("Check wether the string is null or not? " +name.isEmpty());
        System.out.println("Print Letter By Letter -->");
        lbl(name);

        scn.close();
    }
}
