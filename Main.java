public class Main {
    public static void main(String[] args) {

        //        1
        //       / \
        //      2   3
        //     /   / \
        //    4   5   6
        //  /   \  /     \
        // 7    9 11     20

        BinaryNode root = new BinaryNode(1);
        BinaryNode node2 = new BinaryNode(2);
        BinaryNode node3 = new BinaryNode(3);
        BinaryNode node4 = new BinaryNode(4);
        BinaryNode node5 = new BinaryNode(5);
        BinaryNode node6 = new BinaryNode(6);
        BinaryNode node7 = new BinaryNode(7);
        BinaryNode node9 = new BinaryNode(9);
        BinaryNode node11 = new BinaryNode(11);
        BinaryNode node20 = new BinaryNode(20);

        root.left = node2;
        node2.left = node4;
        node4.left = node7;
        node4.right = node9;

        root.right = node3;
        node3.left = node5;
        node3.right = node6;
        node6.left = node11;
        node6.right = node20;

        TreeNode tNode1 = new TreeNode("1");
        TreeNode tNode2 = new TreeNode("2");
        TreeNode tNode3 = new TreeNode("3");
        TreeNode tNode4 = new TreeNode("4");
        TreeNode tNode5 = new TreeNode("5");
        TreeNode tNode6 = new TreeNode("6");
        TreeNode tNode7 = new TreeNode("7");
        TreeNode tNode9 = new TreeNode("9");
        TreeNode tNode11 = new TreeNode("11");
        TreeNode tNode20 = new TreeNode("20");

        tNode1.addChild(tNode2);
        tNode2.addChild(tNode4);
        tNode4.addChild(tNode7);
        tNode4.addChild(tNode9);

        tNode1.addChild(tNode3);
        tNode3.addChild(tNode5);
        tNode3.addChild(tNode6);
        tNode6.addChild(tNode11);
        tNode6.addChild(tNode20);

        TreeNode.preOrder(tNode1);
    }
}
