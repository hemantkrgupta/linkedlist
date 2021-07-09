package com.linklistimpl;

/**
 * This class provides function findMid(SinglyLinkedList).
 * This function finds and prints the middle element of the given linked list in O(n) time.
 * @author Hemant
 *
 */
public class FindMidElement {
  /**
   * This function finds the mid element in a given linked list.
   * (To specify the logic, list.size methods is not used).
   * @param list SinglyLinkedList
   */
  public static int findMid(SinglePointerNode head) {
    if(head == null) {
      throw new IllegalArgumentException("Empty List");
    }
    
    SinglePointerNode midNode = head;
    SinglePointerNode currentNode = head;
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
    return midNode.getData();
  }
}
