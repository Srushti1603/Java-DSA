import java.util.*;
public class FindingSum {
    public static int[] twoPair(int arr[], int target) 
    {
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length-1;
        
        while(start<end)
        {
            int sum = arr[start] + arr[end];
            if(sum>target)
            {
               end--;
            }
            else if(sum<target)
            {
                start++;
            }
            else
            {
                return new int[] {arr[start],arr[end]};
            }
        }
        return null;
    }
 public static void main(String[] args)
 {
    int arr[] = {2,7,11,5};
    int arrAns[] = twoPair(arr, 9);
    System.out.println("Two pair is --> " +Arrays.toString(arrAns));
 }

}
