package com.linklistimpl;

/**
 * This class provides sortedMerge function. This function takes references to the heads
 * of two sorted linked lists as the arguments and returns the head of merged(in-place)
 * linked list. This function takes O(n+m) time and constant space.
 * @author Hemant
 *
 */
public class SortedMerge {
  /**
   * This function takes references to the heads of two sorted linked lists as the arguments and returns the head of merged(in-place) linked list.
   * @param head1 Head of first linked list
   * @param head2 Head of second linked list
   * @return Head of merged linked list
   */
  public static SinglePointerNode sortedMerge(SinglePointerNode head1, SinglePointerNode head2) {
    if(head1 == null) { 
      //First linked list is null, return head of second linked list
      return head2;
    } else if(head2 == null) {
      //Second linked list is null, return head of first linked list
      return head1;
    } else {
      SinglePointerNode newHead;
      SinglePointerNode currentNode;
      SinglePointerNode next;
      
      //Set the head of merged linked list
      if(head1.getData() <= head2.getData()) {
        newHead = head1;
        currentNode = head1;
        head1 = head1.getNextNode();
      } else {
        newHead = head2;
        currentNode = head2;
        head2 = head2.getNextNode();
      }
       
      while(true) {
        if(head1 == null){
          //Reached end of first linked list
          currentNode.setNextNode(head2);
          return newHead;
        } else if(head2 == null){
          //Reached end of second linked list
          currentNode.setNextNode(head1);
          return newHead;
        } else if(head1.getData() <= head2.getData()){
          next = head1;
          head1 = head1.getNextNode();
          currentNode.setNextNode(next);
          currentNode = currentNode.getNextNode();
        } else{
          next = head2;
          head2 = head2.getNextNode();
          currentNode.setNextNode(next);
          currentNode = currentNode.getNextNode();
        }
      }
    }
  }
}
