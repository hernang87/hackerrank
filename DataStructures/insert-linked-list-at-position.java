/*
  Insert Node at a given position in a linked list
  head can be NULL
  First element in the linked list is at position 0
  Node is defined as
  class Node {
     int data;
     Node next;
  }
*/


Node InsertNth(Node head, int data, int position) {

    if(position == 0) {
        Node n = new Node();
        n.next = head;
        n.data = data;
        return n;
    }

    Node node = head;
    int i = 1;

    while(i < position) {
        node = node.next;
        i++;
    }

    Node old = node.next;


    Node newNode = new Node();
    newNode.data = data;
    newNode.next = old;

    node.next = newNode;

    return head;
}
