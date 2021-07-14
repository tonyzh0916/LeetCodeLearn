public static int[] findOrder(int[] A) {
  int n = A.length;
  int[] result = new int[n];
  Map<Integer, Integer> adjList = new HashMap<>();
  int cur=0;
  for(i=0; i<n;i++){
    if(A[i]==-1){
      cur=i;
      continue;
    }
    adjList.put(A[i],i);
  }

  int count =-1;
  while(++count<n){
    result[count]=cur;
    cur = adjList.getOrDefault(cur, -1);
  }
}

//input A[0]=-1 A[1]=0 A[2]=1  A[i]=j stands for j in front of i

//[0,1,2]