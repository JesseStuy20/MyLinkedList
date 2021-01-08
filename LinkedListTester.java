public class LinkedListTester {

  public static void main(String[] args) {
    MyLinkedList fruitListOne = new MyLinkedList() ;
    System.out.println(fruitListOne.size()) ;
    System.out.println(fruitListOne.add("apples")) ;
    fruitListOne.add("oranges") ;
    fruitListOne.add("strawberries") ;
    System.out.println(fruitListOne.size()) ;
    System.out.println(fruitListOne.get(0)) ;
    System.out.println(fruitListOne.get(1)) ;
    System.out.println(fruitListOne.get(2)) ;
    fruitListOne.add(2,"blueberries") ;
    System.out.println(fruitListOne.toString()) ;
    fruitListOne.add("raspberries") ;
    System.out.println(fruitListOne.set(4,"peaches")) ;
    System.out.println(fruitListOne.toString()) ;
    fruitListOne.add("pineapples") ;
    fruitListOne.add("mangoes") ;
    fruitListOne.add(0,"pears") ;
    fruitListOne.add(5,"dragonfruit") ;
    fruitListOne.add("grapes") ;
    System.out.println(fruitListOne.toString()) ;
    System.out.println(fruitListOne.remove(0)) ;
    System.out.println(fruitListOne.remove(4)) ;
    System.out.println(fruitListOne.remove(7)) ;
    System.out.println(fruitListOne.toString()) ;
    MyLinkedList fruitListTwo = new MyLinkedList() ;
    fruitListTwo.add("papayas") ;
    fruitListTwo.add("watermelons") ;
    fruitListTwo.add("persimmons") ;
    fruitListTwo.add("coconuts") ;
    System.out.println(fruitListTwo.toString()) ;
    fruitListOne.extend(fruitListTwo) ;
    System.out.println(fruitListOne.toString()) ;
    System.out.println(fruitListOne.size()) ;
    System.out.println(fruitListTwo.toString()) ;
    System.out.println(fruitListTwo.size()) ;
  }

}
