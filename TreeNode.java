import java.util.ArrayList;
import java.util.Objects;

public class TreeNode {

    String value;
    ArrayList<TreeNode> children;
    TreeNode parent;
    static int nodesCounter;
    int nodeID;

    public TreeNode(String value) {
        this();
        setValue(value);
        nodeID = nodesCounter++;
    }

    public TreeNode() {
        children = new ArrayList<>();
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node" + value;
    }

    public void addChild(TreeNode child) {
        child.parent = this;
        children.add(child);
    }

    public static void treeSearch(TreeNode root) {
        ArrayList<TreeNode> storage = new ArrayList<>();
        storage.add(root);

        while (storage.size() > 0) {
            TreeNode node = storage.get(0);
            storage.remove(0);
            System.out.println(node);

            if (node.children.size() != 0) {
                storage.addAll(node.children);
            }
        }
    }

    public static void preOrder(TreeNode root) {
        if (root != null) {
            System.out.print(root.value);
            if (root.children.size() != 0)
                System.out.print("(");
            for (int i = 0; i < root.children.size(); i++) {
                preOrder(root.children.get(i));
                if (i == root.children.size() - 1)
                    System.out.print(")");
                else
                    System.out.print(",");
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        var n = (TreeNode) o;
        return children.size() == n.children.size();
    }

    @Override
    public int hashCode() {
        return Objects.hash(children);
    }
}
