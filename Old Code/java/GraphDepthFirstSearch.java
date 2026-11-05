import java.util.*;

public class GraphDepthFirstSearch {

    public static void dfs(
            Map<Integer, List<Integer>> graph,
            int current,
            Set<Integer> visited) {

        if (!visited.add(current)) {
            return;
        }

        System.out.print(current + " ");

        for (int neighbor : graph.getOrDefault(
                current, Collections.emptyList())) {
            dfs(graph, neighbor, visited);
        }
    }

    public static void main(String[] args) {
        Map<Integer, List<Integer>> graph = new HashMap<>();

        graph.put(1, Arrays.asList(2, 3));
        graph.put(2, Arrays.asList(1, 4, 5));
        graph.put(3, Arrays.asList(1, 6));
        graph.put(4, Arrays.asList(2));
        graph.put(5, Arrays.asList(2));
        graph.put(6, Arrays.asList(3));

        dfs(graph, 1, new HashSet<>());
    }
}
