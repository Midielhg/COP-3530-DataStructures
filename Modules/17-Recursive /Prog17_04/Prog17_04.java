/*
 * implement a recursive method that writes a given array backwards
 */
public class Prog17_04 {
    public static void main(String[] args) {
        //create an array from 1 to 100
        int[] a = new int[1000];
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }
        printBackwards(a, a.length - 1);
    }
    public static void printBackwards(int[] a, int i) {
        if (i >= 0) {
            System.out.println(a[i]);
            printBackwards(a, i - 1);
        }
    }
}
