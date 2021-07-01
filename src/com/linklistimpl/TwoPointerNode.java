package com.linklistimpl;

/**
 * This class represents a node to be used to construct doubly linked list. It contains
 * data, previous node pointer and next node pointer.
 * @author Hemant
 *
 */
public class TwoPointerNode {
  private int data;
  private TwoPointerNode prev;
  private TwoPointerNode next;
  
  /**
   * Constructs a node with provided data.
   * @param data Int data to store in constructed node.
   */
  public TwoPointerNode(int data) {
    this.data = data;
  }
  
  /**
   * This function returns the data stored in node.
   * @return Data
   */
  public int getData() {
    return this.data;
  }
  
  /**
   * This functions sets the next pointer to provided node.
   * @param nextNode Next node
   */
  public void setNextNode(TwoPointerNode nextNode) {
    this.next = nextNode;
  }
  
  /**
   * This function returns the next node pointed by this node.
   * @return Next node
   */
  public TwoPointerNode getNextNode() {
    return this.next;
  }
  
  /**
   * This function sets the previous pointer to provided node.
   * @param prevNode Previous node
   */
  public void setPrevNode(TwoPointerNode prevNode) {
    this.prev = prevNode;
  }
  
  /**
   * This function return the previous node pointed by this node.
   * @return Previous node
   */
  public TwoPointerNode getPrevNode() {
    return this.prev;
  }
}
