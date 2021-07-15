package graph;

import java.util.ArrayList;
import java.util.List;

public class MediumProblems {
    public static void main(String[] args) {
//        int[][] arr= {{1,2},{3},{3},{}};
        int[][] arr= {{2,1,1},{2,3,1},{3,4,1}};
//        arr[0][0] =0;
//        arr[0][1] =2;
//        arr[1][0] =2;
//        arr[1][1] =0;
//        int[] arr2 = {1};
//        allPathsSourceTarget(arr);
        networkDelayTime(arr,4,2);
    }

    static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> paths= new ArrayList<>();
        int nodes= graph.length;
        int[] visited = new int[nodes];

        List<Integer> list= new ArrayList<>();
        paths.add(DFS(0,graph,visited,new ArrayList<>()));
        paths.add(DFS(0,graph,visited,new ArrayList<>()));
        System.out.println(paths);
        return new ArrayList<>();
    }
    static List<Integer> DFS(int node, int[][] graph, int[] visited, List<Integer> list){
        visited[node]=1;
        boolean isPath=false;
        int[] adj = graph[node];
        list.add(node);
        if(node==graph.length-1) return list;
        for(int i=0;i<adj.length;i++){
            int element = adj[i];

            if(visited[element]!=1){
                List<Integer> dfs = DFS(element, graph, visited,list);
            }
        }
//        List<List<Integer>> pathList = new ArrayList<>();
//        pathList.add(list);
        return list;
    }

    static public int networkDelayTime(int[][] times, int N, int K) {
        int time =0;
        //create a dfs
        for(int i=0;i<N;i++){
            time = times[i][3]+ networkDelayTime(times,N, times[i][2]);
        }
        return time;
    }
}
