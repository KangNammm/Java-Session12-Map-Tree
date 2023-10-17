package TH;

import java.util.HashMap;
import java.util.Map;

public class DemoMap {
    public static void main(String[] args) {
    Map<Integer, String> map = new HashMap<>();
        System.out.println(map.isEmpty() ? "Map rỗng" : "Map có dữ liệu");
        map.put(1,"1");
        map.put(2,"2");
        map.put(3,"3");
        map.put(4,"4");

        map.replace(1, "100");
        map.replace(5, "1000");
        map.remove(2);
        map.remove(1, "1");

    }
}
