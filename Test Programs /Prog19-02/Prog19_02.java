public class Prog19_02 {
    public static void main(String[] args){
        //array list of 1000 randmo numbers
        int[] list = new int[1000];

        fillArray(list);
        System.out.println("Before sorting:");
        //printArray(list);
        insertionSort(list);
        System.out.println("After sorting:");
        printArray(list);
    }   
    
    public static void insertionSort(int[] list){
        for (int i = 1; i < list.length; i++){
            int temp = list[i];
            int j = i - 1;
            while (j >= 0 && list[j] > temp){
                list[j + 1] = list[j];
                j = j - 1;
            }
            list[j + 1] = temp;
        }
    }

    public static void fillArray(int[] list) {
        for (int i = 0; i < list.length; i++) {
            list[i] = (int)(Math.random() * 1000);
        }
    }

    public static void printArray(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}
