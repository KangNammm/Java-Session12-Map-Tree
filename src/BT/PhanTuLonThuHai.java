package BT;


import java.util.Map;
import java.util.TreeMap;

public class PhanTuLonThuHai {

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 12, 3, 10};

        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        for (int num : arr) {
            treeMap.put(num, 0);
        }

        int maxKey = treeMap.lastKey();
        treeMap.remove(maxKey);

        if (treeMap.isEmpty()) {
            System.out.println("Không có phần tử lớn thứ hai trong mảng.");
        } else {
            int secondLargest = treeMap.lastKey();
            System.out.println("Phần tử lớn thứ hai trong mảng là: " + secondLargest);
        }
    }
}

