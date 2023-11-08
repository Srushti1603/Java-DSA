import java.util.*;

public class hashset
{
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        //Inserting Element in Hash Set

        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");

        System.out.println("Elements in HashSet --> "+set);
        System.out.println("Size of Hash Set is "+set.size());
        //Contains value or not

        if(set.contains("Banana"))
        {
            System.out.println("It is present");
        }

        //Removing Element From Set

        set.remove("Banana");
        System.out.println("Elements in HashSet --> "+set);
        System.out.println("Size of Hash Set is "+set.size());
    }
}