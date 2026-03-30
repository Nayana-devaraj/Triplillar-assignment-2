package Assignment5.Module14;
import java.util.*;

public class Neighbour {

    private int vertices;
    private LinkedList<Integer>[] adjList;

    // Constructor
    public Neighbour(int v) {
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

    // Print neighbors of a node
    public void printNeighbors(int node) {
        if (node < 0 || node >= vertices) {
            System.out.println("Invalid node");
            return;
        }

        System.out.print("Neighbors of node " + node + ": ");

        for (int neighbor : adjList[node]) {
            System.out.print(neighbor + " ");
        }
    }

    // Main method
    public static void main(String[] args) {
        Neighbour graph = new Neighbour(5);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);

        graph.printNeighbors(1); // print neighbors of node 1
    }
}