import java.util.Random;
import java.util.Scanner;
import java.util.Date;
import java.util.ArrayList;

public class Prog18_01 {
    public static void main(String[] args) {
        int[] a = new int [100000000];

        Random rnd = new Random();

        for (int i = 0; i < a.length; i++) {
            a[i] = rnd.nextInt();
        }

        Date current = new Date();
        long start = current.getTime();
        
        int min = minimum(a, a.length);

        current = new Date();
        long stop = current.getTime();

        System.out.println("Minimum: " + min);
        System.out.println("Time: " + (stop - start) + " milliseconds");
    }

    public static int minimum(int[] a, int n) {
        int min = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }
}