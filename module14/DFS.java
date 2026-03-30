package Assignment5.Module14;
import java.util.*;

public class DFS {

    private int vertices;
    private LinkedList<Integer>[] adjList;

    // Constructor
    public DFS(int v) {
        vertices = v;
        adjList = new LinkedList[v];

        for (int i = 0; i < v; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    // Add edge
    public void addEdge(int v, int w) {
        adjList[v].add(w);   // directed graph
    }

    // DFS Utility (recursive)
    public void dfsUtil(int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        for (int neighbor : adjList[vertex]) {
            if (!visited[neighbor]) {
                dfsUtil(neighbor, visited);
            }
        }
    }

    // DFS traversal
    public void dfs(int startVertex) {
        boolean[] visited = new boolean[vertices];
        System.out.print("DFS Traversal: ");
        dfsUtil(startVertex, visited);
    }

    // Main method
    public static void main(String[] args) {
        DFS graph = new DFS(6);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);

        graph.dfs(0);  // Start from vertex 0
    }
}