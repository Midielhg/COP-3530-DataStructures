import java.util.Random;

public class Prog08_02{
    public static void main(String args[]){
        final int SIZE = 10;
        int[] a = new int[SIZE];

        //Fill the array with random numbers
        Random rand = new Random();
        for (int i =0; i < a.length; i++){
            a[i] = rand.nextInt(100);
        }

        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }

        System.out.println();

        //Min. max and average
        int sum = 0 , min = a[0], max = a[0];
        for (int i  = 0; i < a.length; i ++){
            sum = sum + a[i];
            
            if (min > a [i]) min = a [i];
            if (max < a [i]) max = a [i];
        }

        double ave = sum/SIZE;

        System.out.println("\nMin: " + min + "\nAve: " + ave + " max: " + max);





    }
}