package com.sort;

// 插入排序
public class Insertion extends SortTemp {

    public void sort (int[] args) {
        for (int i = 1; i < args.length; i++) {
            for (int j = i; j > 0; j--) {
                if (args[j] < args[j-1]) {
                    exchange(args, args[j], args[j-1]);
                }
            }
        }
    }

    public  void test(int [] args) {
        sort(args);
        assert isSorted(args);
        show(args);
    }

}
