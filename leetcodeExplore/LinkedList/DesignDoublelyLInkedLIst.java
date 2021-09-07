/*
The program below shows Java implementation of a doubly-linked list with the addition of new nodes at the end of the list.
*/
class DoublyLinkedList{
  //A node class for doubly linked list 
  class Node{
    int item;
    Node previous;
    Node next;

    public Node(int item){
      this.item = item;
    }
  }

  //Initially, head and tail is set to null
  Node head, tail = null;

  //add a node to the list
  public void addNode(int item){
    //create a new node 
    Node newNode = new Node(item);

    //if list is empty, head and tail points to newNode
    if(head==null){
      head = tail =newNode;
      //head's previous will be null
      head.previous = null;
      //tail's next will be null
      tail.next = null;
    }else{
      //add newNode to the end of list. tail -> next set to newNode
      tail.next = newNode;
      //newNode -> previous set to tail 
      newNode.previous = tail;
      //newNode becomes new tail 
      tail = newNode;
      //tail's next point to null 
      tail.next = null;
    }
  }

  //print all  the node of doubly linked list
  public void printNodes(){
    //Node current will point to head 
    Node current = head;
    if(head ==null){
      System.out.println("Doubly linked list is empty");
      return;
    }
    System.out.println("Nodes of doubly linked list");
    while(current !=null){
      current = current.next;
    }
  }

}