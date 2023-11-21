import java.util.ArrayList;
import java.util.*;

public class removeDuplicate {
    public static ArrayList<Integer> removeDuplicateUsingAL(ArrayList<Integer> list)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        for(Integer val : list)
        {
            if(!ans.contains(val))
            {
                ans.add(val);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,1));
        ArrayList<Integer> ans = removeDuplicateUsingAL(al);
        System.out.println(ans);
    }
}
