package com.sort;

public class SelectSort {

    public int[] sort (int[] args) {
        for (int i = 0; i < args.length; i++) {
            int min = i;
            for (int j = i + 1; j < args.length; j++) {
                if (args[min] > args[j]) {
                    min = j;
                }
            }
            if (min != i) {
                int tmp = args[i];
                args[i] = args[min];
                args[min] = tmp;
            }

        }
        return args;
    }

}
