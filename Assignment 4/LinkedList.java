
/**
 * The class LinkedList implements a singly linked list of ElementType
 * The list uses a header (dummy) node.
 *
 * @author (add here full name(s), Panther ID(s), and class section(s))
 */
public class LinkedList{

    private Node first; // dummy header node

    /**
     * Default constructor. Sets this object as an empty list.
     *
     */
    public LinkedList()
    {
    }

    /**
     * Adds new element as the first element of the list.
     *
     * @param x element to be added to the list
     */
    public void add(ElementType x)
    {
    }

    /**
     * Determines if linked list is empty.
     *
     * @return true if list contains no elements, false otherwise.
     */
    public boolean isEmpty()
    {
    }

    /**
     * Removes given element from the list.
     *
     * @param x element to be removed
     */
    public void remove(String x)
    {
    }

    /**
     * Determines if a given element is in the list.
     *
     * @param x element to be searched
     * @return true if x is in the list, false otherwise
     */
    public boolean search(String x)
    {
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
