package com.linklistimpl;

public class ReverseLinkedList {
  
  /**
   * This function reverse the sequence of nodes of singly linked list.
   * @param node Head pointer of linked list.
   * @return Head pointer of reversed linked list.
   */
  public static SinglePointerNode reverse(SinglePointerNode node) {
    if(node == null || node.getNextNode() == null) {
      return node;
    }
    
    SinglePointerNode currentNode = node.getNextNode();
    SinglePointerNode prevNode = node;
    SinglePointerNode nextNode = node.getNextNode().getNextNode();
    
    //set next of head to null
    prevNode.setNextNode(null);
    
    while(nextNode != null) {
      currentNode.setNextNode(prevNode);
      prevNode = currentNode;      
      currentNode = nextNode;
      nextNode = nextNode.getNextNode();
    }
    //Set next node pointer to previous node for the last node
    currentNode.setNextNode(prevNode);
    return currentNode;
  }
  
  /**
   * This function reverse the sequence of nodes of doubly linked list.
   * @param node Head pointer of linked list.
   * @return Head pointer of reversed linked list.
   */
  public static TwoPointerNode reverse(TwoPointerNode node) {
    if(node == null || node.getNextNode() == null) {
      return node;
    } 
    
    TwoPointerNode currentNode, nextNode, prevNode;
    currentNode = node.getNextNode();
    prevNode = node;
    nextNode = currentNode.getNextNode();
    prevNode.setNextNode(null);
    
    while(nextNode!=null) {
      prevNode.setPrevNode(currentNode);
      currentNode.setNextNode(prevNode);
      currentNode.setPrevNode(nextNode);
      prevNode = currentNode;
      currentNode = nextNode;
      nextNode = nextNode.getNextNode();
    }
    
    prevNode.setPrevNode(currentNode);
    currentNode.setNextNode(prevNode);
    currentNode.setPrevNode(nextNode);
    return currentNode;
      
  }
}
