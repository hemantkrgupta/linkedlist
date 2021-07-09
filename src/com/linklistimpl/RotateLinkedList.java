package com.linklistimpl;

/**
 * This class provides rotate functions. These functions rotates the linked list counter-clockwise
 * by k nodes, where k is a given positive integer smaller than or equal to length of the linked list.
 * Functions take O(n) time and constant space.
 * @author Hemant
 *
 */
public class RotateLinkedList {
  /**
   * This function rotates a given singly linked list anti clockwise by k nodes
   * @param head Head pointer of linked list
   * @param k Positive integer smaller than or equal to length of the linked list
   * @return New head after rotation
   */
  public static SinglePointerNode rotate(SinglePointerNode head, int k) {
      //Only one node is there
      if(head.getNextNode() == null){
          return head;
      }
      
      SinglePointerNode currentNode = head;
      for(int i=0;i<k-1;i++){
          currentNode = currentNode.getNextNode();
      }
      
      //If k is equal to the total number of elements, there will not be any change
      if(currentNode.getNextNode() == null){
          return head;
      }
      
      SinglePointerNode newHead = currentNode.getNextNode();
      currentNode.setNextNode(null);
      currentNode = newHead;
      
      while(currentNode.getNextNode() != null){
          currentNode = currentNode.getNextNode();
      }
      
      currentNode.setNextNode(head);
      return newHead;
  }
  
  /**
   * This function rotates a given doubly linked list anti clockwise by k nodes
   * @param head Head pointer of linked list
   * @param k Positive integer smaller than or equal to length of the linked list
   * @return New head after rotation
   */
  public static TwoPointerNode rotate(TwoPointerNode head, int k) {
      //Only one node is there
      if(head.getNextNode() == null){
          return head;
      }
      
      TwoPointerNode currentNode = head;
      for(int i=0;i<k-1;i++){
          currentNode = currentNode.getNextNode();
      }
      
      //If k is equal to the total number of elements, there will not be any change
      if(currentNode.getNextNode() == null){
          return head;
      }
      
      TwoPointerNode newHead = currentNode.getNextNode();
      currentNode.setNextNode(null);
      currentNode = newHead;
      newHead.setPrevNode(null);
      
      while(currentNode.getNextNode() != null){
          currentNode = currentNode.getNextNode();
      }
      
      currentNode.setNextNode(head);
      head.setPrevNode(currentNode);
      return newHead;
  }
}
