import java.util.HashMap;

public class hashMethods {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Srushti",02);
        map.put("Sanjana",13);
        map.put("Nupur",10);
        System.out.println(map);

        if(map.containsKey("Srushti"))
        {
            System.out.println("Srushti is present");
        }

        System.out.println(map.get("Sanjana"));
        System.out.println(map.remove("Sanjana"));
    }
}
