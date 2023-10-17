package BT;


import java.util.HashMap;

public class DemSoLan {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 3, 2, 1000};

        // Khởi tạo HashMap để lưu trữ kết quả
        HashMap<Integer, Integer> countMap = new HashMap<>();

        // Đếm số lần xuất hiện của mỗi phần tử trong mảng
        for (int i : array) {
            if (countMap.containsKey(i)) {
                countMap.put(i, countMap.get(i) + 1);
            } else {
                countMap.put(i, 1);
            }
        }

        // In kết quả ra màn hình
        for (int key : countMap.keySet()) {
            System.out.println("Phần tử " + key + " xuất hiện " + countMap.get(key) + " lần");
        }
    }
}

