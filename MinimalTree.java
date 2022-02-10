import java.util.Arrays;

public class MinimalTree {

    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};
        System.out.println(arrayToTree(arr).getDepth());
    }

    public static Tree arrayToTree(int[] values) {
        Tree t = new Tree();
        Tree.TreeNode n = treeBuilder(values, null, t);
        t.setRoot(n);
        return t;
    }

    public static Tree.TreeNode treeBuilder(int[] values, Tree.TreeNode parent, Tree home){
        int mid = values.length/2;
        Tree.TreeNode n = new Tree.TreeNode(values[mid], parent, home);
        if(values.length > 1)
            n.setLeftMost(treeBuilder(Arrays.copyOfRange(values,0, mid), n, home));
        if(values.length > 2)
            n.setRightMost(treeBuilder(Arrays.copyOfRange(values, mid, values.length-1), n, home));

        return n;
    }
}
