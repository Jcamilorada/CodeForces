package data_structures.tree;


import org.junit.Test;

/**
 * testsuite for {@link BinaryTreeTest}
 *
 * @author Juan Rada
 *
 */
public class BinaryTreeTest
{
    @Test
    public void testAdd()
    {
        BinaryTree<Integer> tree = new BinaryTree<>();
        tree.addNode(4);
        tree.addNode(2);
        tree.addNode(1);
        tree.addNode(6);
        tree.addNode(7);
        tree.addNode(4);
    }
}