


public class MaximumDepthOfBinaryTree {

    Node root;
    static int maxDepth(TreeNode root) {

    if (root == null)
            return 0;
        else {
            /* compute the depth of each subtree */
            int lDepth = maxDepth(root.left);
            int rDepth = maxDepth(root.right);
 
            /* use the larger one */
            if (lDepth > rDepth)
                return (lDepth + 1);
            else
                return (rDepth + 1);
        }
        
        
    }

    public static void main(String[] args)
    {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.right = new TreeNode(7);
        root.right.left = new TreeNode(15);        

 
        System.out.println("Height of tree is "
                           + maxDepth(root));
    }
    
}
