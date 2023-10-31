import java.util.*;
public class maximum{ 
    static int max(int a[])
    {
        int max = a[0];
        for(int i =1;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max = a[i];
            }
        }

        return max;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter elements in Array:");
        for(int i =0;i<arr.length;i++)
        {
           arr[i] = scn.nextInt();
        }
        System.out.println("Greatest in:");
        System.out.println(max(arr));
    }
}