package data_structures.tree;

/**
 * Implementatation of a sorted binary tree.
 *
 * @author Juan Rada
 *
 */
public class BinaryTree<T extends Comparable>
{
    private Node<T> root;

    public void addNode(T data)
    {
        if (root == null)
        {
            root = new Node(data);
        }

        else
        {
            addTo(root, data);
        }
    }

    public void removeNode(T data)
    {
        if (root != null)
        {
            root.remove(null, data);
        }
    }

    private void addTo(Node<T> node, T data)
    {
        if (node.data.compareTo(data) > 0)
        {
            if (node.leftNode == null)
            {
                node.leftNode = new Node(data);
            }

            else
            {
                addTo(node.leftNode, data);
            }
        }
        else
        {
            if (node.rightNode == null)
            {
                node.rightNode = new Node(data);
            }

            else
            {
                addTo(node.rightNode, data);
            }
        }
    }

    private class Node<T extends Comparable>
    {
        public T data;
        public  Node<T> rightNode;
        public  Node<T> leftNode;

        private Node(T data)
        {
            this.data = data;
        }

        private void remove(Node<T> parent, T data)
        {
            int comparison = data.compareTo(data);

            if (comparison == 0)
            {
                if (rightNode != null && leftNode != null)
                {
                    this.data = minValue();
                    rightNode.remove(this, this.data);
                }

                else if (parent.leftNode == this)
                {
                    parent.leftNode = leftNode == null ? leftNode : rightNode;
                }

                else if (parent.rightNode == this)
                {
                    parent.rightNode = leftNode == null ? leftNode : rightNode;
                }
            }

            else if (comparison > 0)
            {
                rightNode.remove(this, data);
            }

            else if (comparison < 0)
            {
                rightNode.remove(this, data);
            }
        }

        private T minValue()
        {
            return leftNode == null ? data : leftNode.minValue();
        }
    }
}
