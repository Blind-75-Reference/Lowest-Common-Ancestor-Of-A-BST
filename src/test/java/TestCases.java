import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestCases {
    Solution solution = new Solution();

    static TreeNode tree;

    @BeforeAll
    public static void setup() {
        //ugly tree construction. Too lazy to write a constructor that takes an array.
        tree = new TreeNode(6);
        tree.left = new TreeNode(3);
        tree.right = new TreeNode(10);
        tree.left.left = new TreeNode(2);
        tree.left.right = new TreeNode(4);
        tree.right.left = new TreeNode(7);
        tree.right.right = new TreeNode(12);
        tree.left.left.left = new TreeNode(1);
        tree.right.right.left = new TreeNode(11);
        tree.right.right.right = new TreeNode(15);
    }

    @Test
    public void TestCase1() {
        TreeNode expected = tree;
        TreeNode p = tree.left.left;
        TreeNode q = tree.right.right.right;

        Assertions.assertEquals(expected, solution.lowestCommonAncestor(tree, p, q));
    }

    @Test
    public void TestCase2() {
        TreeNode expected = tree.right.right;
        TreeNode p = tree.right.right.left;
        TreeNode q = tree.right.right.right;

        Assertions.assertEquals(expected, solution.lowestCommonAncestor(tree, p, q));
    }

    @Test
    public void TestCase3() {
        TreeNode expected = tree.right.right;
        TreeNode p = tree.right.right.right;
        TreeNode q = tree.right.right.left;

        Assertions.assertEquals(expected, solution.lowestCommonAncestor(tree, p, q));
    }

    @Test
    public void TestCase4() {
        TreeNode expected = tree.right.right;
        TreeNode p = tree.right.right;
        TreeNode q = tree.right.right.left;

        Assertions.assertEquals(expected, solution.lowestCommonAncestor(tree, p, q));
    }
}
