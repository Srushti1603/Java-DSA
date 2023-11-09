import java.util.*;

public class TwoPointer {
    public static void reverseArray(int arr[]) 
    {
        int start = 0;
        int end = arr.length - 1;

        while(start<end)
        {
            swap(arr,start,end);
            start++;
            end--;
        }
    }

    public static void swap(int arr[],int start,int end)
    {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {2,4,1,6,7};
        System.out.println("This is array before swap --> " +Arrays.toString(arr));
        reverseArray(arr);
        System.out.println("This is array after swap --> " +Arrays.toString(arr));
    }
}