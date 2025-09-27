// TOPIC : GRAPH 
// Creating a Graph (Adjacency List)

import java.util.*;

public class hundredsixtynine169 {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // 0 vertex
        graph[0].add(new Edge(0, 1, 5));

        // 1 vertex
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        // 2 vertex
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 4));

        // 3 vertex
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));

        // 4 vertex
        graph[4].add(new Edge(4, 2, 2));
    }

    public static void main(String[] args) {
        int v = 5; // vertices
        ArrayList<Edge>[] graph = new ArrayList[v]; // Array of ArrayList
        createGraph(graph);

        // Print neighbors of vertex 2
        System.out.println("Neighbors of vertex 2:");
        for (int j = 0; j < graph[2].size(); j++) {
            Edge e = graph[2].get(j);
            System.out.println("dest: " + e.dest);
        }
    }
}
