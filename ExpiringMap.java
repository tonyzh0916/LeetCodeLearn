class ExpiringKey{
  V value;
  long expirationTime;
}

class ExpringMap{
  Map<K,ExpiringKey> m = new HashMap<>();

  V get(Key k){
    ExpiringKey v= this.m.get(k);
    if(v==null){
      return null;
    }
    if(v.expirationTime<System.currentTimeMillis()){
      m.remove(k);
      return null;
    };
    return v.val;
  }

  void put(Key k, V val, long expirationTime){
    ExpiringKey expiringKey = new ExpiringKey(val, expirationTime);
    this.m.put(k, expiringKey);
  }

  void cleanup(){
    List<K> keys = new ArrayList<>();
    for(ExpiringKey entry: this.m.entrySet()){
      if(entry.getValue().expirationTime<System.currentTimeMillis()){
        keys.add(entry.getKey());
      };
    }
    for(K key:keys){

    }
  }

  //PriorityQueue<>()
}
