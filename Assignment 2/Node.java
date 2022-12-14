
/**
 * Implements the node of a doubly linked list of integers.
 *
 * @author Midiel Henriquez PID:6352217
 */
public class Node
{

    private int info;
    private Node next;
    private Node prev;

    public Node()
    {
        info = 0;
        next = null;
        prev = null;
    }

    public int getInfo()
    {
        return info;
    }

    public Node getNext()
    {
        return next;
    }

    public Node getPrev()
    {
        return prev;
    }

    public void setInfo(int i)
    {
        info = i;
    }

    public void setNext(Node n)
    {
        next = n;
    }

    public void setPrev(Node p)
    {
        prev = p;
    }

}
