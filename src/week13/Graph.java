package week13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Graph<N> {
    private HashMap<N, ArrayList<Edge<N>>> adjacencyList;

    public Graph(){
        this.adjacencyList=new HashMap<>();
    }
    public void addEdge(Edge<N> edge){
        N from=edge.getStart();
        N to=edge.getEnd();
        this.addNode(from);
        this.addNode(to);
        this.adjacencyList.get(from).add(edge);
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
        if (this.adjacencyList.containsKey(from))
            for (Edge edge : this.adjacencyList.get(from))
                if (edge.getEnd().equals(to))
                    return true;
        return false;

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
    public double costOfPath(ArrayList<N> path,Cost findCost){
        if (validPath(path)){
            double cost=0;
            for (int x=0; x<path.size()-1; x++) {
                N from = path.get(x);
                N to = path.get(x + 1);
                for (Edge edge : this.adjacencyList.get(from))
                    if (edge.getEnd().equals(to))
                        cost+=findCost.cost(edge);
            }
            return cost;
        } else {
            return -1;
        }
    }
    public static void main(String[] args) {
        Graph<String> graph=new Graph<>();
        ArrayList<Edge<String>> flights=new ArrayList<>();
        flights.add(new Fight("BUF","TOR",200,100,1));
        flights.add(new Fight("TOR","BUF",300,160,1));
        flights.add(new Fight("BUF","JFK",399,500,4));
        flights.add(new Fight("JFK","WDC",99,220,3));
        flights.add(new Fight("WDC","PHI",1399,160,2.5));
        flights.add(new Fight("PHI","BUF",395,400,3.2));
        flights.add(new Fight("TOR","WDC",279,800,6));
        for (Edge edge : flights){
            graph.addEdge(edge);
        }
        System.out.println(graph);

        ArrayList<String> path=
                new ArrayList<>(Arrays.asList(
                        "BUF","JFK","WDC","PHI"
                ));
        System.out.println(graph.validPath(path));

        FlightDistance dist=new FlightDistance();
        double distPath=graph.costOfPath(path,dist);
        System.out.println(distPath);
    }
}
