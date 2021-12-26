package com.sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] ss) {
        // 选择排序
        int[] args = {1,2,3,4,5,7,6,5,0};
//        SelectSort selectSort = new SelectSort();
//        selectSort.test(args);

        // 插入排序
//        SelectSort Insertion = new SelectSort();
//        Insertion.test(args);
        // 希尔排序
//        Shell shell = new Shell();
//        shell.test(args);
        // 归并排序
//        MergeSort mergeSort = new MergeSort();
//        mergeSort.test(args);
        // 快速排序
        QuickSort quickSort = new QuickSort();
        quickSort.test(args);
    }
}
