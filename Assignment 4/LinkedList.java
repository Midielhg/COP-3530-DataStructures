
/**
 * The class LinkedList implements a singly linked list of ElementType
 * The list uses a header (dummy) node.
 *
 * @author Midiel Henriquez     PID:6352217     Class Section: U01
 */
public class LinkedList{

    private Node first; // dummy header node

    /**
     * Default constructor. Sets this object as an empty list.
     *
     */
    public LinkedList()
    {   
        first = new Node();
    }

    /**
     * Adds new element as the first element of the list.
     *
     * @param x element to be added to the list
     */
    public void add(ElementType x)
    {
        Node newNode = new Node();
        newNode.setInfo(x);
        newNode.setNext(first.getNext());
        first.setNext(newNode);
    }

    /**
     * Determines if linked list is empty.
     *
     * @return true if list contains no elements, false otherwise.
     */
    public boolean isEmpty()
    {   
        return first.getNext() == null;
    }

    /**
     * Removes given element from the list.
     *
     * @param x element to be removed
     */
    public void remove(String x)
    {
        Node current = first.getNext();
        Node previous = first;
        while(current != null && !current.getInfo().identifier.equals(x))
        {
            previous = current;
            current = current.getNext();
        }
        if(current != null)
        {
            previous.setNext(current.getNext());
        }
    }

    /**
     * Determines if a given element is in the list.
     *
     * @param x element to be searched
     * @return true if x is in the list, false otherwise
     */
    public boolean search(String x)
    {
        Node current = first.getNext();
        while(current != null && !current.getInfo().identifier.equals(x))
        {
            current = current.getNext();
        }
        return current != null;
    }

    /**
     * Constructs a String description of the list.
     *
     * @return String containing the list elements.
     */
    public String toString() {
        Node current = first.getNext();

        String str = "";
        while (current != null) {
            str += current.getInfo() + " -> ";
            current = current.getNext();
        }

        return str;
    }

}
