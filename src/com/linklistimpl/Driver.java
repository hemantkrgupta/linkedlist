package com.linklistimpl;

public class Driver {
  public static void main(String[] args) {
    SinglyLinkedList ll = new SinglyLinkedList();
    ll.add(1);
    ll.add(1);
    ll.add(1);
    ll.add(1);
    ll.add(1);
    System.out.println(ll);
    System.out.println(ll.size());
    ll.add(5,6);
    System.out.println(ll);
    System.out.println(ll.size());
//    ll.add(3, 3);
//    System.out.println(ll);
//    System.out.println(ll.size());
//    ll.add(5,0);
//    System.out.println(ll);
//    System.out.println(ll.size());
//    ll.add(6,1);
//    System.out.println(ll);
//    System.out.println(ll.size());
    
    SinglePointerNode node = new SinglePointerNode(5);
    node.setNextNode(new SinglePointerNode(6));
    node.getNextNode().setNextNode(new SinglePointerNode(7));
    ll.setHead(node);
    System.out.println(ll);
    System.out.println(ll.size());
    
    
  }
}
