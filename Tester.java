public class Tester{
  public static void main(String[]args){
    MyLinkedList words = new MyLinkedList();
    words.add("hi");
    words.add("i");
    words.add("2hi");
    words.add("h3i");
    words.add("hi4");
    words.add("hi21");
    words.add("hi32");
    words.add(0,"bob");
    //words.set(0,"bob");
    //System.out.print(words.get(1));
    System.out.print(words);
}
}