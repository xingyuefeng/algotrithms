package com.sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] ss) {
        // 选择排序
        int[] args = {1,2,3,4,7,6,5};
//        SelectSort selectSort = new SelectSort();
//        selectSort.test(args);

        // 插入排序
        SelectSort Insertion = new SelectSort();
        Insertion.test(args);
    }
}
