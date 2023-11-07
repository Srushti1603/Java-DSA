import java.util.HashMap;

public class hash{

    public static int maxFreqn(int[] arr){
        int maxFreqn =0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int nums : arr) {
            if (map.containsKey(nums)) {
                // If the key is already present
                map.put(nums, map.get(nums)+1);
            }else{
                // 1st time
                map.put(nums, 1);
            }

            if (map.get(nums)>maxFreqn) {
                maxFreqn = map.get(nums);
            }
        }

        return maxFreqn;
    }


    public static int maxFreqnPartTwo(int[] arr){
        int maxFreqn = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int nums : arr) {
        
            map.put(nums, map.getOrDefault(nums, 0)+1);

            if (map.get(nums)>maxFreqn) {
                maxFreqn = map.get(nums);
            }
        }

        return maxFreqn;
    }


    public static void main(String[] args) {
        int arr[] = {2,12,11,12,21,10,12,9};
        System.out.println(maxFreqnPartTwo(arr));
    }
}