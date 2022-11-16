/*
 * Write a Java progeam that merges two sorted lists. Both sorted lists are stored in the same array. 
 */
 
public class Prog19_5 {

    public static void main(String[] args) {
        //array list of 100 sorted numbers
        int[] list = new int[100];
        fillArray(list);
        mergeSort(list);
        printArray(list);
    }

    public static void fillArray(int[] list) {
        for (int i = 0; i < list.length; i++) {
            list[i] = (int)(Math.random() * 1000);
        }
    }

    public static void mergeSort(int[] list){
        mergeSort(list, 0, list.lenght -1);
    }
    
    public static void mergeSort(int[] list, int begin, int end){
        if (begin < end){
            int mid = (begin + end) /2;

            mergeSort(list, begin, mid);
            mergeSort(list, mid + 1, end);
            merge(list, begin, mid, end);
        }
    }

    public static void printArray(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}
