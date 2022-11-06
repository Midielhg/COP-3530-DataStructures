//Midiel Henriquez 
//Panther id 6352217

import java.util.Random;

public class SearchingAlgorithms {//
    public static boolean sequentialSearch(int[] list, int x) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == x) {
                return true;
            }
        }
        return false;
    }

    public static boolean binarySearch(int[] list, int x) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (x < list[mid]) {
                high = mid - 1;
            } else if (x == list[mid]) {
                return true;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }

    //quick sort
    public static void quickSort(int[] list){
        quicksort(list, 0, list.length - 1);
    }

    private static void quicksort(int[] list, int begin, int end){
        int temp;
        int pivot = findPivotLocation(begin, end);
        // swap list[pivot] and list[end]
        temp = list[pivot];
        list[pivot] = list[end];
        list[end] = temp;
        pivot = end;
        int i = begin,
        j = end - 1;
        boolean iterationCompleted = false;
        while (!iterationCompleted){
            while (list[i] < list[pivot])
                i++;
            while ((j >= 0) && (list[pivot] < list[j]))
                j--;
            if (i < j){
                //swap list[i] and list[j]
                temp = list[i];
                list[i] = list[j];
                list[j] = temp;
                i++;
                j--;
            } else
                iterationCompleted = true;
        }

        //swap list[i] and list[pivot]
        temp = list[i];
        list[i] = list[pivot];
        list[pivot] = temp;

        if (begin < i - 1) quicksort(list, begin, i - 1);
        if (i + 1 < end) quicksort(list, i + 1, end);
    }

    //computes the pivot
    private static int findPivotLocation(int b, int e){
        return (b + e) / 2;
    }

    public static void fillArray(int[] list, int range) {
        Random random = new Random();
        for (int i = 0; i < list.length; i++) {
            list[i] = random.nextInt(range);
        }
    }

    public static void printArray(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
}