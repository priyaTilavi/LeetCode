import java.util.*;

public class Test {

    public static void main(String[] args) {
        int[][] arr= new int[2][2];
        arr[0][0] =0;
        arr[0][1] =2;
        arr[1][0] =2;
        arr[1][1] =0;
        int[] arr2 = {1};

        IsTrusted(0,arr,arr2,5);
        int[][] trust= {{1,3},{2,3}};
//        System.out.println(findJudge(2,trust));

        List<Integer> songs = new ArrayList<>();
        songs.add(10);
        songs.add(50);
        songs.add(90);
        songs.add(30);
        System.out.println(getSongPairCount(songs));
//        System.out.println("hi"+60%60);
    }
    static boolean  IsTrusted(int node, int[][] trustGraph, int[] pretrustedPeers, int trustThreshold) {
        int NoOfNode = trustGraph.length;
        LinkedList<Integer>[] adj = new LinkedList[NoOfNode];
        initialize(NoOfNode,adj);
        createGraph(adj, trustGraph);
        for(int i=0;i<pretrustedPeers.length; i++){
            if(pretrustedPeers[i]== node) return true;
        }
        int distance = dfs(node,pretrustedPeers[0],NoOfNode,trustGraph,0);
        for(int i=1;i<pretrustedPeers.length; i++){
            if(distance<= trustThreshold){
                return true;
            }
            else {
                distance = dfs(node,pretrustedPeers[i],NoOfNode,trustGraph,0);
            }
        }
        if(distance<= trustThreshold){
            return true;
        }
        return false;
    }
    static LinkedList<Integer>[] initialize(int NoOfNode,LinkedList<Integer>[] adj){
        for(int i=0;i<NoOfNode;i++){
            adj[i]= new LinkedList<>();
        }
        return adj;
    }

    static LinkedList<Integer>[] createGraph(LinkedList<Integer>[] adj,int[][] trustGraph ){
        for(int i=0;i<trustGraph.length;i++){
            System.out.println(adj[i]);
        }
        return adj;
    }

    static int dfs(int dest, int source, int no, int[][] graph, int distance){
        int[] visited = new int[no];
        visited[source] =1;

        for(int i=0;i<no;i++){
            if(i==dest) {
                distance+= graph[source][i];
                break;
            }
            else{
                int next= graph[source][i];
                if(next> 0 && visited[i]!= 1){
                    distance += dfs(dest,i,no,graph,next);
                }
            }

        }
        return distance ;
    }

    String getLatestBlock(int[] startBalances, int[][] pendingTransactions, int blockSize) {
        String[] stringArr = new String[4];

        String params= getBlockHashParam();
        sha1("0000000000000000000000000000000000000000, 28427, [[0, 1, 5], [1, 2, 5]]");
        return "";
    }


    String getBlockHashParam(){
        return "";
    }

    String sha1(String text) {
        String sha1 = "";
        try
        {
            java.security.MessageDigest crypt = java.security.MessageDigest.getInstance("SHA-1");
            crypt.update(text.getBytes("UTF-8"));
            Formatter formatter = new Formatter();
            for (byte b : crypt.digest()) {
                formatter.format("%02x", b);
            }
            sha1 = formatter.toString();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return sha1;
    }

    public static int findJudge(int N, int[][] trust) {
//        List<Integer> list = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<trust.length;i++){
            int u= trust[i][0];
            int v= trust[i][1];
            if(map.containsKey(u)){
                map.remove(u);
            }
            else {
                if(!map.containsKey(v))
                    map.put(v,map.get(v)+1);
                else map.put(v,1);
            }
        }
        for(int j: map.keySet()){
            if(map.get(j)>0) return j;
        }
        return -1;
    }


    public static long getSongPairCount(List<Integer> songs) {
        int pairs=0;
        for(int i=0;i<songs.size();i++){
            for(int j=i+1;j<songs.size();j++){
                if((songs.get(i) +songs.get(j)) %60 ==0 ) pairs++;
            }
        }
        return pairs;
    }


}
