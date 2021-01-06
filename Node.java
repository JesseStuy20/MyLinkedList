public class Node {
  private String data ;
  private Node next,prev ;

  public Node(String value) {
    data = value ;
  }

  public String getData() {
    return data ;
  }

  public String setData(String value) {
    String returnValue = data ;
    data = value ;
    return returnValue ;
  }

  public Node getNext(Node nextNode) {
    return next ;
  }

  public Node setNext(Node nextNode) {
    Node returnValue = next ;
    next = nextNode ;
    return returnValue
  }



}
