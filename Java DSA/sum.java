import java.util.*;
public class sum{

    static int tot(int arr[])
    {
        int t =0;
        for(int i=0;i<arr.length;i++)
        {
            t = t + arr[i];
        }
        return t;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter elements :");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = scn.nextInt();
        }
        System.out.println("Sum is = "+ tot(arr) );
    }
}