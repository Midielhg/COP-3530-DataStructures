/*Design an algorithm that, given a collection of integers in an unsorted array, determines the secon smallest number (or second minimuim)

for example, if the array consist of the values 
    12, 23, 9, 17, 3
    the algorithm should repost the value 9

 */
public class Prog10_04 {
    public static void main(String[] args) {
        int[] list = new int[5];
        fillArray(list);
        printArray(list);
        int secondSmallest = secondSmallest(list);
        System.out.println("The second smallest number is: " + secondSmallest);
    }

    public static void fillArray(int[] list) {
        for (int i = 0; i < list.length; i++) {
            list[i] = (int)(Math.random() * 100);
        }
    }

    public static void printArray(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }

    public static int secondSmallest(int[] list) {
        int smallest = list[0];
        int secondSmallest = list[0];
        for (int i = 0; i < list.length; i++) {
            if (list[i] < smallest) {
                secondSmallest = smallest;
                smallest = list[i];
            } else if (list[i] < secondSmallest) {
                secondSmallest = list[i];
            }
        }
        return secondSmallest;
    }

    
    
}
