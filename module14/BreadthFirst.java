package Assignment5.Module14;
import java.util.*;

public class BreadthFirst {

    private int vertices;
    private LinkedList<Integer>[] adjList;

    // Constructor
    public BreadthFirst(int v) {
        vertices = v;
        adjList = new LinkedList[v];

        for (int i = 0; i < v; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    // Add edge to the graph
    public void addEdge(int v, int w) {
        adjList[v].add(w);   // directed graph
    }

    // BFS traversal
    public void bfs(int startVertex) {
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();

        visited[startVertex] = true;
        queue.add(startVertex);

        System.out.print("BFS Traversal: ");

        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");

            for (int neighbor : adjList[vertex]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        BreadthFirst graph = new BreadthFirst(6);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);

        graph.bfs(0);  // Starting from vertex 0
    }
}