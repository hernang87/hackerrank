/* you only have to complete the function given below.
Node is defined as

class Node {
    int data;
    Node left;
    Node right;
}

*/

void preOrder(Node node) {
    if(node == null) {
        return;
    }

    System.out.print(node.data + " ");

    preOrder(node.left);
    preOrder(node.right);
}
