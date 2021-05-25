package graph;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {

    int v;
    LinkedList<Integer>[] adj;

    Graph(int v){
        this.v = v;
        adj = new LinkedList[5];
        for(int i=0;i<v;i++){
           adj[i]= new LinkedList<>();
        }
    }


}
