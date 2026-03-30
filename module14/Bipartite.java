package Assignment5.Module14;
import java.util.*;

public class Bipartite {

    private int vertices;
    private LinkedList<Integer>[] adjList;

    // Constructor
    public Bipartite(int v) {
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

    // Check bipartite using BFS
    public boolean isBipartite() {
        int[] color = new int[vertices];
        Arrays.fill(color, -1); // -1 means uncolored

        for (int i = 0; i < vertices; i++) {

            if (color[i] == -1) {
                Queue<Integer> queue = new LinkedList<>();
                queue.add(i);
                color[i] = 0; // start coloring

                while (!queue.isEmpty()) {
                    int node = queue.poll();

                    for (int neighbor : adjList[node]) {

                        // If not colored, assign opposite color
                        if (color[neighbor] == -1) {
                            color[neighbor] = 1 - color[node];
                            queue.add(neighbor);
                        }
                        // If same color → not bipartite
                        else if (color[neighbor] == color[node]) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    // Main method
    public static void main(String[] args) {
        Bipartite graph = new Bipartite(5);

        graph.addEdge(0, 1);
        graph.addEdge(0, 3);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        if (graph.isBipartite())
            System.out.println("Graph is Bipartite");
        else
            System.out.println("Graph is NOT Bipartite");
    }
}