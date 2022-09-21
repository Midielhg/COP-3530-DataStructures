public class Queue
{

    public Queue()
    {
        size = 100;
        list = new char[size];

        front = 0;
        back = size - 1;

        count = 0;
    }

    public Queue(int s)
    {
        size = s;
        list = new char[size];

        front = 0;
        back = size - 1;

        count = 0;
    }

    public void enqueue(char c)
    {
        if(isEmpty())
        {
            back = (back + 1) % size;
            list[back] = c;
            count++;
        }
        else
        {
            System.out.println("The queue is full");
        }
       
    }

    public void dequeue()
    {
        if (isEmpty())
        {
            front = (front + 1) % size;
            count--;
        }
        else
        {
            System.out.println("The queue is empty");
        }
        
    }

    public char getFront()
    {
        if(isEmpty())
        {
            return list[front];
        }
        else
        {
            System.out.println("The queue is empty");
            return ' ';
        }

    }

    public boolean isEmpty()
    {
        return count == 0;
    }

    private char[] list;
    private int size;
    private int count;
    private int front, back;
}
