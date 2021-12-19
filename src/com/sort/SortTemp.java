package com.sort;

// 排序算法模板代码
public class SortTemp {

    public static void exchange(int [] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void show(int[] a) {
        //单行打印数组
        for (int num: a) {
            System.out.print(num + "  ");
        }
        System.out.print(isSorted(a) ? "success" : "error");
    }
    // 测试元素是否有序
    public static boolean isSorted(int [] a) {
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i-1]) return false;
        }
        return true;
    }


}
