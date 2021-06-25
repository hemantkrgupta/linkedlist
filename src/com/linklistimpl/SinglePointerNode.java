package com.linklistimpl;

/**
 * This class represents a node to be used to construct a singly linked list. It contains data
 * and next node pointer.
 * @author Hemant
 *
 */
public class SinglePointerNode {
  private int data;
  private SinglePointerNode next;
  
  /**
   * Constructs a node with provided int data and next node as null.
   * @param data Node data
   */
  public SinglePointerNode(int data) {
    this.data = data;
  }
  
  /**
   * This function returns the data in the node.
   * @return Integer data
   */
  public int getData() {
    return this.data;
  }
  
  /**
   * This function sets the next node pointer to provided node.
   * @param node Next node
   */
  public void setNextNode(SinglePointerNode node) {
    this.next = node;
  }
  
  /**
   * This function returns the next node pointed by this node.
   * @return Next node
   */
  public SinglePointerNode getNextNode() {
    return this.next;
  }
}
