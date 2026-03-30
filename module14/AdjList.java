package Assignment5.Module14;


import java.util.*;

public class AdjList {

    private int vertices;
    private LinkedList<Integer>[] adjList;

    AdjList(int v) {
        vertices = v;
        adjList = new LinkedList[v];

        for (int i = 0; i < v; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    void addEdge(int u, int v) {
        adjList[u].add(v);
        adjList[v].add(u);
    }
    void printGraph() {
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " -> ");
            for (Integer node : adjList[i]) {
                System.out.print(node + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        AdjList graph = new AdjList(5);

        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        System.out.println("Adjacency List Representation:");
        graph.printGraph();
    }
}