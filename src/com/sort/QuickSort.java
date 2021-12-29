package com.sort;

// 快速排序
public class QuickSort extends SortTemp{
    public static void sort(int[] a, int lo, int hi) {
        if (hi <= lo) return;
        int j = partition(a, lo, hi);
        sort(a, lo, j-1); // 将左半部分排序
        sort(a, j+1, hi); // 将右半部分排序
    }

    private static int partition(int []a, int lo, int hi) {
        int i = lo, j = hi +1;
        // 切分元素
        int v = a[lo];
        while (true) {
            // 扫描左右 检查扫描是否结束 并交换元素
            while (a[++i] < v) if (i == hi) break;
            while (v < a[--j]) if (j == lo) break;
            if (i >= j) break;
            exchange(a, i, j);
        }
        exchange(a, lo, j);
        return j;
    }

    public  void test(int [] args) {
        sort(args, 0, args.length - 1);
        show(args);
    }

}
