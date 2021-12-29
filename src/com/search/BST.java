package com.search;

// 基于二叉树查找的符号表
public class BST <Key extends Comparable<Key>, Value> {
    private Node root;              // 二叉树查找的根节点

    private class Node
    {
        private Key key;            // 键
        private Value val;          // 值
        private Node left, right;   // 指向子树的链接
        private int N;              // 以该节点为根的子树中的结点总数

        public Node(Key key, Value val, int N) {
            this.key = key;
            this.val = val;
            this.N   = N;
        }
    }
    public int size() {
        return size(root);
    }

    private int size(Node x) {
        if (x == null)  return 0;
        else            return x.N;
    }

    public Value get(Key key) {
        return get(root, key);
    }

    private Value get(Node x, Key key) {
        // 在以x为根节点的子树中查找key值并返回
        // 如果找不到则返回null
        if (x == null) return null;
        int cmp = key.compareTo(x.key);
        if      (cmp < 0) return get(x.left, key);
        else if (cmp > 0) return get(x.right, key);
        else return x.val;
    }

    public void put(Key key, Value val) {
        // 查找key 找到则更新他的值 否则为他创建一个新的结点
        root = put(root, key , val);
    }

    private Node put(Node x, Key key, Value val) {
        // 如果key存在于以x为根节点的子树中则更新他的值
        // 否则将以key和val为键值对的新结点插入到该子树中
        if (x == null) return new Node(key, val, 1);
        int cmp = key.compareTo(x.key);
        if      (cmp < 0) x.left = put(x.left, key, val);
        else if (cmp > 0) x.right = put(x.right, key, val);
        else x.val = val;
        x.N = size(x.left) + size(x.right) + 1;
        return x;
    }
}
