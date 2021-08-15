/*
Design two API

tradeStocks(String  ticker, int volume) if  there is a existed  stock, add the volume on top of that
getTopN(int N) Get top  N volume of stocks, For the stockes of same volume , use alphabetic order

"AMZN",2 
'GOOG",3
"MSFT",4

getTop(1) -> MSFT
getTop(2) -> MSFT,   GOOG
*/

//Brutal Force  
Map<String,  Integer> trades = new  HashMap<>();
public void  tradeStocks(String ticker,  int volume){
  int totlalVolume = trades.getOrdefault(ticker, 0)+volume;
  trades.put(ticker, totlalVolume);
}

public List<String> getTopN(int n){
  //key is volume, value is list of  stickers
  Map<Integer, List<Stirng>> m = new TreeMap<>(Collections.reverseOrder());
  //List can be replaced  with  TreeSet
  for(Map.Entry<String, Integer> entry : this.trades.entrySet()){
    String ticker = entry.getKey();
    int v = entry.getValue();
    m.computeIfAbset(v, k->new  ArrayList<>()).add(ticker);
  }

  List<Stirng> result = new  ArrayList<>();

  for(Map.Entry<Integer, List<String>> entry : m.entrySet()){
    int v  =  entry.getKey();
    List<String> l = entry.getValue();
    Collections.sort(l);
    for(String t : l){
      if(--n<0){
           return result;
      }
       result.add (t+" "+v);
    }
  }
  return result;
}

/////////////////////////////////////////////////////////////
//Bucket class 
public static class Bucket{
  int count;
  TreeSet<Stirng> stockNames; // Insert  takes LogN time  wise
  Bucket next;
  Bucket pre;

  public  Bucket(int  count){
    this.count = count;
    this.stockNames =new TreeSet<>();
  }
}

private void insertNewBucket(Bucket newBucket, Bucket startBucket){
  //Traverse from start bucket position
  Bucket bigger = startBucket;
  while(bigger.count < newBucket.count){
    bigger = bigger.next;
  }
  //bigger.count > newBucket.count
  Bucket smaller = bigger.pre;
  //head <-> ... <->  smaller <->  newBucket <-> bigger <-> .... <-> tail 
  //adjust bucket 
  newBucket.pre = smaller;
  newBucket.next = bigger;

  //adjust smaller 
  smaller.next = newBucket ;

  //adjust bigger 
  bigger.pre  = newBucket;

  //put this bucket in the map  
  buckets.put(newBucket.count, newBucket);
}

public List<String>   getTopN(int n){
  Bucket currBucket = tail.pre; //The first bucket will be the one right before tail
  List<String> res = new ArrayList<>();
  while(currBucket !=this.head && res.size()<n){
    for(String stockName : currBucket.stockNames){
      res.add(stockName + " "+this.trades.get(stockName));
      if(res.size()==n){
        break;
      }
    }
    currBucket = currBucket.pre;
  }
    return res; 
}