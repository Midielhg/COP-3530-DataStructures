import java.util.Stack;

public class Prog15_01
{

    public static void main(String[] args)
    {
        Stack s = new Stack();

        //insertion
        for (int i = 0; i < 10; i++)
        {
            int x = 32 + (int) (Math.random() * 95);
            System.out.println(x + " --> " + (char) x);
            s.push((char) x);
        }

        //removal and display
        for (int i = 0; i < 10; i++)
        {
            System.out.println("Item at the top: " + s.peek());

            s.pop();
        }

        System.out.println("\n");

        //push
        s.push('A');

        //peek
        System.out.println("Item at the top: " + s.peek());


    }

    //write a method print in the tester class that displays all of the objects in a stack in the order in which tehy were pushed onyo the stack 
    //public void print(Stack s)
    public void print(Stack s){
        Stack temp = new Stack();
    
        //Copying the contect of s into temp
        while(!s.isEmpty()){
            temp.push(s.peek());
            s.pop();
        }
    
        //printing temp and inserging items back in s 
        while(!temp.isEmpty()){
            System.out.println(temp.peek() + " ");
            s.push(temp.peek());
            temp.pop();
        }
        System.out.println();
    }
}