package binarytree;

/**
 *
 * @author 201626829
 */
public class Node {
    int value;
    Node left;
    Node right;

    public Node() {
    }

    public Node(int value) {
        this.value = value;
        left=right=null;
    }
}
