package graph;

import java.util.LinkedList;
import java.util.Queue;

public class Traversal {


    public void BFS(Vertex v){
        Queue<Vertex> queue = new LinkedList<>();
        queue.add(v);
        v.setVisited(true);
        while(!queue.isEmpty()){
            Vertex temp = queue.poll();
            for(Vertex neighbor:temp.getNeighbors()){
                if(!neighbor.isVisited()) {
                    neighbor.setVisited(true);
                    queue.add(neighbor);
                }
            }
        }

    }

}
