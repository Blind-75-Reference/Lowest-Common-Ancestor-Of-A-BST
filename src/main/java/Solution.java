class Solution {
    /*
    This recursive solution utilized the constraints of a BST to find the LCA while traversing the tree only once.
    A BST should maintain a sorted order. With the node values sorted such that for any node all nodes in the left
    sub-tree should contain only values that are less than the root's value. All nodes in the right sub-tree should
    have values greater than the root value. This is why it's called a Binary Search Tree, every node is a pivot point
    in a binary search.

    Knowing this our solution is fairly simple. We consider the values of p and q, as well as the value of the root.
    If p and q are both less than root, they will be found in the left sub-tree. If greater, found in the right
    sub-tree. If we find that either p or q is less, and the other is greater, then we have found the node where
    the path to each diverges, this is our Lowest Common Ancestor.

    We preform these checks, and recursively call the lowestCommonAncestor() method until we arrive at the node
    where the paths diverge. Then we return that node all the way up the stack.
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p.val < root.val && q.val < root.val) {
            //both nodes are in left sub-tree, recurse on left sub-tree
            return lowestCommonAncestor(root.left, p, q);
        } else if(p.val > root.val && q.val > root.val) {
            //both nodes are in right sub-tree, recurse to the right
            return lowestCommonAncestor(root.right, p, q);
        } else {
            //p & q are split left and right, this is the LCA
            return root;
        }
    }
}