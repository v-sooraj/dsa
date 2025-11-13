# Graphs

A graph is a data structure that models pairwise relationships between objects. A graph G = (V, E) consists of a set of vertices \(V\) and a set of edges \(E\). Graphs are widely used in algorithms and real\-world problems such as routing, dependency resolution, and social networks.

## Overview

- Vertex (node): an individual element of the graph.
- Edge: a connection between two vertices.
- Directed vs. undirected: in a directed graph edges have a direction; in an undirected graph they do not.
- Weighted vs. unweighted: weighted graphs store a cost or weight on edges; unweighted graphs do not.

## Common Representations

1. Adjacency list  
   - Each vertex stores a list of its neighbors.  
   - Space: O(V + E).  
   - Good for sparse graphs and efficient iteration over neighbors.

2. Adjacency matrix  
   - A V x V matrix where cell (i, j) indicates presence/weight of edge.  
   - Space: O(V^2).  
   - Good for dense graphs and constant\-time edge existence checks.

3. Edge list  
   - A list of all edges (u, v) or (u, v, w).  
   - Simple and useful for algorithms that process edges directly (e.g., Kruskal).

## Traversal Algorithms

1. Breadth\-First Search (BFS)  
   - Visits vertices in order of distance (number of edges) from a start vertex.  
   - Use a queue; good for shortest path in unweighted graphs.  
   - Time: O(V + E) for adjacency lists.

2. Depth\-First Search (DFS)  
   - Explores as far as possible along each branch before backtracking.  
   - Use recursion or an explicit stack; useful for topological sort, connected components.  
   - Time: O(V + E) for adjacency lists.

## Common Operations

- addVertex, removeVertex  
- addEdge, removeEdge  
- neighbors / adjacent vertices  
- degree (in/out/total)  
- path existence, shortest path (BFS, Dijkstra), connectivity, cycle detection

## Complexity Summary (Adjacency List)

- Add edge: O(1) amortized  
- Remove edge: O(deg(u))  
- Check edge existence: O(deg(u))  
- Iterate all neighbors: O(deg(u))  
- Memory: O(V + E)

## Java Implementation Notes

- Choose representation by expected graph density and operations:
  - Use `List<List<Integer>>` or `Map<Integer, List<Integer>>` for adjacency lists.
  - Use `int[][]` or `double[][]` for adjacency matrix if V is small.
- For weighted graphs, store edges as objects or pairs, e.g., `List<List<Edge>>` with `class Edge { int to; int weight; }`.
- Use `Queue<Integer>` (e.g., `ArrayDeque`) for BFS and `Deque<Integer>` or recursion for DFS.
- Consider using generics for vertex types (`Map<T, List<T>>`) when vertices are not simple integers.

## Example Interface (conceptual)

Use a small, clear API such as:
- `void addVertex(int v)`
- `void addEdge(int u, int v)` \- for directed graphs, add only one direction
- `void addEdge(int u, int v, int weight)` \- for weighted graphs
- `List<Integer> neighbors(int v)`

## Applications

- Shortest path (routing, maps)
- Network connectivity and flow
- Dependency resolution and build systems
- Social network analysis
- Graph algorithms: Dijkstra, Bellman\-Ford, Kruskal, Prim, Tarjan

## References

- Standard algorithm textbooks and Java collections documentation for concrete implementation patterns.