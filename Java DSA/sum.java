import java.util.*;

public class sum {
    public static ArrayList<Integer> SumOfEven(ArrayList<Integer> list)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        for(Integer val : list)
        {
            if(val%2==0)
            {
                ans.add(val);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,1));
        ArrayList<Integer> ans = SumOfEven(al);
        System.out.println(ans);
    }
}
