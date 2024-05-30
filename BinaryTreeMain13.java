public class BinaryTreeMain13 {

    public static void main(String[] args) {
        BinaryTree13 bt = new BinaryTree13();

        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(15);

        System.out.println("PreOrder Traversal :");
        bt.traversePreOrder(bt.root);
        System.out.println("");
        System.out.println("inOrder Traversal : ");
        bt.traverseInOrder(bt.root);
        System.out.println("");
        System.out.println("PostOrder Traversal : ");
        bt.traversePostOrder(bt.root);
        System.out.println("");
        System.out.println("Find Node : " + bt.find(5));
        System.out.println("Delete Node 8 ");
        bt.delete(8);
        System.out.println("");
        System.out.println("PreOrder Traversal : ");
        bt.traversePreOrder(bt.root);
        System.out.println("");

        // Testing new methods
        System.out.println("Adding nodes recursively");
        bt.addRecursive(20);
        bt.addRecursive(2);
        bt.addRecursive(17);
        bt.traverseInOrder(bt.root);
        System.out.println("");

        System.out.println("Minimum value in the tree: " + bt.findMin());
        System.out.println("Maximum value in the tree: " + bt.findMax());

        System.out.println("Leaf nodes: ");
        bt.printLeaves(bt.root);
        System.out.println("");

        System.out.println("Number of leaf nodes: " + bt.countLeaves(bt.root));
    }
}
