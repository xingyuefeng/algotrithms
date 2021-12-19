package com.company;
import java.util.Iterator;

public class List<Item> implements Iterable<Item> {
    // 栈顶
    private Node first;
    // 元素数量
    private int N;
    // 节点嵌套类
    private class Node {
        Item item;
        Node next;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return N;
    }
    // 像栈顶添加元素
    public void push(Item item) {
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        N++;
    }
    // 删除栈顶元素
    public Item pop() {
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }

    public Iterator<Item> iterator () {
        return new List.ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<Item> {
        private Node current = first;
        public boolean hasNext() {
            return current != null;
        }

        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }

        public void remove() {}
    }


}
