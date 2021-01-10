public class MyLinkedList{
 private int size;
 private Node start,end;  
 public MyLinkedList(){
   size = 0;
   start = Node(null);
   end = Node(null);
 }
 public int size(){
   return size;
 }
 public boolean add(String value){
    Node temp = new node(value);
   if (size == 0){
     start = end = temp;
     start.setNext(null);
     start.setPrev(null);
     size++;     
   }
   else{
   size++;
   end.setNext(temp);
   end = end.getNext();
  }
   return true;
 }
 public void add(int index, String value){
   Node temp = helperIndexMethod(index);
   Node temp2 = new Node(value);
   Node temp3 = temp.getNext();
   if (size == 0){
     start = end = temp2;
     start.setNext(null);
     start.setPrev(null);
   }
   else if (index == 0){
     Node startTemp = start;
     start.setPrev(temp2);
     start = temp2;
     start.setNext(startTemp);
   }
   else if (index == size){
     Node endTemp = end;
     end.setPrev(temp2);
     end = temp2;
     end.setNext(endTemp);
   }
   else{
   temp.setNext(temp2);
   temp2.setPrev(temp);
   temp2.setNext(temp3);
 }
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
  public String set(int index, String value){
     helperIndexMethod(index).setData(value);
     return helperIndexMethod(index).getData();
  }
 public String toString()
 {
   
 }
 //Any helper method that returns a Node object MUST BE PRIVATE!
}