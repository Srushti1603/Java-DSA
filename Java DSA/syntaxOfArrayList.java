import java.util.ArrayList;

public class syntaxOfArrayList{
    public static void main(String[] args) {
        //Declaration
        ArrayList<Integer> list = new ArrayList<>();
        //Display
        System.out.println(list);
        //Size
        System.out.println(list.size());
        //Adding element in array list
        list.add(10);
        list.add(20);
        list.add(30);
        //Printing using loop
        System.out.println("Print using loop-->");
        for(Integer val: list)
        {
            System.out.println(val);
        }

        //Get method
        System.out.println("Get Method-->");
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }

        //Set Method
        System.out.println("Set Method-->");
        list.set(2,50);
         for(Integer val: list)
        {
            System.out.println(val);
        }

        //Remove
        System.out.println("Remove Method-->");
        list.remove(2);
        System.out.println(list);

        //Contains
        System.out.println("Contains Method-->");
        System.out.println(list.contains(100));
    }
}