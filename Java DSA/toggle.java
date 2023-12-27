import java.util.*;

public class toggle{

    static void TOGGLE(StringBuilder S)
    {
        for(int i=0;i<S.length();i++)
        {
            char ch = S.charAt(i);
            if(ch == ' ') continue;
            int ascii = (int)ch;
            boolean flag=true;

            if(ascii>=97) flag=false;

            if(flag==true)
            {
                ascii = ascii + 32;
                char dh = (char)ascii;
                S.setCharAt(i,dh);
            }
            else
            {
                ascii = ascii-32;
                char dh = (char)ascii;
                S.setCharAt(i,dh);
            }
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter string : ");
        StringBuilder sb = new StringBuilder(scn.nextLine());

        System.out.println("Toggle the string -->");
        TOGGLE(sb);
        System.out.println(sb);
        scn.close();
    }
}
