package com.linklistimpl;

/**
 * This class provides getNthFromLast function. This function takes two arguments:
 * reference to head and N and returns Nth node's data from the end or -1 in case node
 * doesn't exist in O(n) time and constant space.
 * @author Hemant
 *
 */
public class NthFromLast {
  /**
   * This function returns Nth node from the end or -1 in case node doesn't exist..
   * @param head Pointer to head node
   * @param n Integer to search for nth node from the end
   * @return Data of nth node from end
   */
  public static int getNthFromLast(SinglePointerNode head, int n)
  {
    SinglePointerNode currentNode = head;
    for(int i=1;i<n;i++){
      if(currentNode == null) {
        return -1;
      }
      currentNode = currentNode.getNextNode();
    }
    if(currentNode == null) {
      return -1;
    }
    SinglePointerNode nNode = head;
    while(currentNode.getNextNode() != null) {
      currentNode = currentNode.getNextNode();
      nNode = nNode.getNextNode();
    }
    return nNode.getData();
  }
}
