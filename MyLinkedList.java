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
   Node temp2 = new Node(value);
   Node temp3 = start;
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
     Node temp = helperIndexMethod(index);
     Node temp4 = helperIndexMethod(index-1);
     temp2.setNext(temp);
     temp2.setPrev(temp4);
     temp4.setNext(temp2);
     temp.setPrev(temp2);
 }
 size++;
  }
 
 private Node helperIndexMethod(int index){
   Node term = start;
   for (int i = 0; i < index;i++){
     term = term.getNext();
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
  
public String remove(int index){
  if (index < 0 || index > size){
    throw new IndexOutOfBoundsException("Index out of bound");
  }
  if (size == 1){
    start = null;
    end = null;
    size--;
  }
  else if(index == 0){
    start = start.getNext();
    start.setPrev(null);
  }
  else if (index == size - 1){
    end = end.getPrev();
    end.setNext(null);
  }
}
 public String toString()
 {
   Node Start = start;
   String s = "[";
   if (size == 0){
     s += Start.getData() + "]";
     return s;
   }
   for (int i = 0 ; i < size; i++){
    if (i != size-1){
     s += Start.getData() + ",";
   }
   else{
     s+= Start.getData() + "]";
   }
   Start = Start.getNext();
  }
  return s;
}
   
   
 //Any helper method that returns a Node object MUST BE PRIVATE!
}