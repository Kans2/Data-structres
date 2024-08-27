import java.util.*;
public class Graphs {
 
    Map<String,List<String>> adjList;

    public Graphs() {
        adjList = new HashMap<>();
    }

    //method to inser a vertext

    public void insert(String vertex){
                 
        adjList.putIfAbsent(vertex, new ArrayList<>());

    }

    //method to add edge
    public void addEdge(String vertex1, String vertex2){
        adjList.putIfAbsent(vertex1, new ArrayList<>());
        adjList.putIfAbsent(vertex2, new ArrayList<>());
        adjList.get(vertex1).add(vertex2);

        //undirected grah
       // adjList.get(vertex2).add(vertex1)
       

    }


// print

public void display(){
    for(String vertex: adjList.keySet()){
        System.out.println(vertex+ " ->" + adjList.get(vertex));
    }
}

    public static void main(String[] args) {
        Graphs graph = new Graphs();

        graph.insert("A");
        graph.insert("B");
        graph.insert("C");

        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("B", "C");
        graph.addEdge("C", "A");



        graph.display();


    }



}
