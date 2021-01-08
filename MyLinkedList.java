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
    if (size > 1) {
      a.setPrev(end) ;
      end.setNext(a) ;
    }
    end = a ;
    return true ;
  }

  public String get(int index) {
    if (index >= size || index < 0) {
      throw new IndexOutOfBoundsException();
    }
    String returnValue = start.getData() ;
    Node a = start ;
    for (int i=0; i<index; i++) {
      a = a.getNext() ;
    }
    returnValue = a.getData() ;
    return returnValue ;
  }

  public void add(int index, String value) {
    Node a = new Node(value) ;
    size++ ;
    if (index == 0) {
      a.setNext(start) ;
      start.setPrev(a) ;
      start = a ;
    }
    if (index == size()-1) {
      end.setNext(a) ;
      a.setPrev(end) ;
      end = a ;
    }
    Node b = start ;
    if ((index != 0) && (index != size()-1)) {
      for (int i=0; i<index-1; i++) {
        b = b.getNext() ;
      }
      b.setNext(a) ;
      a.setPrev(b) ;
      b = b.getNext() ;
      a.setNext(b) ;
      b.setPrev(a) ;
    }

  }




}
