package Days.Day14;

import java.util.*;

public class HashMapImp {
    public static void main(String[] args) {
        HashMap<String, Integer> Map = new HashMap<>();
        Map.put("One", 1);
        Map.put("Two", 2);
        Map.put("Three", 3);
        Map.put("Four", 4);
        Map.put("Five", 5);
        System.out.println(Map);
        System.out.println(Map.get("One"));
        System.out.println(Map.get("Two"));
        System.out.println(Map.get("Three"));
        System.out.println(Map.get("Four"));
        System.out.println(Map.get("Five"));
        System.out.println(Map.get("Six"));
        System.out.println(Map.get("Seven"));
        System.out.println(Map.get("Eight"));
        System.out.println(Map.get("Nine"));
        System.out.println(Map.get("Ten"));
    }
}
