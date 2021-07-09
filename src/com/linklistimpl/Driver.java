package com.linklistimpl;

/**
 * Driver class to test link list functions.
 * @author Hemant
 *
 */
public class Driver {
  public static void main(String[] args) {
    
    SinglyLinkedList linkedList = new SinglyLinkedList();
    linkedList.add(1);
    linkedList.add(2);
    linkedList.add(4);
    linkedList.add(3,2);
    linkedList.add(5);
    linkedList.add(8);
    linkedList.print();
    linkedList.remove();
    linkedList.remove();
    linkedList.remove(0);
    linkedList.add(5);
    linkedList.add(6);
    linkedList.add(10);
    linkedList.add(34);
    linkedList.add(23);
    linkedList.add(90);
    linkedList.print();
    
    DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
    doublyLinkedList.add(1);
    doublyLinkedList.add(2);
    doublyLinkedList.add(4);
    doublyLinkedList.add(3,2);
    doublyLinkedList.print();
    doublyLinkedList.printReverse();
    doublyLinkedList.remove();
    doublyLinkedList.remove();
    doublyLinkedList.remove(0);
    doublyLinkedList.add(10);
    doublyLinkedList.add(73);
    doublyLinkedList.add(105);
    doublyLinkedList.add(36);
    doublyLinkedList.add(67);
    doublyLinkedList.print();
    doublyLinkedList.printReverse();
    
    System.out.println("Middle Element: " + FindMidElement.findMid(linkedList.getHead()));
    
    System.out.println("3rd from last: " + NthFromLast.getNthFromLast(linkedList.getHead(), 3));
    
    SinglePointerNode rotatedHead = RotateLinkedList.rotate(linkedList.getHead(), 3);
    System.out.println("Rotated singly linked list 3 nodes: ");
    printNode(rotatedHead);
    
    TwoPointerNode rotatedDoubleHead = RotateLinkedList.rotate(doublyLinkedList.getHead(), 3);
    System.out.println("Rotated doubly linked list 3 nodes: ");
    printNode(rotatedDoubleHead);
    
    SinglyLinkedList sortedList1 = new SinglyLinkedList();
    sortedList1.add(1);
    sortedList1.add(5);
    sortedList1.add(25);
    sortedList1.add(96);
    SinglyLinkedList sortedList2 = new SinglyLinkedList();
    sortedList2.add(2);
    sortedList2.add(10);
    sortedList2.add(148);
    SinglePointerNode mergedHead = SortedMerge.sortedMerge(sortedList1.getHead(), sortedList2.getHead());
    System.out.print("Merged sorted list: ");
    printNode(mergedHead);    
    
    linkedList = new SinglyLinkedList();
    linkedList.add(5);
    linkedList.add(55);
    linkedList.add(567);
    linkedList.add(78);
    linkedList.add(13);
    System.out.print("Reversed Linked List: ");
    printNode(ReverseLinkedList.reverse(linkedList.getHead()));
    
    doublyLinkedList = new DoublyLinkedList();
    doublyLinkedList.add(4);
    doublyLinkedList.add(657);
    doublyLinkedList.add(23);
    doublyLinkedList.add(978);
    printNode(ReverseLinkedList.reverse(doublyLinkedList.getHead()));
  }
  
  public static void printNode(SinglePointerNode head) {
    while(head != null) {
      System.out.print(head.getData() + " -> ");
      head = head.getNextNode();
    }
    System.out.println();
  }
  
  public static void printNode(TwoPointerNode head) {
    TwoPointerNode tail=null;
    System.out.print("As it is: ");
    while(head != null) {
      System.out.print(head.getData() + " -> ");
      tail = head;
      head = head.getNextNode();
    }
    System.out.println();
    
    StringBuilder reverseList = new StringBuilder();
    TwoPointerNode currentNode = tail;
    reverseList.append(currentNode.getData());
    while(currentNode.getPrevNode() != null) {
      currentNode = currentNode.getPrevNode();
      reverseList.append(" -> ").append(currentNode.getData());
    }
    System.out.println("Reverse: " + reverseList);
  }  
}
