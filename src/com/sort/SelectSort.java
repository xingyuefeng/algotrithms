package com.sort;

// 选择排序
public class SelectSort extends SortTemp {

    public void sort (int[] args) {
        for (int i = 0; i < args.length; i++) {
            int min = i;
            for (int j = i + 1; j < args.length; j++) {
                if (args[min] > args[j]) {
                    min = j;
                }
            }
            if (min != i) {
                exchange(args, i, min);
            }

        }
    }

    public  void test(int [] args) {
        sort(args);
        assert isSorted(args);
        show(args);
    }

}
