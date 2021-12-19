package com.company;
import java.util.Iterator;

public class FixedCapacityStackOfStrings<Item> implements Iterable<Item> {

    private int N; // 栈数量
    private Item[] a; // 存栈

    public FixedCapacityStackOfStrings(int cap) {
        a =  (Item[]) new Object[cap];
    }

    public void  push(Item item) {

        if (N == a.length) {
            resize(2 * a.length);
        }
        a[N++] = item;
    }

    public Item pop() {
        Item item = a[--N];
        // 避免对象游离
        a[N] = null;
        if (N > 0 && N == a.length / 4) {
            resize(a.length/2);
        }
        return item;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    // 调整栈容量
    private void resize(int max) {
        Item []temp =  (Item[])  new Object[max];
        for (int i = 0; i < a.length; i++) {
            temp[i] = a[i];
        }
        a = temp;
    }
    // 迭代器
    public Iterator<Item> iterator () {
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<Item> {
        private int i = N;
        public boolean hasNext() {
            return i > 0;
        }

        public Item next() {
            return a[--i];
        }

        public void remove() {}
    }
}
