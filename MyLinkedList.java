public class MyLinkedList{
 private int size;
 private Node start,end;  
 public MyLinkedList(){
   size = 0;
   start = null;
   end = null;
 }
 public int size(){
   return size;
 }
 public boolean add(String value){
    Node temp = new Node(value);
   if (size == 0){
     start = end = temp;
     end.setNext(null);
     end.setPrev(null);
     size++;     
   }
   else{
   Node temp2 = end;
   end.setNext(temp);
   end = temp;
   temp.setNext(null);
   size++;
  }
   return true;
 }
 public void add(int index, String value){
   if (index < 0 || index > size){
     throw new IndexOutOfBoundsException("Index out of bound");
   }
   Node temp = helperIndexMethod(index);
   Node temp2 = new Node(value);
   Node temp3 = temp2.getNext();
   Node temp4 = helperIndexMethod(index -1);
   if (size == 0){
     start = temp2;
     end = temp2;
   }
   else if (index == 0){
     start.setPrev(temp2);
     start = temp2;
     start.setNext(temp3);
   }
   else if (index == size){
     temp2.setPrev(end);
     end.setNext(temp2);
     end = temp2;
   }
   else{
   temp.setPrev(temp2);
   temp4.setNext(temp2);
   temp2.setNext(temp);
   temp2.setPrev(temp4);
 }
 size++;
  }
 
 private Node helperIndexMethod(int index){
   Node term = start;
   for (int i = 0; i < index;i++){
     term = start.getNext();
   }
   return term;
 }
  public String get(int index){
    if (index < 0 || index > size){
      throw new IndexOutOfBoundsException("Index out of bound");
    }
    return helperIndexMethod(index).getData();
  }
  public String set(int index, String value){
    if (index < 0 || index > size){
      throw new IndexOutOfBoundsException("Index out of bound");
    }
     helperIndexMethod(index).setData(value);
     return helperIndexMethod(index).getData();
  }
 public String toString()
 {
   Node Start = start;
   String s = "[";
   for (int i = 0 ; i < size; i++){
     s += Start.getData() + ",";
     Start = Start.getNext();
  }
  return s;
}
   
   
 //Any helper method that returns a Node object MUST BE PRIVATE!
}