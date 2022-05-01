package com.company.j8;

import java.util.Random;

public class J8Main {

    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        show(shuffle(arr));
    }

    private static int[] shuffle(int[] a) {
        Random random = new Random();
        int[] res = a.clone();
        for (int i = 0; i < res.length; i++) {
           swap(res, i, random.nextInt(res.length));
        }
        return res;
    }

    private static void swap(int[] arr, int i, int j) {
        int buff = arr[i];
        arr[i] = arr[j];
        arr[j] = buff;
    }

    public static int countPrimes(int n) {
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res += isPrime(i) ? 1 : 0;
        }
        return res;
    }

    public static boolean isPrime(int n) {
        if (n <= 3) return true;
        int sqrt = n / 2 + 1;
        for (int div = 2; div <= sqrt; div++) {
            if (n % div == 0) return false;
        }
        return true;
    }

    public static int strStr(String haystack, String needle) {
        char[] stackArr = haystack.toCharArray();
        char[] needleArr = needle.toCharArray();
        int index = 0, res = -1;
        for (int i = 0; i < stackArr.length; i++) {
            if (stackArr[i] == needleArr[index]) {
                if (index++ == 0) res = i;
                if (index == needleArr.length) return res;
            } else {
                index = 0;
            }
        }
        return res;
    }

    private static void show(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
    public static boolean isPalindrome(String s) {
        char[] arr = s.trim().toLowerCase().toCharArray();
        int start = 0, end = arr.length - 1;
        while (start < end) {
            if (arr[start] > (int) 'z' || arr[start] < (int) 'a') {
                start++;
                continue;
            }
            if (arr[end] > (int) 'z' || arr[end] < (int) 'a') {
                end--;
                continue;
            }
            if (arr[start++] != arr[end--]) return false;
        }
        return true;
    }

    public static void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length / 2; i++) {
            int first = i, last = matrix.length - 1 - i;
            for (int j = 0; j < (matrix.length - 2 * i) - 1; j++) {
                int buff = matrix[first][first + j];
                matrix[first][first + j] = matrix[last - j][first];
                matrix[last - j][first] = matrix[last][last - j];
                matrix[last][last - j] = matrix[first + j][last];
                matrix[first + j][last] = buff;
            }
        }
    }

    public static int[] plusOne(int[] digits) {
        int nines = 0;
        for (int i = digits.length - 1; i >=0; i--) {
            if (digits[i] == 9) {
                nines++;
            } else {
                break;
            }
        }
        int[] res = new int[digits.length + (nines == digits.length ? 1 : 0)];
        int end = digits.length -1;
        boolean add = true;
        for (int i = res.length - 1; i >= 0; i--) {
            if (add) {
                res[i] = end >= 0 ? (digits[end--] + 1) % 10 : 1;
                if (res[i] != 0) add = false;
            } else if (end >= 0) {
                res[i] = digits[end--];
            }
        }
        return res;
    }

    public static int thirdMax(int[] nums) {
        int f = Integer.MIN_VALUE, s = Integer.MIN_VALUE, t = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (f < nums[i]) f = nums[i];
            if (s < nums[i] && nums[i] < f) s = nums[i];
            if (t < nums[i] && nums[i] < s) t = nums[i];
        }
        return nums.length > 2 ? t : f;

    }

    public static void moveZeroes(int[] nums) {
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 0) {
                for (int j = i++; j < nums.length - 1; j++) {
                    int buff = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = buff;
                }
            }
        }
    }

    public static boolean validMountainArray(int[] arr) {
        int up = 0, down = 0;
        boolean grow = true;
        for (int i = 0; i < arr.length - 1; i ++) {
            if (grow) {
                if (arr[i] < arr[i + 1]) {
                    up++;
                } else if (arr[i] > arr[i + 1]) {
                    down++;
                    grow = false;
                } else {
                    return false;
                }
            } else {
                if (arr[i] > arr[i + 1]) {
                    down++;
                } else return false;
            }
        }
        return up > 0 && down > 0 && (up + down) >= 3 && (up + down) == arr.length - 1;

    }

    public static int removeElement(int[] nums, int val) {
        int removed = 0, len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] == val) {
                int buff = nums[i];
                nums[i--] = nums[len - 1];
                nums[len-- - 1] = buff;
                removed++;
            }
        }
        return removed;
    }
}
