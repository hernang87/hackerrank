/*
  Reverse a linked list and return pointer to the head
  The input list will have at least one element
  Node is defined as
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission.
    // You only need to complete this method.
Node Reverse(Node head) {
    Node node = null;
    while(head != null){
        Node aux = node;
        node = new Node();
        node.data = head.data;
        node.next = aux;
        head = head.next;
    }

    return node;
}
