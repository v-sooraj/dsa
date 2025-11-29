import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Graph {

    private final int size;
    private List<List<Integer>> adj;


    public Graph(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Graph size must be positive");
        }

        this.size = size;
        adj = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            adj.add(new ArrayList<>());
        }
    }

    public void addEdge(Integer vertex, Integer neighbour) {
        adj.get(vertex).add(neighbour);
        adj.get(neighbour).add(vertex);
    }


    public List<Integer> getNeighbors(int v) {
        validateVertex(v);
        return Collections.unmodifiableList(adj.get(v));
    }

    public int getSize() {
        return size;
    }

    private void validateVertex(int v) {
        if (v < 0 || v >= size)
            throw new IllegalArgumentException("Invalid vertex index: " + v);

    }
}
