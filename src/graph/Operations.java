package graph;

import java.util.*;

public class Operations {
    private static Graph graph;
    Map<Node,Node> map= new HashMap<>();
    public static void main(String[] args) {
       graph = new Graph(5);
        addEdge(0,1);
        addEdge(0,2);
        addEdge(1,2);
        addEdge(2, 0);
        addEdge(2, 3);
        addEdge(3, 3);
//        dfs(2);
        BFS(2);

    }

    static void addEdge(int i, int j){
         graph.adj[i].add(j);
    }

    static void dfs(int node){
        int[] visited= new int[graph.v];
        dfsUtil(node,visited);

    }

    static void dfsUtil(int node,int[] visited){
        visited[node] = 1;
        System.out.println(node);
        LinkedList<Integer> nodes = graph.adj[node];
        Iterator itr = nodes.listIterator();
        while(itr.hasNext()){
            int next = (int) itr.next();
           if(visited[next]!=1) dfsUtil(next,visited);

        }
    }

    static void BFS(int s){
        boolean[] visited = new boolean[5];
        LinkedList<Integer> queue= new LinkedList<>();
        queue.add(s);

        while (queue.size() != 0) {
            int node = queue.poll();
            System.out.println(node);
            LinkedList<Integer> adj = graph.adj[node];
            for (int i = 0; i < adj.size(); i++) {
                int neighbor = adj.get(i);
                if (!visited[neighbor]) {
                    visited[neighbor]=true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public Node cloneGraph(Node node) {

        if(node ==null) return null;
        if(map.containsKey(node)) return map.get(node);
        Node cloneNode = new Node(node.val);
        map.put(node,cloneNode);
        for(Node n:node.neighbors){
            cloneNode.neighbors.add(cloneGraph(n));
        }
        return cloneNode;
    }

    /*
    private void union(int x, int y) {
        if(x < y) {
            parent[y]= x;
        }else {
            parent[x]= y;
        }
    }

    private int find(int x) {
        if(parent[x] == x) {
            return x;
        }
        parent[x]= find(parent[x]);
        return parent[x];
    }

    public int[] findRedundantConnection(int[][] edges) {
        int[] redundant= new int[2];
        parent= new int[edges.length+1];
        for(int i=0; i< parent.length; i++) {
            parent[i]= i;
        }

        for(int[] e: edges) {
            int parent_a= find(e[0]);
            int parent_b= find(e[1]);
            if(parent_a != parent_b) {
                union(parent_a, parent_b);
            }else {
                redundant= e;
            }
        }
        return redundant;
    }*/


}

