package Assignment5.Module14;
import java.util.*;

public class Question5 {

    private int vertices;
    private LinkedList<Integer>[] adjList;

    // Constructor
    public Question5(int v) {
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

    // DFS utility
    private void dfsUtil(int v, boolean[] visited) {
        visited[v] = true;

        for (int neighbor : adjList[v]) {
            if (!visited[neighbor]) {
                dfsUtil(neighbor, visited);
            }
        }
    }

    // Count connected components
    public int countComponents() {
        boolean[] visited = new boolean[vertices];
        int count = 0;

        for (int i = 0; i < vertices; i++) {
            if (!visited[i]) {
                dfsUtil(i, visited);
                count++;
            }
        }
        return count;
    }

    // Main method
    public static void main(String[] args) {
        Question5 graph = new Question5(6);

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(3, 4);

        // Vertex 5 is isolated

        int components = graph.countComponents();
        System.out.println("Number of connected components: " + components);
    }
}