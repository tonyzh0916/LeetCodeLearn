class LRUCache {
  class Node{
    int key;
    int value;
    Node next;
    Node pre;
    public Node(int key, int value){
      this.key = key;
      this.value = value;
    }
  }
    private HashMap<Integer, Node> map;
    private int capacity;
    //the head of the linkedList, the olderest elements
    private Node head;
    //the tail of the linkedList, the latest eletments
    private Node tail;

  public LRUCache(int capacity) {
      map = new HashMap<>();
      this.capacity = capacity;
      head = null;
      tail = null;
  }
  
  public int get(int key) {
      Node node = map.get(key);
      if(node ==null){
        return -1;
      }
      if(node !=tail){
        //if node is head, need to  move it to tail
        if(node ==head){
          head = head.next;
        }else{
          //node is not head, pull it out and connect node.pre and node next;
          node.pre.next = node.next;
          node.next.pre = node.pre; 
        }
        //put this node into the tail
        tail.next = node;
        node.pre = tail;
        node.next = null;
        tail = node;
      }
      return node.value;
  }
  
  public void put(int key, int value) {
      Node node = map.get(key);
      //if this node is exist, just need to update the value
      if(node !=null){
        node.value = value;
        if(node !=tail){
          if(node == head){
            head = head.next;
          }else{
            node.pre.next = node.next;
            node.next.pre = node.pre;
          }
          tail.next = node;
          node.pre = tail;
          node.next = null;
          tail = node;
        }
      }else{
        //need to insert new node into
        Node newNode = new Node(key,value);
        if(capacity == 0){
          Node temp = head;
          head = head.next;
          //need to remove this node in map
          map.remove(temp.key);
          //decrease the capacity
          capacity++;
        }
        //if this is the fist node in the linkedList
        if(head ==null){
          head = newNode;
        }else{
          tail.next = newNode;
          newNode.pre = tail;
          newNode.next = null;
        }
        tail = newNode;
        map.put(key, newNode);
        capacity--;
      }
  }
}
/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */