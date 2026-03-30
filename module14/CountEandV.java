package Assignment5.Module14;
import java.util.*;

public class CountEandV {

    private int vertices;
    private LinkedList<Integer>[] adjList;

    // Constructor
    public CountEandV(int v) {
        vertices = v;
        adjList = new LinkedList[v];

        for (int i = 0; i < v; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    // Add edge (undirected graph)
    public void addEdge(int v, int w) {
        adjList[v].add(w);
        adjList[w].add(v);
    }

    // Count vertices
    public int countVertices() {
        return vertices;
    }

    // Count edges
    public int countEdges() {
        int count = 0;

        for (int i = 0; i < vertices; i++) {
            count += adjList[i].size();
        }

        return count / 2; // divide by 2 for undirected graph
    }

    // Main method
    public static void main(String[] args) {
        CountEandV graph = new CountEandV(5);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(3, 4);

        System.out.println("Number of vertices: " + graph.countVertices());
        System.out.println("Number of edges: " + graph.countEdges());
    }
}