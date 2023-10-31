import java.util.*;
public class reverse{

    static void rev(int arr[])
    {
        int k;
        int i =0;
        int j = (arr.length-1);
        while(i<j)
        {
            k= arr[i];
            arr[i]=arr[j];
            arr[j]=k;
            i++;
            j--; 
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter elements :");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = scn.nextInt();
        }
        System.out.println("Elements are");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

        System.out.println("By Reversing:");
        rev(arr);
         for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}