import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> res = new ArrayList<>();
        if(edges == null || edges.length==0){
            res.add(0);
            return res;
        }

        List<HashSet<Integer>> graph = new ArrayList<>();
        for(int i=0; i<n; i++){
            graph.add(new HashSet<>());
        }

        for(int[] edge : edges){
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        for(int i=0; i<graph.size(); i++){
            if(graph.get(i).size() ==1){
                res.add(i);
            }
        }

        while(n>2){
            n-=res.size();
            List<Integer> temp = new ArrayList<>();

            for(int node : res){
                for(int sub : graph.get(node)){
                    graph.get(sub).remove(node);
                    if(graph.get(sub).size()==1){
                        temp.add(sub);
                    }
                }
            }
            res = temp;
        }
        return res;
    }
}