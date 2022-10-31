//Implement and test binary search 

import java.util.Scanner;

public class Prog20_01
{
    public static void main(String[] args)
    {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key;
        int index;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to search for: ");
        key = input.nextInt();
        index = binarySearch(a, key);
        if (index == -1)
            System.out.println("The number " + key + " was not found.");
        else
            System.out.println("The number " + key + " was found at index " + index);
    }

    public static int binarySearch(int[] a, int key)
    {
        int low = 0;
        int high = a.length - 1;
        int mid;
        while (low <= high)
        {
            mid = (low + high) / 2;
            if (key == a[mid])
                return mid;
            else if (key < a[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }
}