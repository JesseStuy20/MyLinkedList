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
      throw new IndexOutOfBoundsException() ;
    }
    String returnValue = "" ;
    Node a = start ;
    for (int i=0; i<index; i++) {
      a = a.getNext() ;
    }
    returnValue = a.getData() ;
    return returnValue ;
  }

  public void add(int index, String value) {
    if (index >= size || index < 0) {
      throw new IndexOutOfBoundsException() ;
    }
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
    Node c = start ;
    if ((index != 0) && (index != size()-1)) {
      for (int i=0; i<index-1; i++) {
        b = b.getNext() ;
      }
      for (int i=0; i<index; i++) {
        c = c.getNext() ;
      }
      b.setNext(a) ;
      a.setPrev(b) ;
      c.setPrev(a) ;
      a.setNext(c) ;
    }

  }

  public String set(int index, String value) {
    if (index >= size || index < 0) {
      throw new IndexOutOfBoundsException() ;
    }
    Node a = start ;
    String returnValue = "" ;
    for (int i=0; i<index; i++) {
      a = a.getNext() ;
    }
    returnValue = a.getData() ;
    a.setData(value) ;
    return returnValue ;
  }

  public String toString() {
    String returnValue = "[" ;
    if (size > 0) {
      Node a = start ;
      for (int i=0; i<size-1; i++) {
        returnValue = returnValue + a.getData() + ", " ;
        a = a.getNext() ;
      }
      returnValue = returnValue + a.getData() + "]" ;
  }
    if (size == 0) {
      returnValue = "[]" ;
    }
    return returnValue ;
  }

  public String remove(int index) {
    if (index >= size || index < 0) {
      throw new IndexOutOfBoundsException() ;
    }
    Node returnValue = start ;
    if (index == 0) {
      start = returnValue.getNext() ;
      start.setPrev(returnValue.getPrev()) ;
    }
    if (index == size()-1) {
      returnValue = end ;
      end = returnValue.getPrev() ;
      end.setNext(returnValue.getNext()) ;
    }
    if ((index != 0) && (index != size()-1)) {
      Node b = start ;
      Node c = start ;
      for (int i=0; i<index-1; i++) {
        b = b.getNext() ;
      }
      returnValue = b.getNext() ;
      c = b.getNext().getNext() ;
      b.setNext(c) ;
      c.setPrev(b) ;
    }
    size-- ;
    return returnValue.getData() ;
  }

  public void extend(MyLinkedList other) {
    (this.end).setNext(other.start) ;
    (other.start).setPrev(this.end) ;
    this.end = other.end ;
    other.start = this.start ;
    this.size = (this.size + other.size) ;
    other.size = 0 ;
  }

}
