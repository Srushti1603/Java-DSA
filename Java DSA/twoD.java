public class twoD{
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        arr[1][2]=3;
        for(int i =0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
