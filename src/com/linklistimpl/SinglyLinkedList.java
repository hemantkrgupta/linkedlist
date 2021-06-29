package com.linklistimpl;

public class SinglyLinkedList {
  private int count;
  private SinglePointerNode head;
  
  /**
   * This constructor creates an empty singly linked list with zero nodes.
   */
  public SinglyLinkedList(){
    this.count=0;
  }
  
  /**
   * This function returns total number of nodes in the singly linked list.
   * @return Size of list
   */
  public int size() {
    return this.count;
  }
  
  /**
   * This function return true if the list is empty, else false.
   * @return True for empty list, else false
   */
  public boolean isEmpty() {
    if(this.count==0) {
      return true;
    }
    return false;
  }
  
  /**
   * This function adds a node at the end of singly linked list with provided data.
   * @param data Data to store in the newly added node
   */
  public void add(int data) {
    SinglePointerNode node = new SinglePointerNode(data);
    
    if(this.count == 0) {
      this.head = node;
    } else {
      SinglePointerNode currentNode = this.head;
      while(currentNode.getNextNode() != null) {
        currentNode = currentNode.getNextNode();
      }
      currentNode.setNextNode(node);
    }
    this.count++;
  }
  
  /**
   * This function adds a node at the specified index of singly linked list with provided data.
   * @param data Data to store in the newly added node
   * @param index Index to add the node (Starts from 0)
   */
  public void add(int data, int index) {
    if(index > this.count) {
      throw new IllegalArgumentException("Specified index: " + index + ", last index: " + (this.count-1));
    }
    
    SinglePointerNode node = new SinglePointerNode(data);
    
    if(index == 0) {      
      SinglePointerNode tempNode = this.head.getNextNode();      
      this.head = node;
      this.head.setNextNode(tempNode);
    }
    
    SinglePointerNode currentNode = this.head;
    for(int i=1;i<index;i++) {
      currentNode = currentNode.getNextNode();
    }
    
    SinglePointerNode tempNode = currentNode.getNextNode();      
    currentNode.setNextNode(node);
    node.setNextNode(tempNode);    
    
    this.count++;
  }
  
  /**
   * This function adds a node at the end of singly linked list with provided data.
   * @param data Data to store in the newly added node
   */
  public void push(int data) {
    add(data);
  }
  
  /**
   * This function prints all the data present in singly linked list.
   */
  public void print() {
    System.out.println(this);
  }
  
  /**
   * This function returns the head node of singly linked list.
   * @return
   */
  public SinglePointerNode getHead() {
    return this.head;
  }
  
  /**
   * This function sets the head of singly linked list to provided node.
   * (Any data, if present in the singly linked list, will be lost)
   * @param node Node to set as head
   */
  public void setHead(SinglePointerNode node) {
    this.head = node;    
    this.count=0;
    
    while(node != null) {
      this.count++;
      node = node.getNextNode();
    }
  }
  
  /**
   * This function provides the string representation of singly linked list.
   */
  public String toString() {
    StringBuilder linkedList = new StringBuilder();
    
    if(this.count == 0) {
      return "";
    }
    
    SinglePointerNode currentNode = this.head;
    
    while(currentNode != null) {
      linkedList.append(currentNode.getData());
      linkedList.append(" -> ");
      currentNode = currentNode.getNextNode();
    }
    
    linkedList.delete(linkedList.length()-4, linkedList.length());
    return linkedList.toString();
  }
}
