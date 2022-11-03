import java.util.Stack;

import javax.imageio.ImageIO;

class Solution{
    class Log{
        int id;
        int time;
        boolean isStart;

        Log(String log){
            String[] content = log.split(":");
             id = Integer.parseInt(content[0]);
            isStart = content[1].equals("start");
            time = Integer.parseInt(content[2]);
        }
    }

    public int[] exclusiveTime(int n, List<String> logs){
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();
        int lastEndTime = 0;
        for(String log : logs){
            Log logObj = new Log(log);
            if(logObj.isStart){
                if(!stack.isEmpty()){
                    int id = stack.pop();
                    res[id]+=logObj.time-lastEndTime;
                }
                lastEndTime = logObj.time;
                stack.push(logObj.id);
            }else{
                int id = stack.pop();
                res[id]+=logObj.time-lastEndTime+1;
                lastEndTime = logObj.time+1;
            }
        }
        return res;
    }
}
