package com.tu;

import java.util.LinkedList;

public class Graph {
    private int V;        // 顶点数目
    private int E;              // 边的数目
    private LinkedList<Integer>[] adj; // 邻接表

    public Graph(int V) {
        this.V = V;
        this.E = 0;
        adj = (LinkedList<Integer>[]) new LinkedList[V];        // 创建邻接表
        for (int v = 0; v < V; v++) {
            adj[v] = new LinkedList<Integer>();
        }
    }
}
