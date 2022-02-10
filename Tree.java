public class Tree {

    TreeNode root;
    int depth;

    public Tree(){
        depth = 0;
    }

    public void setRoot(TreeNode r) {
        this.root = r;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public int getDepth() {
        return depth;
    }

    public static class TreeNode{
        TreeNode parent;
        TreeNode leftMost;
        TreeNode rightMost;
        Tree home;
        Object value;
        int level;

        public TreeNode(Object v, TreeNode p, Tree h){
            home = h;
            parent = p;
            value = v;

            if (parent == null)
                level = 0;
            else
                level = parent.getLevel() + 1;

            if (home.getDepth() < level)
                home.setDepth(level);
        }

        public Tree getHome() {
            return home;
        }

        public void setHome(Tree home) {
            this.home = home;
        }

        public int getLevel() {
            return level;
        }

        public void setParent(TreeNode parent) {
            this.parent = parent;
        }

        public TreeNode getParent() {
            return parent;
        }

        public void setLeftMost(TreeNode leftMost) {
            this.leftMost = leftMost;
        }

        public TreeNode getLeftMost() {
            return leftMost;
        }

        public void setRightMost(TreeNode rightMost) {
            this.rightMost = rightMost;
        }

        public TreeNode getRightMost() {
            return rightMost;
        }

        public void setValue(Object value) {
            this.value = value;
        }

        public Object getValue() {
            return value;
        }
    }
}
