package com.linklistimpl;

public class FindMidElement {
  /**
   * This function finds the mid element in a given linked list.
   * (To specify the logic, list.size methods is not used).
   * @param list SinglyLinkedList
   */
  public static void findMid(SinglyLinkedList list) {
    if(list.size()==0) {
      System.out.println("Empty list");
      return;
    }
    
    SinglePointerNode midNode = list.getHead();
    SinglePointerNode currentNode = list.getHead();
    int i = 0;
    
    while(currentNode.getNextNode() != null) {
      currentNode = currentNode.getNextNode();
      if(i == 0) {
        i = 1;
      } else {
        i = 0;
        midNode = midNode.getNextNode();
      }
    }    
    System.out.println("Middle Element: " + midNode.getData());
  }
}
