/*
Consider the list of numbers 
    7, 2, 9, 11, 13, 1, 26, 4

    a) insert them all in an empty heap
    b) run the operation removeMin 8 time (heap should be empty after that)

Show the healp (binary tree) thet results at each step.
*/


public class Prog24 {
    public static void main(String[] args){
        int[] numbers = {7, 2, 9, 11, 13, 1, 26, 4};//array of numbers
        Heap heap = new Heap();//create a new heap
        for (int i = 0; i < numbers.length; i++){//loop to insert numbers
            heap.insert(numbers[i]);//insert numbers
        }
        System.out.println("Heap after inserting all numbers: " + heap);//print heap
        for (int i = 0; i < numbers.length; i++){//loop to remove numbers
            heap.removeMin();//remove numbers
            System.out.println("Heap after removing " + (i + 1) + " numbers: " + heap);//print heap
        }
    }

    public static class Heap {
        private int[] heap;//array to store heap
        private int size;//size of the heap

        public Heap(){//constructor
            heap = new int[10];//initialize array
            size = 0;//initialize size
        }

        public void insert(int value){//insert method
            if (size == heap.length){//if heap is full
                growArray();//grow array
            }
            heap[size] = value;//insert value
            size++;//increment size
            bubbleUp();//bubble up
        }

        public int removeMin(){//remove min method
            int min = heap[0];//store min value
            heap[0] = heap[size - 1];//move last value to first
            size--;//decrement size
            bubbleDown();//bubble down
            return min;//return min value
        }

        public void bubbleUp(){//bubble up method
            int index = size - 1;//index of last value
            while (index > 0 && heap[index] < heap[(index - 1) / 2]){//while value is less than parent
                swap(index, (index - 1) / 2);//swap value with parent
                index = (index - 1) / 2;//update index
            }
        }

        public void bubbleDown(){//bubble down method
            int index = 0;//index of first value
            while (index * 2 + 1 < size){//while there is a child
                int child = index * 2 + 1;//index of left child
                if (child + 1 < size && heap[child + 1] < heap[child]){//if right child is smaller
                    child++;//update child
                }
                if (heap[index] > heap[child]){//if value is greater than child
                    swap(index, child);//swap value with child
                    index = child;//update index
                } else {
                    break;//break out of loop
                }
            }
        }

        public void swap(int index1, int index2){//swap method
            int temp = heap[index1];//store value at index1
            heap[index1] = heap[index2];//move value at index2 to index1
            heap[index2] = temp;//move value at index1 to index2
        }

        public void growArray(){//
            int[] temp = new int[heap.length * 2];//create new array
            for (int i = 0; i < heap.length; i++){//loop to copy values
                temp[i] = heap[i];//copy values
            }
            heap = temp;//update heap
        }

        public String toString(){//toString method
            String str = "";//string to store heap
            for (int i = 0; i < size; i++){//loop to add values to string
                str += heap[i] + " ";//add values to string
            }
            return str;//return string
        }
    }    
}