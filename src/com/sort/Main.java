package com.sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] ss) {
        // 选择排序
        int[] args = {1,3,7,5,2,0};
        SelectSort selectSort = new SelectSort();
        int [] newArray = selectSort.sort(args);
        System.out.print(Arrays.toString(newArray));
    }
}
