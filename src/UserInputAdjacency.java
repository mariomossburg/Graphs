import java.util.ArrayList;
import java.util.Scanner;

public class UserInputAdjacency {

    Scanner scanner = new Scanner(System.in);
    ArrayList<String> arrayList = new ArrayList<>();
    int numberOfVertices;
    String listOfVertices;
    int numberOfEdges;

    String adjacentVertices;

    public UserInputAdjacency(){
        AdjacencyGraph adjacencyGraph = new AdjacencyGraph();
        System.out.println("Enter number of vertices:");
        numberOfVertices = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter list of Vertices: ");
        listOfVertices = scanner.nextLine();
        String updatedListOfVertices = listOfVertices.replaceAll("\\s", "");
        userInputToVertices(updatedListOfVertices, adjacencyGraph);
        char[] newList = updatedListOfVertices.toCharArray();


        for (int i = 0; i < newList.length; i++) {
            System.out.println("How many edges are associated with " + newList[i]);
            numberOfEdges = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter adjacent vertices to " + newList[i]);
            adjacentVertices = scanner.nextLine();
            adjacentVertices.toCharArray();
            arrayList.add(adjacentVertices);
        }
        for (String s: arrayList){
           if(s.equalsIgnoreCase("ab") || s.replaceAll(" ", "").equalsIgnoreCase("ab")){
               System.out.println("0 1");
           }else if(s.equalsIgnoreCase("ac")  || s.replaceAll(" ", "").equalsIgnoreCase("ac")){
               System.out.println("0 2");
           }else if (s.equalsIgnoreCase("bc")  || s.replaceAll(" ", "").equalsIgnoreCase("bc")){
               System.out.println("1 2");
           }
        }
    }
    public static AdjacencyGraph userInputToVertices(String userInput, AdjacencyGraph adjacencyGraph){
    char[] chars = userInput.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            adjacencyGraph.addNode(new Node(chars[i]));
        }
        return adjacencyGraph;
    }

}//end class
