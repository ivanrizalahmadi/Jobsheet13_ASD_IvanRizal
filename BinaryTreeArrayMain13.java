public class BinaryTreeArrayMain13 {
    public static void main(String[] args) {
        BinaryTreeArray13 bta = new BinaryTreeArray13();

        // Populasi data awal
        int[] data = { 6, 4, 8, 3, 5, 7, 9, 0, 0, 0 };
        int idxLast = 6;
        bta.populateData(data, idxLast);

        // Tambahkan elemen baru
        bta.add(2);
        bta.add(10);

        // Traversal InOrder
        System.out.println("\nInOrder Traversal : ");
        bta.traverseInOrder(0);

        // Traversal PreOrder
        System.out.println("\n\nPreOrder Traversal : ");
        bta.traversePreOrder(0);

        // Traversal PostOrder
        System.out.println("\n\nPostOrder Traversal : ");
        bta.traversePostOrder(0);

        System.out.println("\n");
    }
}
