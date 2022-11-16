
/**
 * The class Deque implements a double-ended queue with a doubly linked list.
 * The list uses a header and a trailer (dummy) nodes.
 *
 * @author Midiel Henriquez PID:6352217
 */
public class Deque
{

    /**
     * Default constructor. Sets this object as an empty deque.
     *
     */
    public Deque()
    {
        
    }

    /**
     * Adds new element to the back end of the deque. The method takes O(1)
     * time.
     *
     * @param x new element to be added to the deque.
     */
    public void addToBack(int x)
    {
     
    }

    /**
     * Adds new element to the front end of the deque. The method takes O(1)
     * time.
     *
     * @param x new element to be added to the deque.
     */
    public void addToFront(int x)
    {
    
    }

    /**
     * Retrieves element on the back end of the deque. The method takes O(1)
     * time.
     *
     * @return operation is successful: valid = true and item = element on the
     * back end; operation is unsuccessful (i.e. empty deque): valid = false and
     * item = dummy value
     */
    public DequeItem getBack()
    {
     
    }

    /**
     * Retrieves element on the front end of the deque. The method takes O(1)
     * time.
     *
     * @return operation is successful: valid = true and item = element on the
     * front end; operation is unsuccessful (i.e. empty deque): valid = false and
     * item = dummy value
     */
    public DequeItem getFront()
    {
      
    }

    /**
     * Determines if deque is empty. The method takes O(1) time.
     *
     * @return true if deque contains no elements, false otherwise.
     */
    public boolean isEmpty()
    {
        return count == 0;
    }

    /**
     * Removes element on the back end of the deque. The method takes O(1) time.
     *
     * @return false if removal cannot be performed (i.e. the deque is empty),
     * true otherwise
     */
    public boolean removeBack()
    {
        if (count == 0)
        {
            return false;
        }
        else
        {
            back.getPrev().getPrev().setNext(back);
            back.setPrev(back.getPrev().getPrev());
            count--;
            return true;
        }
    }

    /**
     * Removes element on the front end of the deque. The method takes O(1)
     * time.
     *
     * @return false if removal cannot be performed (i.e. the deque is empty),
     * true otherwise
     */
    public boolean removeFront()
    {
        if (count == 0)
        {
            return false;
        }
        else
        {
            front.getNext().getNext().setPrev(front);
            front.setNext(front.getNext().getNext());
            count--;
            return true;
        }
    }

    /**
     * Constructs a String description of the deque.
     *
     * @return String containing the deque elements.
     */
    public String toString()
    {
        String str = "";

        Node current = front.getNext();
        for (int i = 0; i < count - 1; i++)
        {
            str += current.getInfo() + ", ";
            current = current.getNext();
        }

        if (count != 0)
            return "Deque: [" + str + back.getPrev().getInfo() + "]";
        else
            return "Deque: []";
    }

    private int count;  //number of elements in the deque
    private Node back;  //points to the item in the back
    private Node front; //points to the item in the front
}
