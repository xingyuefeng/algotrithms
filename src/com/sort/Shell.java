package com.sort;

// 希尔排序
public class Shell extends SortTemp {
    public void sort (int[] args) {
        // 增量gap，并逐步缩小增量
        for (int gap = args.length / 2; gap > 0; gap/=2) {
            // 从第gap个元素，逐个对其所在组进行直接插入排序操作
            for(int i=gap; i < args.length; i++){
                int j = i;
                while (j-gap >= 0 && args[j] < args[j-gap] ) {
                    exchange(args, j, j-gap);
                    j -= gap;
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
