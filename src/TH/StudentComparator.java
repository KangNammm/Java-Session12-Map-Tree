package TH;

import java.util.Comparator;

public class StudentComparator implements Comparator<DemoTreeMap> {
    public int compare(DemoTreeMap s1, DemoTreeMap s2) {
        return s1.getId() - s2.getId();
    }
}
