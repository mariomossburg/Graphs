import java.util.Scanner;

public class UserInputMartrix {
    Scanner scanner = new Scanner(System.in);
    int numberOfVertices;

    String listOfVertices;
    int hasEdge;
    public UserInputMartrix() {

        System.out.print("Enter number of vertices:");
        numberOfVertices = scanner.nextInt();
        scanner.nextLine();
        MatrixGraph matrixGraph = new MatrixGraph(numberOfVertices);

        System.out.print("Enter list of vertices:");
        listOfVertices = scanner.nextLine();
        //listOfVertices.replaceAll("\\s", "");
        String newListOfVertices = listOfVertices.replaceAll("\\s", "");
        userInputToVertices(newListOfVertices, matrixGraph);
        char[] newList = newListOfVertices.toCharArray();


        System.out.println("\nEnter 1 for Yes and 0 for No");
        for (int i = 0; i < newList.length; i++) {
            for (int j = 0; j < newList.length; j++) {
                System.out.println("Does " + newList[i] + " have an edge with " + newList[j]);
                hasEdge = scanner.nextInt();
                scanner.nextLine();
                if (hasEdge ==1){
                 matrixGraph.addEdge(i,j);
                }
            }
        }
        System.out.println("Following graph is stored");
        matrixGraph.print();
    }
    public static void userInputToVertices(String userInput, MatrixGraph matrixGraph) {

        char[] chars = userInput.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            matrixGraph.addNode(new Node(chars[i]));
        }
    }
}//end class
