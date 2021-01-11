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
    return null;
  }
  else if(index == 0){
    Node startTemp = start;
    start = start.getNext();
    start.setPrev(null);
    size--;
    return startTemp.getData();
  }
  else if (index == size - 1){
    Node endTemp = end;
    end = end.getPrev();
    end.setNext(null);
    size--;
    return endTemp.getData();
  }
  else {
    Node temp = helperIndexMethod(index-1);
    Node temp2 = helperIndexMethod(index+1);
    Node temp3 = helperIndexMethod(index);
    temp.setNext(temp2);
    temp2.setPrev(temp);
    size--;
    return temp3.getData();
  }  
  
}
public void extend(MyLinkedList other){
  if (size == 0){
    start = other.start;
    end = other.end;
    size = other.size;
  }
  else if (other.size == 0){
    other.start = start;
    end = other.end;
    size = other.size;
  }
  else if (size == 0 && other.size == 0){
    start = null;
    end = null;
    size = 0;
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