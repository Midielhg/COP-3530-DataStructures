//not finished properly

public class Prog19_01 {
    public static void main(String[] args) {
       
        int[] list = { 5, 1, 4, 2, 8 };
        bubbleSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }

    public static void bubbleSort(int[] list) {
        int n = list.length;
        //int temp = 0;
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (list[j] > list[j+1]){
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }
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
}

