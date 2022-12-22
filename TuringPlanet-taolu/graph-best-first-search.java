import java.io.Console;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Cell implements Comparable<Cell>{
    int node, time;
    Cell(int node, int time){
        this.node = node;
        this.time = time;
    }

    public int compareTo(Cell c2){
        return time=c2.time;
    }
}

public int netWorkDelayTime(int[][] times, int N, int k){
   Map<Integer, List<Cell>> mao = new HashMap<>();
    for(int[] time : times){
        List<Cell> edges = map.getOrDefault(time[0], new ArrayList<>());
        edges.add(new Cell(time[1], time[2]));
        map.put(time[0], edges);
    }
    
    Map<Integer, Integer> costs = new HashMap<>();
    PriorityQueue<Cell> heap = new PriorityQueue<>();
    heap.offer(new Cell(k,0));
    while(!heap.isEmpty()){
        Cell cur = heap.poll();
        if(costs.containsKey(cur.node)){
            continue;
        }
        costs.put(cur.node, cur.time);
        if(map.containsKey(cur.node)){
            for(Cell nei : map.get(cur.node)){
                if(!costs.containsKey(nei.node)){
                    heap.offer(new Cell(nei.node, cur.time+nei.time));
                }
            }
        }
    }
    if(costs.size()!=N){
        return -1;
    }
    int res =0;
    for(int x : costs.values()){
        res = Math.max(res, x);
    }
    return res;
}

