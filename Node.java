public class Node{
 private String data;
 private Node next,prev;
 public Node(String value){
   data = value;
   next = null;
   prev = null;
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
  public void setPrev(Node previous){
    prev = previous;
  }
  public void setNext(Node Next){
    next = Next;
  }
  public void setData(String value){
    data = value;
  }
}