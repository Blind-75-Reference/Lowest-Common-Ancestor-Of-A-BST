import java.util.ArrayList;
import java.util.List;

class Solution {
    /*
    Brute force solution - This two-step solution is fairly straightforward. First traverse the tree
    to find p and q tracking your traversal so the route can be analyzed. Then consider both traversals
    looking for the lowest common ancestor.

    solution unfinished. Do I want to actually do bad solutions? It's becoming more difficult to do the bad solutions
    than the good ones.
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {


        return null;
    }

    private List<Integer> recursiveSearch(TreeNode root, int target, List<Integer> traversalList) {
        if(root == null) {
            return traversalList;
        } else if(root.val == target) {
                traversalList.add(root.val);
                return traversalList;
            }
        }


    }
}