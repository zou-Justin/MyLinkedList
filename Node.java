public class Node{
 private String data;
 private Node next,prev;
 public Node(String value){
   data = value;
 }
 //write get/set methods for all three instance variables.
 public String getData(){
   return data;
  }
  public Node getNext(){
    return next;
  }
  public Node getPrev(){
    return prev;
  }
  public Node setPrev(Node previous){
    prev = previous;
    return prev;
  }
  public Node setNext(Node Next){
    next = Next;
    return next;
  }
  public String setData(String value){
    data = value;
    return data;
  }
}