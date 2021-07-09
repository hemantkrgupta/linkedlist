package com.linklistimpl;

/**
 * This class represents a doubly linked list which contains nodes of type TwoPointerNode.
 * It contains a head pointer, a tail pointer and an integer which stores size of linked list.
 * It provides different methods to operate on doubly linked list.
 * @author Hemant
 *
 */
public class DoublyLinkedList {
  private int count;
  private TwoPointerNode head;
  private TwoPointerNode tail;
  
  /**
   * This constructor creates an empty doubly linked list with zero nodes.
   */
  public DoublyLinkedList(){
    this.count=0;
  }
  
  /**
   * This function returns total number of nodes in the doubly linked list.
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
   * This function adds a node at the end of doubly linked list with provided data.
   * @param data Data to store in the newly added node
   */
  public void add(int data) {
    TwoPointerNode node = new TwoPointerNode(data);
    //Without using tail
//    this.tail = node;
//    
//    if(this.count == 0) {
//      this.head = node;
//    } else {
//      TwoPointerNode currentNode = this.head;
//      while(currentNode.getNextNode() != null) {
//        currentNode = currentNode.getNextNode();
//      }
//      currentNode.setNextNode(node);
//      node.setPrevNode(currentNode);
//    }
//    this.count++;
    
    //With tail
    if(this.count == 0) {
      this.tail = node;
      this.head = node;
    } else {
      node.setPrevNode(this.tail);
      this.tail.setNextNode(node);
      this.tail = node;
    }
    this.count++;
  }
  
  /**
   * This function adds a node at the specified index of doubly linked list with provided data.
   * @param data Data to store in the newly added node
   * @param index Index to add the node (Starts from 0)
   */
  public void add(int data, int index) {
    if(index > this.count) {
      throw new IllegalArgumentException("Specified index: " + index + ", last index: " + (this.count-1));
    }
    
    TwoPointerNode node = new TwoPointerNode(data);
    
    if(this.count == 0) {
      this.head = node;
      this.tail = node;
    } else if(index == 0) {      
      node.setNextNode(this.head);
      this.head.setPrevNode(node);
      this.head = node;
    } else if((this.count-1) == index) {
      this.tail.setNextNode(node);
      node.setPrevNode(this.tail);
      this.tail = node;
    } else {    
      TwoPointerNode currentNode = this.head;
      for(int i=1;i<index;i++) {
        currentNode = currentNode.getNextNode();
      }
    
      TwoPointerNode tempNode = currentNode.getNextNode();      
      currentNode.setNextNode(node);
      node.setNextNode(tempNode);    
    }
    
    this.count++;
  }
  
  /**
   * This function adds a node at the end of doubly linked list with provided data.
   * @param data Data to store in the newly added node
   */
  public void push(int data) {
    add(data);
  }
  
  /**
   * This function prints all the data present in doubly linked list.
   */
  public void print() {
    System.out.println(this);
  }
  
  /**
   * This function print all the data present in doubly linked list in reverse fashion.
   */
  public void printReverse() {
    if(this.count==0) {
      System.out.println();
    } else {
      StringBuilder reverseList = new StringBuilder();
      TwoPointerNode currentNode = this.tail;
      reverseList.append(currentNode.getData());
      while(currentNode.getPrevNode() != null) {
        currentNode = currentNode.getPrevNode();
        reverseList.append(" -> ").append(currentNode.getData());
      }
      System.out.println(reverseList);
    }
  }
  
  /**
   * This function returns the head node of doubly linked list.
   * @return Head node of list
   */
  public TwoPointerNode getHead() {
    return this.head;
  }
  
  /**
   * This function returns the tail node of doubly linked list.
   * @return tail node of list
   */
  public TwoPointerNode getTail() {
    return this.tail;
  }

  /**
   * This function removes the last node from list.
   * @return Data of last node
   */
  public int remove() {
//    TwoPointerNode currentNode = this.head;
    int data;
    if(this.count==0) {
      throw new IndexOutOfBoundsException("Deletion from an empty list");
    } else if(this.count == 1) {
      data = this.head.getData();
      this.head = null;
      this.tail = null;
    } else {
//      Without using tail
//      while(currentNode.getNextNode().getNextNode() != null) {
//        currentNode = currentNode.getNextNode();
//      }
//      data = currentNode.getNextNode().getData();
//      currentNode.setNextNode(null);
//      this.tail = currentNode;
      
//      With tail
      data = this.tail.getData();
      this.tail = this.tail.getPrevNode();
      this.tail.setNextNode(null);
      
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
    
    if(this.count == 1) {
      data = this.head.getData();
      this.head = null;
      this.tail = null;
    } else if(index==0) {
      data = this.head.getData();
      this.head = this.head.getNextNode();
      this.head.setPrevNode(null);
    } else if(index == (this.count-1)) {
      data = this.tail.getData();
      this.tail = this.tail.getPrevNode();
      this.tail.setNextNode(null);
    } else {    
      TwoPointerNode currentNode = this.head;
      for(int i=1;i<index;i++) {
        currentNode = currentNode.getNextNode();
      }
      data = currentNode.getNextNode().getData();
      currentNode.setNextNode(currentNode.getNextNode().getNextNode());
      currentNode.getNextNode().setPrevNode(currentNode);
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
      TwoPointerNode currentNode = this.head;
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
    
    TwoPointerNode currentNode = this.head;
    
    while(currentNode != null) {
      linkedList.append(currentNode.getData());
      linkedList.append(" -> ");
      currentNode = currentNode.getNextNode();
    }
    
    linkedList.delete(linkedList.length()-4, linkedList.length());
    return linkedList.toString();
  }
}
