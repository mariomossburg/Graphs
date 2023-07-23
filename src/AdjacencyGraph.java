import java.util.ArrayList;
import java.util.LinkedList;

public class AdjacencyGraph {
    ArrayList<LinkedList<Node>> adjacencyList;
    public AdjacencyGraph() {
        adjacencyList = new ArrayList<>();
    }
    public void addNode(Node node) {
        LinkedList<Node> currentList = new LinkedList<>();
        currentList.add(node);
        adjacencyList.add(currentList);
    }
    public void addEdge(int source, int destination) {
        LinkedList<Node> currentList = adjacencyList.get(source);
        Node dstNode = adjacencyList.get(destination).get(0);
        currentList.add(dstNode);
    }
    public boolean checkEdge(int source, int destination) {
        LinkedList<Node> currentList = adjacencyList.get(source);
        Node dstNode = adjacencyList.get(destination).get(0);

        for (Node node : currentList) {
            if (node == dstNode) {
                return true;
            }
        }
        return false;
    }

    public void print() {
        for (LinkedList<Node> currentList : adjacencyList) {
            boolean printArrow = true;
            for (Node node : currentList) {
                if (!printArrow) {
                    System.out.print(" --> ");
                }
                System.out.print(node.data);
                printArrow = false;
            }
            System.out.println();
        }
    }
}
