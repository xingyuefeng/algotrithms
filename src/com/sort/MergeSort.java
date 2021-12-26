package com.sort;


public class MergeSort extends SortTemp {

    private static int[] aux;

    public static void sort(int[] a) {
        aux = new int[a.length];
        sort(a, 0, a.length - 1);
    }

    private static void sort(int[] a, int lo, int hi) {
        if (hi <= lo) return;
        int mid = lo + (hi - lo) /2;
        sort(a, lo, mid);  // 左半变排序
        sort(a, mid + 1, hi); // 右半边排序
        merge(a, lo, mid, hi);
    }

    public static void merge(int [] a, int lo, int mid, int hi) {
        // 将a[lo..md] 和 a[mid+1.. hi]合并
       int i = lo, j = mid +1;
       for (int k = lo; k <= hi; k++) {
           aux[k] = a[k];
       }
        for (int k = lo; k <= hi; k++) {
            if      (i > mid)          a[k] = aux[j++];
            else if (j > hi)           a[k] = aux[i++];
            else if (aux[j] < aux[i])  a[k] = aux[j++];
            else                       a[k] = aux[i++];
        }

    }

    public  void test(int [] args) {
        sort(args);
        show(args);
    }
}
