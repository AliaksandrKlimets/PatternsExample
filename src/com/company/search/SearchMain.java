package com.company.search;


import java.util.*;

public class SearchMain {
    static int iter = 0;

    public static void main(String[] args) {
//        iter = 0;
//        System.out.println(binarySearch(createArray(100000), -1));
//        System.out.println(iter);
//        System.out.println(result(4, Arrays.asList(1L, 2L,3L)));
//        System.out.println(1 + Arrays.asList(1,2,3).subList(0,0).toString());
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(new ArrayList<Integer>(){{ add(1); add(1); add(0); add(0); add(0); }});
        arr.add(new ArrayList<Integer>(){{ add(0); add(1); add(1); add(0); add(0); }});
        arr.add(new ArrayList<Integer>(){{ add(0); add(0); add(1); add(0); add(1); }});
        arr.add(new ArrayList<Integer>(){{ add(1); add(0); add(0); add(0); add(1); }});
        arr.add(new ArrayList<Integer>(){{ add(0); add(1); add(0); add(1); add(1); }});
        System.out.println(arr);
        connectedCell(arr);
        System.out.println(arr);
    }

    public static int connectedCell(List<List<Integer>> matrix) {
        // Write your code here
        int res = 0;
        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.get(0).size(); j++) {
                if (matrix.get(i).get(j) > 0) {
                    int maxVal = 0;
                    if (i != 0 && j == 0) {
                        maxVal = matrix.get(i - 1).get(j);
                    } else if (j != 0 && i == 0) {
                        maxVal = matrix.get(i).get(j - 1);
                    } else if (i != 0 && j != 0) {
                        int up = matrix.get(i - 1).get(j);
                        int left = matrix.get(i).get(j - 1);
                        maxVal = Math.max(up, left);
                    }
                    matrix.get(i).set(j, maxVal + 1);
                    res = Math.max(res, maxVal + 1);
                }
            }
        }
        return res;
    }

    private static Map<String, Long> map = new HashMap<>();

    public static long result(int n, List<Long> c) {
        if (map.containsKey(n + c.toString())) {
            return map.get(n + c.toString());
        }
        if (n == 0) return 1;
        if (c.isEmpty() || n < c.get(0)) return 0;
        long res = 0;
        while (n >= 0) {
            long a = result(n, c.subList(1, c.size()));
            res += a;
            map.put(n + c.subList(1, c.size()).toString(), a);
            n -= c.get(0);
        }
        return res;
    }

    static int[] createArray(int n) {
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = i+1;
        }
        return res;
    }

    public static int binarySearch(int[] arr, int elemToSearch) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            iter++;
            if (arr[middle] == elemToSearch) return middle;
            if (elemToSearch < arr[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return -1;
    }
}
