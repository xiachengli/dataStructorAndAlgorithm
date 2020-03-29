package treeAndGraph;

/**
 * 二叉树的遍历：前 中 后
 * 前序：根左右
 * 中序：左根右
 * 后序：左右根
 */
public class BinaryTreeTraversal {

    /**
     * 递归实现
     * 非递归实现：借助栈
     * @param root 根
     */
    public static void preNode(TreeNode root){
        if (root == null){
            return;
        }
        visit(root.value);
        preNode(root.left);
        preNode(root.right);
    }
    private static void visit(int value) {
        System.out.print(value);
    }

    public static void main(String[] args) {

    }
}
