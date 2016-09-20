/*

 class Node
    int data;
    Node left;
    Node right;
*/
int height(Node root) {
    if(root == null) {
        return -1;
    }

    int leftHeight = 1 + height(root.left);
    int rightHeight = 1 + height(root.right);

    if(leftHeight > rightHeight) {
        return leftHeight;
    }
    return rightHeight;
}
