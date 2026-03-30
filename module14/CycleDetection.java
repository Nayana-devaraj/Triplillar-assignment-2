package Assignment5.Module14;
import java.util.*;

public class CycleDetection {

    private int vertices;
    private LinkedList<Integer>[] adjList;

    // Constructor
    public CycleDetection(int v) {
        vertices = v;
        adjList = new LinkedList[v];

        for (int i = 0; i < v; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    // Add edge
    public void addEdge(int v, int w) {
        adjList[v].add(w); // directed graph
    }

    // DFS utility to detect cycle
    private boolean isCyclicUtil(int v, boolean[] visited, boolean[] recStack) {

        if (recStack[v]) return true;   // cycle found
        if (visited[v]) return false;   // already checked

        visited[v] = true;
        recStack[v] = true;

        for (int neighbor : adjList[v]) {
            if (isCyclicUtil(neighbor, visited, recStack))
                return true;
        }

        recStack[v] = false; // remove from recursion stack
        return false;
    }

    // Check cycle
    public boolean isCyclic() {
        boolean[] visited = new boolean[vertices];
        boolean[] recStack = new boolean[vertices];

        for (int i = 0; i < vertices; i++) {
            if (isCyclicUtil(i, visited, recStack))
                return true;
        }
        return false;
    }

    // Main method
    public static void main(String[] args) {
        CycleDetection graph = new CycleDetection(4);

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0); // creates cycle
        graph.addEdge(2, 3);

        if (graph.isCyclic())
            System.out.println("Graph contains cycle");
        else
            System.out.println("Graph does not contain cycle");
    }
}
