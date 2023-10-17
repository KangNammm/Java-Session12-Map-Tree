package TH;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        // hashmap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Fi", 30);
        hashMap.put("Fi Doggy",31);
        hashMap.put("LewanDogFi",28);
        hashMap.put("Under the DogFi",29);
        System.out.println("Hiển thị các mục nhập trong Hashmap");
        System.out.println(hashMap + "\n");
        // tree map
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Hiển thị tree map");
        System.out.println(treeMap);
        // linkedHashMap
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Dogfi", 29);
        linkedHashMap.put("G DogFi", 30);
        linkedHashMap.put("Filili", 30);
        linkedHashMap.put("Filatop", 28);
        System.out.println("\nThe age for " + "Filili is " + linkedHashMap.get("Filili"));

    }
}
