/* you only have to complete the function given below.
Node is defined as

class Node {
    int data;
    Node left;
    Node right;
}

*/
void postOrder(Node node) {
    if(node == null) {
        return;
    }

    postOrder(node.left);
    postOrder(node.right);
    System.out.print(node.data + " ");
}
