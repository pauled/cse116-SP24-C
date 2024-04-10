package week11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Graph<N> {
    private HashMap<N, ArrayList<N>> adjacencyList;

    public Graph(){
        this.adjacencyList=new HashMap<>();
    }
    public void addEdge(N from,N to){
        this.addNode(from);
        this.addNode(to);
        this.adjacencyList.get(from).add(to);
    }
    public void addNode(N a){
        if(!this.adjacencyList.containsKey(a)){
            this.adjacencyList.put(a, new ArrayList<>());
        }
    }

    @Override
    public String toString() {
        return this.adjacencyList.toString();
    }
    public boolean areConnected(N from,N to){
        return this.adjacencyList.containsKey(from) &&
                this.adjacencyList.get(from).contains(to);
    }
    public boolean validPath(ArrayList<N> path){
        for (int x=0; x<path.size()-1; x++){
            N from=path.get(x);
            N to=path.get(x+1);
            if (!areConnected(from,to)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Graph<String> graph=new Graph<>();
        graph.addEdge("LAX","BUF");
        graph.addEdge("LAX","JFK");
        graph.addEdge("JFK","BUF");
        graph.addEdge("JFK","LAX");
        graph.addEdge("WBF","LAX");
        graph.addEdge("BUF","WBF");
        graph.addEdge("BUF","JFK");
        System.out.println(graph);

        ArrayList<String> path=
                new ArrayList<>(Arrays.asList(
                        "BUF","WBF","LAX","JFK"
                ));
        System.out.println(graph.validPath(path));
    }
}
