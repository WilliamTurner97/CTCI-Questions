public class ValidateBST {

    public static void main(String[] args) {
        System.out.println(validateBST(MinimalTree.arrayToTree(
                new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18}).getRoot()));

    }

    public static boolean validateBST(Tree.TreeNode n){
        return((n.leftMost == null || (n.value > n.leftMost.value && validateBST(n.leftMost)))
                && (n.rightMost == null || (n.value <= n.rightMost.value && validateBST(n.rightMost))));
    }
}
