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
   end = value;
 }
 public void add(int index, String value){
  if (size == 0){
    add(value);
  }
 }
 private Node helperIndexMethod(int index){
   Node term = start;
   for (int i =0; i < index;i++){
     term = Start.getNext();
   }
   return term;
 }
 public String get(int index);
 public String set(int index, String value);
 public String toString();
 //Any helper method that returns a Node object MUST BE PRIVATE!
}