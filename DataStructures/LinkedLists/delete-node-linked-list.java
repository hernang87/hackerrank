/*
  Delete Node at a given position in a linked list
  head pointer input could be NULL as well for empty list
  Node is defined as
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission.
    // You only need to complete this method.

Node Delete(Node head, int position) {
    if(position == 0) {
        return head.next;
    }

    int i = 0;
    Node node = head;
    while(i < position-1 && node != null) {
        node = node.next;
        i++;
    }

    node.next = node.next.next;

    return head;
}
