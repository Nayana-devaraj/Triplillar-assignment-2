package Assignment5.Module14;
import java.util.*;

public class Shortestpath {

    private int vertices;
    private LinkedList<Integer>[] adjList;

    // Constructor
    public Shortestpath(int v) {
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

    // BFS to find shortest path
    public void shortestPath(int start) {
        boolean[] visited = new boolean[vertices];
        int[] distance = new int[vertices];

        Arrays.fill(distance, -1);

        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        distance[start] = 0;
        queue.add(start);

        while (!queue.isEmpty()) {
            int current = queue.poll();

            for (int neighbor : adjList[current]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    distance[neighbor] = distance[current] + 1;
                    queue.add(neighbor);
                }
            }
        }

        // Print shortest distances
        System.out.println("Vertex\tDistance from Source");
        for (int i = 0; i < vertices; i++) {
            System.out.println(i + "\t\t" + distance[i]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Shortestpath graph = new Shortestpath(6);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);

        graph.shortestPath(0); // source vertex
    }
}