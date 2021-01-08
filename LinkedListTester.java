public class LinkedListTester {

  public static void main(String[] args) {
    MyLinkedList a = new MyLinkedList() ;
    System.out.println(a.size()) ;
    System.out.println(a.add("apples")) ;
    a.add("oranges") ;
    a.add("strawberries") ;
    System.out.println(a.size()) ;
    System.out.println(a.get(0)) ;
    System.out.println(a.get(1)) ;
    System.out.println(a.get(2)) ;
    a.add(2,"blueberries") ;
    System.out.println(a.get(2)) ;
  }
}
