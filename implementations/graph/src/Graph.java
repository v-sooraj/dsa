import java.util.LinkedList;

public class Graph {

    private final int vertices;
    private final LinkedList<Integer>[] adjacencyList;

    @SuppressWarnings("unchecked")
    public Graph(int vertices) {
        this.vertices = vertices;
        adjacencyList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int source, int destination) {
        if (source < 0 || destination < 0 || source >= vertices || destination >= vertices) {
            throw new IllegalArgumentException("Invalid vertex index");
        }
        adjacencyList[source].addLast(destination);

        // For undirected graph, uncomment below:
        // adjacencyList[destination].addLast(source);
    }

    public void printGraph() {
        System.out.println(">>Adjacency List of Directed Graph<<");
        for (int i = 0; i < vertices; i++) {
            System.out.print("Vertex " + i + ":");
            for (Integer node : adjacencyList[i]) {
                System.out.print(" -> " + node);
            }
            System.out.println();
        }
    }
}
