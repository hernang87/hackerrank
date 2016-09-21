/*
  Compare two linked lists A and B
  Return 1 if they are identical and 0 if they are not.
  Node is defined as
  class Node {
     int data;
     Node next;
  }
*/
int CompareLists(Node headA, Node headB) {
    Node a = headA;
    Node b = headB;
    int equal = 1;

    while(a != null && b != null && equal == 1) {
        if(a.data != b.data) {
            equal = 0;
        }
        a = a.next;
        b = b.next;
    }

    if(a == null ^ b == null) {
        return 0;
    }

    return equal;

}
