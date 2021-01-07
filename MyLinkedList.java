public class MyLinkedList {
  private int size ;
  private Node start,end ;

  public MyLinkedList() {
    size = 0 ;
  }

  public int size() {
    return size ;
  }

  public boolean add(String value) {
    Node a = new Node(value) ;
    size++ ;
    if (size == 1) {
      start = a ;
    }
    if (size == 2) {
      a.setPrev(start) ;
      start.setNext(a) ;
    }
    if (size > 2) {
      a.setPrev(end) ;
      end.setNext(a) ;
    }
    end = a ;
    return true ;
  }

}
