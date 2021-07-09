package com.linklistimpl;

/**
 * This class represents a singly linked list which contains nodes of type SinglePointerNode.
 * It contains a head pointer and a integer which stores size of linked list. It provides different
 * methods to operate on singly linked list.
 * @author Hemant
 *
 */
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
      node.setNextNode(this.head);
      this.head = node;
    } else {    
      SinglePointerNode currentNode = this.head;
      for(int i=1;i<index;i++) {
        currentNode = currentNode.getNextNode();
      }
    
      SinglePointerNode tempNode = currentNode.getNextNode();      
      currentNode.setNextNode(node);
      node.setNextNode(tempNode);    
    }
    
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
   * @return Head node
   */
  public SinglePointerNode getHead() {
    return this.head;
  }
  
  /**
   * This function removes the last node from list.
   * @return Data of last node
   */
  public int remove() {
    SinglePointerNode currentNode = this.head;
    int data;
    if(this.count==0) {
      throw new IndexOutOfBoundsException("Deletion from an empty list");
    } else if(this.count == 1) {
      data = head.getData();
      this.head = null;      
    } else {
      while(currentNode.getNextNode().getNextNode() != null) {
        currentNode = currentNode.getNextNode();
      }
      data = currentNode.getNextNode().getData();
      currentNode.setNextNode(null);
    }
    this.count--;
    return data;
  }
  
  /**
   * This function removes the last node from list.
   * @return Data of last node
   */
  public int pop() {
    return remove();
  }
  
  /**
   * This function removes the node at specified index and returns the data of that node.
   * @param index Index of the node to be removed (Index starts from 0)
   * @return Data of node
   */
  public int remove(int index) {
    if(this.count==0) {
      throw new IndexOutOfBoundsException("Deletion from an empty list");
    } else if(this.count <= index) {
      throw new IndexOutOfBoundsException("Specified index: " + index + ", last index: " + (this.count-1));
    }
    
    int data;
    
    if(index==0) {
      data = this.head.getData();
      this.head = this.head.getNextNode();
    } else {    
      SinglePointerNode currentNode = this.head;
      for(int i=1;i<index;i++) {
        currentNode = currentNode.getNextNode();
      }
      data = currentNode.getNextNode().getData();
      currentNode.setNextNode(currentNode.getNextNode().getNextNode());
    }
    this.count--;
    return data;
  }
  
  /**
   * This function return the index of provided element. Return -1 if data not found.
   * @param data Data to be searched
   * @return Index of the node in which data is present
   */
  public int indexOf(int data) {
    int foundIndex = -1;
    
    if(this.count > 0) {
      int atIndex = 0;
      SinglePointerNode currentNode = this.head;
      while(currentNode != null) {
        if(currentNode.getData() == data) {
          foundIndex = atIndex;
          break;
        }
        currentNode = currentNode.getNextNode();
        atIndex++;
      }
    }
    return foundIndex;
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
