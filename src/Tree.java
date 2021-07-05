public class Tree {
    Node root = new Node(-1);
    boolean addToLeft = true;

    public Tree(int value) {
        this.root.value = value;
    }

    public void add(int value) {
        addRecursive(root, value);
    }

    private void addRecursive(Node node, int value) {
        if (value <= node.value) {
            if (node.left == null) {
                node.left = new Node(value);
                return;
            } else {
                addRecursive(node.left, value);
            }
        }
        if (value >= node.value) {
            if (node.right == null) {
                node.right = new Node(value);
                return;
            } else {
                addRecursive(node.right, value);
            }
        }
    }

    public void print() {
        printRecursive(root);
    }

    private void printRecursive(Node node) {
        System.out.println(node.value);
        if (node.left != null) {
            printRecursive(node.left);
        }
        if (node.right != null) {
            printRecursive(node.right);
        }
    }
}