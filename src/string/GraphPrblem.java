package string;

import java.util.LinkedList;
import java.util.List;

public class GraphPrblem {
    class Graph
    {
        int V;
        LinkedList<Integer> adjListArray[];

        Graph(int V)
        {
            this.V = V;
            adjListArray = new LinkedList[V];
            for(int i = 0; i < V ; i++){
                adjListArray[i] = new LinkedList<>();
            }
        }
    }
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    int getMinimumCostToConstruct(int numTotalAvailableCities,
                                  int numTotalAvailableRoads,
                                  List<List<Integer>> roadsAvailable,
                                  int numNewRoadsConstruct,
                                  List<List<Integer>> costNewRoadsConstruct)
    {
        // WRITE YOUR CODE HERE
        Graph graph = new Graph(numTotalAvailableCities);
        for(int i=0;i<roadsAvailable.size();i++){
            addEdge(graph,roadsAvailable.get(0));
        }

        //check how graph can be connected
        for(int i=0;i<costNewRoadsConstruct.size();i++){
           // if(grapgconnected())
        }



        //check for min cost

        return -1;

    }

    private boolean grapgconnected(int adjacency_matrix[][], int source) {
            int number_of_nodes = adjacency_matrix[source].length - 1;

            int[] visited = new int[number_of_nodes + 1];
            int i, element;
            visited[source] = 1;
            LinkedList<Integer> queue=null;
            queue.add(source);
            while (!queue.isEmpty())
            {
                element = queue.remove();
                i = element;
                while (i <= number_of_nodes)
                {
                    if (adjacency_matrix[element][i] == 1 && visited[i] == 0)
                    {
                        queue.add(i);
                        visited[i] = 1;
                    }
                    i++;
                }
            }
            boolean connected = false;

            for (int vertex = 1; vertex <= number_of_nodes; vertex++)
            {
                if (visited[vertex] == 1)
                {
                    connected = true;
                } else
                {
                    connected = false;
                    break;
                }
            }
            return connected;
    }

    private void addEdge(Graph graph, List<Integer> list)
    {
        graph.adjListArray[list.get(0)].add(list.get(1));
        graph.adjListArray[list.get(1)].add(list.get(0));

    }
    
    
}
