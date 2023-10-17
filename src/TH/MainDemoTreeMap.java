package TH;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class MainDemoTreeMap {
    public static void main(String[] args) {
        Comparator comparator = new StudentComparator();
        Map<DemoTreeMap, DemoTreeMap> studentMap = new TreeMap<>(comparator);

        DemoTreeMap demo1 = new DemoTreeMap(1);
        DemoTreeMap demo2 = new DemoTreeMap(2);
    }
}
