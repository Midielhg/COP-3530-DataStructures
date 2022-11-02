/**
* @author A. Hernandez
* Data Structures and Algorithms
* Modified by: Midiel Henriquez
*/
public class BinarySearchTree
{
    public BinarySearchTree()
    {
        root = new Node();        //dummy node as the root
        root.setLeftChild(null);
        root.setRightChild(null);
        root.setInfo(-1);
    }

    public boolean isEmpty()
    {
        return root.getLeftChild() == null;
    }

    public void display()
    {
        inorderDisplay(root.getLeftChild());
        System.out.println();
    }

    public boolean contains(int x)
    {
        return search(x, root.getLeftChild());
    }

    public void add(int x)
    {
        if (root.getLeftChild() == null)
        {
            Node p = new Node();
            p.setNode(x, null, null);
            root.setLeftChild(p);
        } else
            insert(x, root.getLeftChild());
    }

    public int getMin()
    {
        return getMin(root);
    }

    private Node root;    //root of the bst; implemented as a dummy node.

    private void inorderDisplay(Node p)
    {
        if (p != null)
        {
            inorderDisplay(p.getLeftChild());
            System.out.print(p.getInfo() + " ");
            inorderDisplay(p.getRightChild());
        }
    }

    private boolean search(int x, Node p)
    {
        if (p == null)
            return false;
        else if (x == p.getInfo())
            return true;
        else if (x < p.getInfo())
            return search(x, p.getLeftChild());
        else
            return search(x, p.getRightChild());
    }

    private void insert(int x, Node p)
    {
        if (x < p.getInfo())
            if (p.getLeftChild() == null)
            {
                Node q = new Node();
                q.setNode(x, null, null);
                p.setLeftChild(q);
            } else
                insert(x, p.getLeftChild());
        else if (p.getRightChild() == null)
        {
            Node q = new Node();
            q.setNode(x, null, null);
            p.setRightChild(q);
        } else
            insert(x, p.getRightChild());
    }

    private int getMin(Node p)
    {
        if (p.getLeftChild() == null)
            return p.getInfo();
        else
            return getMin(p.getLeftChild());
    }

    private String toString(Node p)
    {
        if (p == null){
            return "";
        }else{
            return toString(p.getLeftChild()) + " " + p.getInfo() + " " + toString(p.getRightChild());
        }

    }
    //add a getHight to be BinarySearchTree class to cpmpute the height of the tree
    public int getHeight(){
        return getHeight(root.getLeftChild());
    }

    private int getHeight(Node p){
        if (p == null){
            return -1; //if counting nodes and not edges then return 0
        }else{
            return 1 + Math.max(getHeight(p.getLeftChild()), getHeight(p.getRightChild()));
        }
    }

    //add a getCount method to the BinarySearchTree class that determines the number of elements stored in the tree
    public int getCount(){
        return getCount(root.getLeftChild());
    }

    private int getCount(Node p){
        if (p == null){
            return 0;
        }else{
            return 1 + getCount(p.getLeftChild()) + getCount(p.getRightChild());
        }
    }

    //Add a count(int x) method to the BinarySearchTree class that determines the numbers of occurence of x in the tree
    public int count(int x){
        return count(x, root.getLeftChild());
    }

    private int count(int x, Node p){
        if (p == null){
            return 0;
        }else if (x == p.getInfo()){
            return 1 + count(x, p.getRightChild());
        }else if (x < p.getInfo()){
            return count(x, p.getLeftChild());
        }else{
            return count(x, p.getRightChild());
        }


    }

    //Add a getMax method to the BinarySearchTree clas that finds the maximum value stored in the tree
    public int getMax(){
        return getMax(root.getLeftChild());
    }

    private int getMax(Node p){
        if (p.getRightChild() == null){
            return p.getInfo();
        }else{
            return getMax(p.getRightChild());
        }
    }

    
    //main
    public static void main(String[] args)
    {
        BinarySearchTree bst = new BinarySearchTree();
        for (int i = 1; i < 100; i++)
            bst.add((int) (Math.random() * 10));
       
        
        System.out.println();
        bst.display();
        System.out.println("It contains 5: " + bst.contains(5));
        System.out.println("It contains 9: " + bst.contains(9));
        System.out.println("Min value on the tree: " + bst.getMin());
        System.out.println(bst.toString());
        System.out.println("the height of the tree is: " + bst.getHeight());
        System.out.println("the number of elements in the tree is: " + bst.getCount());
        System.out.println("the number of occurence of 5 in the tree is: " + bst.count(5));
        System.out.println("the maximum value in the tree is: " + bst.getMax());
        System.out.println();
    }
}
