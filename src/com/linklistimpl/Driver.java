package com.linklistimpl;

public class Driver {
  public static void main(String[] args) {
    
    SinglyLinkedList linkedList = new SinglyLinkedList();
    linkedList.add(1);
    linkedList.add(2);
    linkedList.add(4);
    linkedList.add(3,2);
    linkedList.print();
    linkedList.remove();
    linkedList.remove();
    linkedList.remove(0);
    linkedList.print();
    
    DoublyLinkedList linkedList2 = new DoublyLinkedList();
    linkedList2.add(1);
    linkedList2.add(2);
    linkedList2.add(4);
    linkedList2.add(3,2);
    linkedList2.print();
    linkedList2.printReverse();
    linkedList2.remove();
    linkedList2.remove();
    linkedList2.remove(0);
    linkedList2.print();
    linkedList2.printReverse();    
  }
}
