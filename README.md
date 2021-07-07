# linkedlist

This repository contains java code for linked list. Following are the classes present in this repository:

## 1. SinglePointerNode

This class represents a node with integer data and a next pointer which points to the node of same type. This node is used to construct singly linked lists. It provides methods to:
1. Get data
2. Get next node
3. Set next node

## 2. TwoPointerNode

This class represents a node with integer data, a next pointer and a previous pointer which point to the node of same type. This node is used to construct doubly linked lists. It provides methods to:
1. Get data
2. Get next node
3. Set next node
4. Get previous node
5. Set previous node

## 3. SinglyLinkedList

This class represents a singly linked list which contains nodes of type SinglePointerNode. It contains a head pointer and a integer which stores size of linked list. It provides methods to:
1. Get size of list
2. Check if list is empty
3. Add node at the end
4. Add node at a specified index
5. Print the list
6. Get head of list
7. Delete the last node
8. Delete the node at specified index
9. Search the data and return index

## 4. DoublyLinkedList

This class represents a doubly linked list which contains nodes of type TwoPointerNode. It contains a head pointer, a tail pointer and an integer which stores size of linked list. It provides methods to:
1. Get size of list
2. Check if list is empty
3. Add node at the end
4. Add node at a specified index
5. Print the list
6. Print the list in reverse fashion
7. Get head of list
8. Get tail of list
9. Delete the last node
10. Delete the node at specified index
11. Search the data and return index

## 5. FindMidElement

This class provides function findMid(SinglyLinkedList). This function finds and prints the middle element of the given linked list in O(n) time.

## 6. ReverseLinkedList

This class provides reverse functions. These functions takes the head node of linked list (These are overloaded functions for singly and doubly linked lists), and return the head after reversal of nodes. Functions take O(n) time and constant space.

## 7. RotateLinkedList

This class provides rotate functions. These functions rotates the linked list counter-clockwise by k nodes, where k is a given positive integer smaller than or equal to length of the linked list. Funtions take O(n) time and constant space. For more information, visit https://practice.geeksforgeeks.org/problems/rotate-a-linked-list/1

## 8. NthFromLast

This class provides getNthFromLast function. This function takes two arguments: reference to head and N and returns Nth node's data from the end or -1 in case node doesn't exist in O(n) time and constant space. For more information, visit https://practice.geeksforgeeks.org/problems/nth-node-from-end-of-linked-list/1
