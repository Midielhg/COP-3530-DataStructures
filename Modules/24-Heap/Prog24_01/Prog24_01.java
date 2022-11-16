import java.util.Arrays;

//implement the heapSort algorithm

public class Prog24_01{
    //main method
    public static void main(String[] args){
        int[] a = {7, 2, 9, 11, 13, 1, 26, 4};
        int[] b = new int[a.length];
        heapSort(a, b);
        System.out.println("Sorted array:" + Arrays.toString(b));
    }

    //heapSort method
    public static void heapSort(int[] a, int[] b){
        int n = a.length;
        int[] c = new int[n + 1];
        for(int i = 0; i < n; i++){
            c[i + 1] = a[i];
        }
        for(int i = n / 2; i > 0; i--){
            heapify(c, i, n);
        }
        for(int i = n; i > 0; i--){
            b[i - 1] = c[1];
            c[1] = c[i];
            heapify(c, 1, i - 1);
        }
    }

    private static void heapify(int[] c, int i, int n) {
    }

    
}