package BT;


import java.util.*;

public class TimGiaTriNhoNhat {
    public static void main(String[] args) {
        int[] arr = {5, 9, 8, 12, 3, 10};

        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        for (int num : arr) {
            treeMap.put(num, 0);
        }
        Map.Entry<Integer, Integer> minValue =  treeMap.firstEntry();
        System.out.printf("Giá trị %s là giá trị nhỏ nhất trong dãy", minValue);
    }
}

