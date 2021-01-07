public class MyLinkedList{
 private int size;
 private Node start,end;  
 public MyLinkedList(){
   size = 0;
 }
 public int size(){
   return size;
 }
 public boolean add(String value){
   size++;
   end = new Node(value);
   return true;
 }
 public void add(int index, String value){
   // Node temp = helperIndexMethod(index);
   // Node temp2 = temp.getNext();
   // temp = temp.setNext().setData(value);
   // temp2.getNext().setPrev().setData(value);
  }
 
 private Node helperIndexMethod(int index){
   Node term = start;
   for (int i = 1; i < index;i++){
     term = start.getNext();
   }
   return term;
 }
  public String get(int index){
    return helperIndexMethod(index).getData();
  }
  //public String set(int index, String value);
 // public String toString();
 //Any helper method that returns a Node object MUST BE PRIVATE!
}