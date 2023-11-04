import java.util.Scanner;

public class twoDi {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Number Of Rows And Column");
        int rows = scn.nextInt();
        int colm = scn.nextInt();
        int arr[][] = new int[rows][colm];
        System.out.println("Enter Elements in 2D Array");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<colm;j++)
            {
                arr[i][j] = scn.nextInt();
            }
        }
        System.out.println("Elements in Array are  -->");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
