/*
 * implement a recursive method that writes a given array backwards
 */
public class Prog17_04 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printBackwards(a, a.length - 1);
    }
    public static void printBackwards(int[] a, int i) {
        if (i >= 0) {
            System.out.println(a[i]);
            printBackwards(a, i - 1);
        }
    }
    
}
